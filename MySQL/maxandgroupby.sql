use velocity;

Create table customers2(
Customerid int ,
Cname varchar(255),
Lname varchar(255),
Dep varchar(255),
Csalary int ,
City varchar(255)

);

insert into Customers2(Customerid,Cname,Lname,Dep,Csalary,City)
Values (1,'rahul','Kawale','f',4500,'Pune');
insert into Customers2(Customerid,Cname,Lname,Dep,Csalary,City)
Values (2,'radhika','Tambe','f',5500,'Mumbai');
insert into Customers2(Customerid,Cname,Lname,Dep,Csalary,City)
Values (3,'nikhil','Deshmukh','HR',9500,'Latur');
insert into Customers2(Customerid,Cname,Lname,Dep,Csalary,City)
Values (4,'sushma','Dimble','HR',3500,'Amravati');
select*from customers2;
select dep,max(Csalary)from customers2 group by Dep
having max(Csalary)>6000;
/* 2nd highest salary*/
select max(Csalary)from customers2 where csalary<(select max(Csalary)from customers2);

  







