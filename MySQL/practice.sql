use velocity;
CREATE TABLE Karamchari
(
    Id int ,
    cName varchar(255),
    Gender varchar(255),
    Salary int,
    Country varchar(255)
);


INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (1,'Mark', 'Male', 5000, 'USA');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (2,'John', 'Male', 4500, 'India');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (3,'Pam', 'Female', 5500, 'USA');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (4,'Sara', 'Female', 4000, 'India');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (5,'Todd', 'Male', 3500, 'India');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (6,'Mary', 'Female', 5000, 'UK');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (7,'Ben', 'Male', 6500, 'UK');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (8,'Elizabeth', 'Female', 7000, 'USA');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (9,'Tom', 'Male', 5500, 'UK');
INSERT INTO Karamchari (Id,cName, Gender, Salary, Country)
VALUES (10,'Ron', 'Male', 5000, 'USA');
select*from Karamchari;
/*highest salary*/
select max(salary) from Karamchari ;
/*2nd highest salary*/
select max(salary) from Karamchari where salary<(select max(salary) from Karamchari);
select max(salary) from Karamchari where salary not in(select max(salary) from Karamchari);
/*3 highest salary*/
select max(salary)from Karamchari where salary < (select max(salary)from Karamchari where salary < (select max(salary)from Karamchari));
/*2nd highest salary  limit 2,1 here 2 means leave two record from starting anf 1 means fetch only one record if give 2 fetch 3 record*/
select salary from Karamchari order by salary desc
limit 1,1;
/*3 highest salary*/
select salary from Karamchari order by salary desc
limit 2,1;


