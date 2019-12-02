--liquibase formatted sql

--changeset kobe:10

CREATE TABLE items (
    id INT PRIMARY KEY,
    name TEXT NOT NULL,
    price TEXT NOT NULL,
    image_url TEXT
);