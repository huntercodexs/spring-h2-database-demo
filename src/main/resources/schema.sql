
DROP TABLE IF EXISTS PRODUCTS;

CREATE TABLE PRODUCTS (
   id INT AUTO_INCREMENT,
   name VARCHAR(50),
   description VARCHAR(150),
   price VARCHAR(10)
);

DROP TABLE IF EXISTS SALES;

CREATE TABLE SALES (
   id INT AUTO_INCREMENT,
   product VARCHAR(50),
   quantity VARCHAR(50),
   total VARCHAR(10)
);
