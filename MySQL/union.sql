use velocity;
Create table Velocity1(
Studentid int,
Fname varchar(255),
Lname varchar(255),
Mockmarks int,
City varchar(255)
);

insert into velocity1(studentid,Fname,Lname,Mockmarks,City)
values (1,'Rahul','Sontakke',16,'Pune');
insert into velocity1(studentid,Fname,Lname,Mockmarks,City)
values (2,'Sonali','More',16,'Latur');
insert into velocity1(studentid,Fname,Lname,Mockmarks,City)
values (3,'Ashish','Kawale',15,'Yavatmal');
insert into velocity1(studentid,Fname,Lname,Mockmarks,City)
values (4,'Monali','Nikose',14,'Mumbai');
insert into velocity1(studentid,Fname,Lname,Mockmarks,City)
values (5,'Suraj','Dokhale',18,'Nashik');
insert into velocity1(studentid,Fname,Lname,Mockmarks,City)
values (6,'Mayuri','Patil',17,'Aurangabad');
select*from velocity1;
Create table velocity2(
Studentid int,
mobileno int,
designation varchar(255),
Salary int,
Company varchar(255)
);
insert into velocity2(studentid,mobileno,designation,Salary,Company)
values (4,986586943,'QA',50000,'IBM');
insert into velocity2(studentid,mobileno,designation,Salary,Company)
values (5,998876543,'Sr.Engg',70000,'Capgemini');
insert into velocity2(studentid,mobileno,designation,Salary,Company)
values (6,978647498,'Test Engg',55000,'Infosys');
insert into velocity2(studentid,mobileno,designation,Salary,Company)
values (7,975889355,'Software Engg',60000,'TCS');
insert into velocity2(studentid,mobileno,designation,Salary,Company)
values (8,985787755,'developer',65000,'Capgemini');
insert into velocity2(studentid,mobileno,designation,Salary,Company)
values (9,897598583,'Sr.QA',80000,'L&T');
select*from velocity2;
Select studentid from velocity1 Union Select studentid from velocity2;
Select studentid from velocity1 Union all Select studentid from velocity2;


