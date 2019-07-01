use ExamProject;
create table Commerce 
(
Qno int primary key , 
Question varchar (100), 
Option1 varchar(100),
Option2 varchar(100), 
Option3 varchar(100), 
Option4 varchar(100), 
CorrectAnswer int
);

select * from Commerce;
-- truncate table Commerce;

insert into Commerce values
(1,'Bonus Shares are issued to–',
'1. Equity Shareholders','2. Preference Shareholders','3. Debenture Holders','4. Secured Creditors',1);

insert into Commerce values
(2,'Liability of a Company Secretary is–',
'1. Contractual only','2. Statutory only ','3. Civil only','4. Both contractual and statutory', 4);

insert into Commerce values
(3,'Standard costing is a technique of–',
'1. Planning ','2. Organising ','3. Coordination','4. Control',4);

insert into Commerce values
(4,'Audit adopted by banking company is–',
'1. Continuous Audit','2. Periodical Audit','3. Internal Audit','4. Balance Sheet Audit', 1);

insert into Commerce values
(5,'Goodwill is–',
'1. Floating Asset','2. Wasting Asset','3.  Fictitious Asset','4. Intangible Asset',4);

insert into Commerce values
(6,'Consumers cooperative store is set up by the–',
'1. Central Government','2. State Government','3. Registrar of Cooperative Societies ','4. Members', 4);

insert into Commerce values
(7,'Which one of the following transactions changes the current ratio ?',
'1. Purchase of goods for cash','2. Plant acquired on account','3. Sold goods on credit','4. Debentures converted into equity capital',1 );

insert into Commerce values
(8,'The registering authority of L.L.P. will be—',
'1. Registrar of firms','2. Registrar of Companies','3. Registrar of Universities ','4. None of the above', 3);

insert into Commerce values
(9,'M.B.O. is a technique of–',
'1. Planning only','2. Controlling only','3. Neither planning nor controlling','4. Both planning and controlling',2 );

insert into Commerce values
(10,'Pre-incorporation Profit is transferred to–',
'1. General Reserve','2. Capital Reserve','3. Profit and Loss A/c','4. Trading A/c',2 );