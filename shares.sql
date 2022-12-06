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

insert into shares (shareId, shareName, marketPrice)
values (101, 'Apple', 143.73),
;

insert into shares (shareId, shareName, marketPrice)
values(102, 'Tesla', 178.55),
(103, 'Microsoft', 249.57)
;

insert into customers (detailId, customerId, shareId, shareType, quantity)
values (1, 201, 101, 'long-term', 100);

insert into customers (detailId, customerId, shareId, shareType, quantity)
values (2, 201, 102, 'long-term', 50),
(3, 201, 103, 'long-term', 75);

select * from shares;


