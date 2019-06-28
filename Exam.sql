create database ExamProject;
use ExamProject;


-- Creating table for storing details
CREATE TABLE StudentDetails (
    StudentId int auto_increment PRIMARY KEY,
    StudentName varchar(50) NOT NULL,
    Email varchar(50),
    Stream varchar(20),
    Marks float
);

TRUNCATE TABLE StudentDetails;
ALTER TABLE StudentDetails
ADD UserPassword int;

select * from StudentDetails;
select UserPassword from StudentDetails where StudentId=2;



-- Store Procedure format
-- CREATE PROCEDURE SelectAllCustomers @City nvarchar(30), @PostalCode nvarchar(10)
-- ASip
-- SELECT * FROM Customers WHERE City = @City AND PostalCode = @PostalCode
-- GO;

DELIMITER //;
create procedure inputDetails(in ipStudentName varchar(50), in ipEmail varchar(50),in ipUserPassword int)
BEGIN
insert into StudentDetails(StudentName,Email,UserPassword) values(ipStudentName,ipEmail,ipUserPassword);
END


CALL inputDetails('vivek','vvek@gddmai.com','fdf') 
DELIMITER //;StudentDetails


CALL inputDetails('sf','v@',36) 
DELIMITER //;

select Email from StudentDetails