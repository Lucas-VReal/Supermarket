create database supermarket;

update supermarket set name = supermarketdb;

use supermarketdb;

create table produtos (
product_id integer not null primary key auto_increment,
product_tipe varchar (255) not null,
product_name varchar (255) not null 
);

select * from produtos;

alter table produtos
	change product_tipe product_type varchar(255) not null;
    
alter table produtos
	change product_type product_type varchar(255);

insert into produtos (product_name) values ('Maçã'), ('Pneu');

update produtos set product_type = 'alimento' where product_id = 1;

update produtos set product_type = 'Automotivo' where product_id = 2;
    