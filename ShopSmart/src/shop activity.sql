create database shopsmart;

use shopsmart;

 create table items(
	item_id int auto_increment primary key,
	item_name char(50) not null,
    price double not null,
    category char(50) not null
);

create table orders(
	orderid char(8) primary key,
    totalPrice double not null
);