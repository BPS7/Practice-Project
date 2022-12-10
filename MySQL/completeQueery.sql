create database IBM;
create table Employe_(
ID int primary key unique,
Name_ varchar(255),
Slaray_ int not null,
Department_ varchar(255)
);
insert into Employe_(ID,Name_,Slaray_,Department_)
values(1,'sumit',5000,'Tester');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(2,'nitin',2000,'civil');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(3,'shyam',3000,'devloper');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(4,'anil',4000,'je');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(5,'mankesh',5000,'je');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(6,'Dheeraj',6000,'buisness');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(7,'AnilP',7000,'Houseman');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(8,'Swaraj',8000,'civil');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(9,'samarth',9000,'devop');
insert into Employe_(ID,Name_,Slaray_,Department_)
values(10,'Abhinav',10000,'Team lead');
select*from Employe_;
alter table Employe_ add city varchar(255);
update  Employe_ set city ='Chhatarpur' where id=2;
alter table Employe_ drop column city;
drop table Employe_;
truncate Employe_;
describe Employe_;
Delete from Employe_ where Slaray_=5000;
Select * from Employe_ where Slaray_=10000;
/*Logical operator*/
Select * from Employe_ where fname='Rahul' and Slaray_=16;
Select * from Employe_ where fname='Rahul' OR Slaray_=17;
select * from Employe_ where not mockmarks=16;
/*Airthmetic operator*/
Select Slaray_+2 from Employe_;
Select Slaray_-2 from Employe_;
Select Slaray_*2 from Employe_;
Select Slaray_/2 from Employe_;
Select Slaray_%2 from Employe_;
/*Comparision operator*/
Select * from Employe_ where Slaray_=5000;
Select * from Employe_ where Slaray_!=10000;
Select * from Employe_ where Slaray_>6000;
Select * from Employe_ where Slaray_<1000;
Select * from Employe_ where Slaray_<=1000;
Select * from Employe_ where Slaray_>=1000;
/*like*/
Select * from Employe_ where Name_ like '%j';/*end with  'j'*/
Select * from Employe_ where Name_ like 'a%';/* start with 'a'*/
Select * from Employe_ where Name_ like '%n%';/*in between letter is 'n'*/
Select * from Employe_ where Name_ like '_a%';/*second letter start is 'a'*/
Select * from Employe_ where Name_ like '%s_';/*second last letter  is 's'*/
Select * from Employe_ where Name_ like 's%t';/*start with 's' and end with 't'*/
/*-- Between Operator*/
Select * from Employe_ where Slaray_ between 5000 and 10000;
/*-- Not Between Operator*/
Select * from Employe_ where Slaray_ not between 5000 and 6000;
/*--Distinct Keyw-It is used to show the unique values from the table ,*/
select Distinct Slaray_ from Employe_;
/*--Top clause/Rownum Clause( top clause not run in oracle)-It is used to limit the number of rows returned by a query.*/
Select * from Employe_ where Rownum<=4;
/*--In Operator -The In operator allows you to specify multiple values in a where clause.*/
Select * from Employe_ where Slaray_ in (2000,3000,4000,5000);
/*--Order By clause-It is used to sort the records un your result set in ascending or descending order.*/
Select * from Employe_ order by Slaray_ asc;
Select * from Employe_ order by Slaray_ desc;
/*-Aggregate Function*/
/*--Count – Count is used to count the records from the table.*/
Select count(Name_) from Employe_;
/*--Avg – It shows the average value from the table*/
Select avg(Slaray_) from Employe_;
/*--Sum – It is used for addition of the value.*/
Select sum(Slaray_) from Employe_;
/*--Max- It shows the max value*/
Select max(Slaray_) from Employe_;
/*--Min – It shows the minimum value*/
Select min(Slaray_) from Employe_;
create table Weekoff(
Reason varchar(255),
Days int,
ID int, foreign key (ID) references Employe_(ID)
);
insert into Weekoff(Reason,Days,ID)
values('heath',7,2);
insert into Weekoff(Reason,Days,ID)
values('GF',1,4);
insert into Weekoff(Reason,Days,ID)
values('family',5,6);
insert into Weekoff(Reason,Days,ID)
values('death',4,8);
insert into Weekoff(Reason,Days,ID)
values('meraman',3,10);
select*from  Weekoff;
select ID from Employe_ union select ID from Weekoff;-- give distinct ID 
select ID from Employe_ union all select ID from Weekoff; -- give all ID from both table
-- type of constraint are not null and unique
-- group by
select Department_,max(Slaray_),min(Slaray_) from Employe_ group by Department_;
select ID,max(Slaray_)  from Employe_ group by ID;
select Department_, count(*) from Employe_ group by Department_;
select ID,Department_ ,count(*) from Employe_ group by ID,Department_;
select Department_,count(*) from Employe_ group by Department_ having count(*)>1;
select Slaray_,count(*) from Employe_ group by Slaray_ having sum(Slaray_) >6000;






