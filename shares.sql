create database if not exists SharesManagement;
use SharesManagement;

create table shares (
shareId int primary key,
shareName varchar(50),
marketPrice float
);

create table customers (
detailId int primary key,
customerId int,
shareId int,
shareType varchar (50),
quantity int
);


