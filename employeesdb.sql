CREATE TABLE EMPLOYEES(
    EMPLOYEE_ID INT NOT NULL,
    LAST_NAME VARCHAR(10) NOT NULL,
    FIRST_NAME VARCHAR(10) NOT NULL,
    TITLE VARCHAR(25) DEFAULT NULL,
    TITLE_OF_COURTESY VARCHAR(5) DEFAULT NULL,
    BIRTH_DATE DATETIME DEFAULT NULL,
    HIRE_DATE DATETIME DEFAULT NULL,
    ADDRESS VARCHAR(250) DEFAULT NULL,
    CITY VARCHAR(10) DEFAULT NULL,
    REGION VARCHAR(2) DEFAULT NULL,
    POSTAL_CODE VARCHAR(10) DEFAULT NULL,
    COUNTRY VARCHAR(10) DEFAULT NULL,
    HOME_PHONE VARCHAR(15) DEFAULT NULL,
    EXTENSION VARCHAR(5) DEFAULT NULL,
    PHOTO LONGBLOB,
    NOTES LONGTEXT,
    REPORTS_TO INT DEFAULT NULL
);            
ALTER TABLE EMPLOYEES ADD CONSTRAINT CONSTRAINT_4 PRIMARY KEY(EMPLOYEE_ID);      
-- 9 +/- SELECT COUNT(*) FROM EMPLOYEES;
INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, FIRST_NAME, TITLE, TITLE_OF_COURTESY, BIRTH_DATE, HIRE_DATE, ADDRESS, CITY, REGION, POSTAL_CODE, COUNTRY, HOME_PHONE, EXTENSION, PHOTO, NOTES, REPORTS_TO) VALUES
(1, 'Davolio', 'Nancy', 'Sales Representative', 'Ms.', TIMESTAMP '1948-12-08 00:00:00', TIMESTAMP '1992-05-01 00:00:00', '507 - 20th Ave. E.\r\nApt. 2A', 'Seattle', 'WA', '98122', 'USA', '(206) 555-9857', '5467', NULL, 'Education includes a BA in psychology from Colorado State University in 1970.  She also completed \"The Art of the Cold Call.\"  Nancy is a member of Toastmasters International.', 2),
(2, 'Fuller', 'Andrew', 'Vice President, Sales', 'Dr.', TIMESTAMP '1952-02-19 00:00:00', TIMESTAMP '1992-08-14 00:00:00', '908 W. Capital Way', 'Tacoma', 'WA', '98401', 'USA', '(206) 555-9482', '3457', NULL, 'Andrew received his BTS commercial in 1974 and a Ph.D. in international marketing from the University of Dallas in 1981.  He is fluent in French and Italian and reads German.  He joined the company as a sales representative, was promoted to sales manager ', NULL),
(3, 'Leverling', 'Janet', 'Sales Representative', 'Ms.', TIMESTAMP '1963-08-30 00:00:00', TIMESTAMP '1992-04-01 00:00:00', '722 Moss Bay Blvd.', 'Kirkland', 'WA', '98033', 'USA', '(206) 555-3412', '3355', NULL, 'Janet has a BS degree in chemistry from Boston College (1984).  She has also completed a certificate program in food retailing management.  Janet was hired as a sales associate in 1991 and promoted to sales representative in February 1992.', 2),
(4, 'Peacock', 'Margaret', 'Sales Representative', 'Mrs.', TIMESTAMP '1937-09-19 00:00:00', TIMESTAMP '1993-05-03 00:00:00', '4110 Old Redmond Rd.', 'Redmond', 'WA', '98052', 'USA', '(206) 555-8122', '5176', NULL, 'Margaret holds a BA in English literature from Concordia College (1958) and an MA from the American Institute of Culinary Arts (1966).  She was assigned to the London office temporarily from July through November 1992.', 2),
(5, 'Buchanan', 'Steven', 'Sales Manager', 'Mr.', TIMESTAMP '1955-03-04 00:00:00', TIMESTAMP '1993-10-17 00:00:00', '14 Garrett Hill', 'London', NULL, 'SW1 8JR', 'UK', '(71) 555-4848', '3453', NULL, 'Steven Buchanan graduated from St. Andrews University, Scotland, with a BSC degree in 1976.  Upon joining the company as a sales representative in 1992, he spent 6 months in an orientation program at the Seattle office and then returned to his permanent p', 2),
(6, 'Suyama', 'Michael', 'Sales Representative', 'Mr.', TIMESTAMP '1963-07-02 00:00:00', TIMESTAMP '1993-10-17 00:00:00', 'Coventry House\r\nMiner Rd.', 'London', NULL, 'EC2 7JR', 'UK', '(71) 555-7773', '428', NULL, 'Michael is a graduate of Sussex University (MA, economics, 1983) and the University of California at Los Angeles (MBA, marketing, 1986).  He has also taken the courses \"Multi-Cultural Selling\" and \"Time Management for the Sales Professional.\"  He is fluen', 5),
(7, 'King', 'Robert', 'Sales Representative', 'Mr.', TIMESTAMP '1960-05-29 00:00:00', TIMESTAMP '1994-01-02 00:00:00', 'Edgeham Hollow\r\nWinchester Way', 'London', NULL, 'RG1 9SP', 'UK', '(71) 555-5598', '465', NULL, 'Robert King served in the Peace Corps and traveled extensively before completing his degree in English at the University of Michigan in 1992, the year he joined the company.  After completing a course entitled \"Selling in Europe,\" he was transferred to th', 5),
(8, 'Callahan', 'Laura', 'Inside Sales Coordinator', 'Ms.', TIMESTAMP '1958-01-09 00:00:00', TIMESTAMP '1994-03-05 00:00:00', '4726 - 11th Ave. N.E.', 'Seattle', 'WA', '98105', 'USA', '(206) 555-1189', '2344', NULL, 'Laura received a BA in psychology from the University of Washington.  She has also completed a course in business French.  She reads and writes French.', 2),
(9, 'Dodsworth', 'Anne', 'Sales Representative', 'Ms.', TIMESTAMP '1966-01-27 00:00:00', TIMESTAMP '1994-11-15 00:00:00', '7 Houndstooth Rd.', 'London', NULL, 'WG2 7LT', 'UK', '(71) 555-4444', '452', NULL, 'Anne has a BA degree in English from St. Lawrence College.  She is fluent in French and German.', 5);         
