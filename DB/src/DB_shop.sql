DROP DATABASE shop;

CREATE DATABASE shop;

USE shop;

CREATE TABLE cathegory
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(256) NOT NULL
);

INSERT INTO cathegory (name)
	VALUES
	("спортивный инвентарь"),
	("канцелярские товары"),
	("игрушки")
    ;

CREATE TABLE products
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(256) NOT NULL,
	price INT NOT NULL,
	id_cathegory INT NOT NULL,
	FOREIGN KEY(id_cathegory)REFERENCES cathegory(id)
);

INSERT INTO products (name, price, id_cathegory)
	VALUES
    ("мяч", 530, 1),
    ("ручка", 25, 2),
    ("линейка", 32, 2),
    ("кукла", 1850, 3),
    ("скакалка", 350, 1)
    ;