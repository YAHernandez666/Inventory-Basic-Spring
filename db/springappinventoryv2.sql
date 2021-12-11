CREATE DATABASE springappinventoryv2;

GRANT ALL ON springappinventoryv2.* TO springappinventoryuser@'%' IDENTIFIED BY 'pspringappinventoryuser';
GRANT ALL ON springappinventoryv2.* TO springappinventoryuser@localhost IDENTIFIED BY 'pspringappinventoryuser';

USE springappinventoryv2;

CREATE TABLE products (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  description varchar(255),
  price decimal(15,2)
);
CREATE INDEX products_description ON products(description);