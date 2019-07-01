use ExamProject;
create table Science 
(
Qno int primary key , 
Question varchar (100), 
Option1 varchar(100),
Option2 varchar(100), 
Option3 varchar(100), 
Option4 varchar(100), 
CorrectAnswer int
);

select * from Science;
truncate table Science;

insert into Science values
(1,'Which among the following waves is used for communication by artificial satellites?',
'1. The frequency of 101 series','2. Radio Waves','3. A.M.','4. Microwaves',4);

insert into Science values
(2,'When speed of car is doubled then what should be the braking force of car to stop it?',
'1. 2 times','2. 4 times','3. 1/2','4. 1/4',2);

insert into Science values
(3,'The mass of a star is two times the mass of the Sun. How will it come to an end?',
'1. Neutron Star','2.  Blackhole','3. White Dwarf','4. Red Giant',1);

insert into Science values
(4,'Which one of the following metals pollutes the air of a city having a large number of automobiles?',
'1. Cadmium','2.  Chromium','3. Lead','4. Copper',3);

insert into Science values
(5,'Milk of Magnesia is a suspension of:','1. magnesium sulphate','2. magnesium carbonate',
'3. magnesium hydroxide','4. magnesium chloride',3);

insert into Science values
(6,'In which of the following substances all carbon atoms are quaternary in nature?',
'1. Graphite','2. Diamond','3. Teflon','4. Naphthalene',2);

insert into Science values
(7,'The ratio of pure gold in 18-carat gold is:','1. 60%','2. 75%','3. 80%','4. 90%',2);

insert into Science values
(8,'The colour of the eye depends upon the pigment present inside?','1. cornea','2. iris','3. rods','4. cones',2);

insert into Science values
(9,'The number of chromosomes present in a normal human being is?','1. 23','2. 46','3. 22','4. 48',2);

insert into Science values
(10,'The disease that is caused by the virus is?','1. Typhoid','2. Cholera','3. Common Cold','4. Tetanus',3);
