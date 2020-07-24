drop database app_contact
go
create database app_contact
go
use app_contact
go

create table customer(
 ID int primary key not null,
 fullname nvarchar(50) not null,
 phone int not null,
 address nvarchar(50) not null,
 email nvarchar(50) not null

)
go
insert into customer(ID,fullname,phone,address,email) values(1,'Teo',0303030303,'Quan 10','teo@gmail.com');
insert into customer(ID,fullname,phone,address,email) values(2,'To',0123456789,'thu duc','to@gmail.com');
insert into customer(ID,fullname,phone,address,email) values(3,'Tin',89898989,'Quan 1','tin@gmail.com');




SELECT * FROM customer