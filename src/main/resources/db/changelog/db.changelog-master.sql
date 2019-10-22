--liquibase formatted sql

--changeset kobe:1

CREATE TABLE users (
    id int primary key,
    name varchar(255),
    age int
);

--rollback DROP TABLE user;

--changeset kobe:2

CREATE TABLE items (
    id int primary key,
    name varchar(255),
    price int
);

--rollback DROP TABLE items;

--changeset kobe:3

CREATE TABLE orders (
    id INT PRIMARY KEY,
    user_id INT REFERENCES users (id),
    total_price INT;
    order_date DATE NOT NULL;
    order_time TIME NOT NULL
);

--rollback DROP TABLE orders;