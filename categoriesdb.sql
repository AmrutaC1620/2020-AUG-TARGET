CREATE TABLE CATEGORIES(
    CATEGORY_ID INT NOT NULL,
    CATEGORY_NAME VARCHAR(20) NOT NULL,
    DESCRIPTION VARCHAR(60) DEFAULT NULL,
    PICTURE LONGBLOB
); 
ALTER TABLE CATEGORIES ADD CONSTRAINT CONSTRAINT_6 PRIMARY KEY(CATEGORY_ID);     
-- 8 +/- SELECT COUNT(*) FROM CATEGORIES;               
INSERT INTO CATEGORIES(CATEGORY_ID, CATEGORY_NAME, DESCRIPTION, PICTURE) VALUES
(1, 'Beverages', 'Soft drinks, coffees, teas, beers, and ales', NULL),
(2, 'Condiments', 'Sweet and savory sauces, relishes, spreads, and seasonings', NULL),
(3, 'Confections', 'Desserts, candies, and sweet breads', NULL),
(4, 'Dairy Products', 'Cheeses', NULL),
(5, 'Grains/Cereals', 'Breads, crackers, pasta, and cereal', NULL),
(6, 'Meat/Poultry', 'Prepared meats', NULL),
(7, 'Produce', 'Dried fruit and bean curd', NULL),
(8, 'Seafood', 'Seaweed and fish', NULL);    
