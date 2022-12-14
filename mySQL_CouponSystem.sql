create schema CouponSystem;
use CouponSystem;
create table Companies(
ID int primary key auto_increment, 
name varchar(255),
email varchar(255), 
password varchar(255)
);

create table Customers(
ID int primary key auto_increment,
First_Name varchar(255),
Last_Name varchar(255),
Email varchar(255),
password varchar(255)
);

create table Categories(
ID int primary key auto_increment,
Name varchar(255),
Category enum('Food', 'Electricity', 'Restaurants', 'Vacations')
);

insert into Categories values(1, 'Food', 'Food');
insert into Categories values(2, 'Electricity', 'Electricity');
insert into Categories values(3, 'Restaurants', 'Restaurants');
insert into Categories values(4, 'Vacations', 'Vacations');

create table Coupons(
ID int primary key auto_increment,
Company_ID int NOT NULL,
foreign key (Company_ID) references Companies(ID),
Category_ID int NOT NULL,
foreign key (Category_ID) references Categories(ID),
Title varchar(255),
Description varchar(255),
Start_Date date,
End_Date date,
Amount integer,
Price double,
Image varchar(255)
);



create table Customers_VS_Coupons(
Customer_id int NOT NULL,
foreign key (Customer_id) references Customers(ID),
Coupon_id int NOT NULL,
foreign key (Coupon_id) references Coupons(ID)
);


