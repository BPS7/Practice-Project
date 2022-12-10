use velocity;
Create table Customers4(
Customerid int primary key,
Cname varchar(255)unique not null ,
Lname varchar(255)not null,
Csalary int not null,
City varchar(255)not null

);
insert into Customers4(Customerid,Cname,Lname,Csalary,City)
Values (1,'rahul','Kawale',4500,'Pune');
insert into Customers4(Customerid,Cname,Lname,Csalary,City)
Values (2,'Ujwala','Tambe',55000,'Mumbai');
insert into Customers4(Customerid,Cname,Lname,Csalary,City)
Values (3,'Nikhil','Deshmukh',95000,'Latur');
insert into Customers4(Customerid,Cname,Lname,Csalary,City)
Values (4,'Ajay','Dimble',35000,'Amravati');
insert into Customers4(Customerid,Cname,Lname,Csalary,City)
Values (5,'chintu','Dimble',35000,'goa');
select*from Customers4;
drop table Customers4;
Create table order2(
Orderid int,
Oname varchar(255),
Customerid int, foreign key (Customerid) references Customers4(Customerid)
);

insert into order2(Orderid,Oname,Customerid)
values(101,'Nokia',2);
insert into order2(Orderid,Oname,Customerid)
values(102,'Apple',3);
insert into order2(Orderid,Oname,Customerid)
values(103,'Samsung',4);
insert into order2(Orderid,Oname,Customerid)
values(104,'Oneplus',5);
select *from order2;
truncate order2;
drop table order2;
/*Inner join*/ 
Select Cname,Csalary,City,Oname,Orderid 
from customers4 inner join order2
on Customers4.customerid=order2.customerid;
/*left join*/
Select Cname,Csalary,City,Oname,Orderid 
from customers4 left join order2 
on Customers4.customerid=order2.customerid;
/*right join*/
Select Cname,Csalary,City,Oname,Orderid 
from customers4 right join order2 
on Customers4.customerid=order2.customerid;
/* this will only gives the headings of table*/
Select  *from Customers4 join order2 
on Customers4.Customerid=order2.Customerid and not order2.Customerid ;
Select  *from Customers4 join order2 
on Customers4.Customerid=order2.Customerid ;
/*this step will join table but give customerid 2 time in table*/
Select  *from Customers4 join order2 
on Customers4.Customerid=order2.Customerid ;
/* join two tables*/
Select Cname,Csalary,City,Oname,Orderid 
from customers1 join order2 
on Customers1.customerid=order2.customerid;



--- alieses 
Select Csalary AS c from customers1;







