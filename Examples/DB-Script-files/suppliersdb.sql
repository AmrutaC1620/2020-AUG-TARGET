CREATE TABLE SUPPLIERS(
    SUPPLIER_ID INT NOT NULL,
    COMPANY_NAME VARCHAR(50) NOT NULL,
    CONTACT_NAME VARCHAR(30) DEFAULT NULL,
    CONTACT_TITLE VARCHAR(30) DEFAULT NULL,
    ADDRESS VARCHAR(75) DEFAULT NULL,
    CITY VARCHAR(20) DEFAULT NULL,
    REGION VARCHAR(10) DEFAULT NULL,
    POSTAL_CODE VARCHAR(10) DEFAULT NULL,
    COUNTRY VARCHAR(20) DEFAULT NULL,
    PHONE VARCHAR(20) DEFAULT NULL,
    FAX VARCHAR(20) DEFAULT NULL,
    HOME_PAGE VARCHAR(120) DEFAULT NULL
);               
ALTER TABLE SUPPLIERS ADD CONSTRAINT CONSTRAINT_A PRIMARY KEY(SUPPLIER_ID);      
-- 29 +/- SELECT COUNT(*) FROM SUPPLIERS;               
INSERT INTO SUPPLIERS(SUPPLIER_ID, COMPANY_NAME, CONTACT_NAME, CONTACT_TITLE, ADDRESS, CITY, REGION, POSTAL_CODE, COUNTRY, PHONE, FAX, HOME_PAGE) VALUES
(1, 'Exotic Liquids', 'Charlotte Cooper', 'Purchasing Manager', '49 Gilbert St.', 'London', NULL, 'EC1 4SD', 'UK', '(171) 555-2222', NULL, NULL),
(2, 'New Orleans Cajun Delights', 'Shelley Burke', 'Order Administrator', 'P.O. Box 78934', 'New Orleans', 'LA', '70117', 'USA', '(100) 555-4822', NULL, '#CAJUN.HTM#'),
(3, 'Grandma Kelly''s Homestead', 'Regina Murphy', 'Sales Representative', '707 Oxford Rd.', 'Ann Arbor', 'MI', '48104', 'USA', '(313) 555-5735', '(313) 555-3349', NULL),
(4, 'Tokyo Traders', 'Yoshi Nagase', 'Marketing Manager', '9-8 Sekimai Musashino-shi', 'Tokyo', NULL, '100', 'Japan', '(03) 3555-5011', NULL, NULL),
(5, 'Cooperativa de Quesos ''Las Cabras''', 'Antonio del Valle Saavedra', 'Export Administrator', 'Calle del Rosal 4', 'Oviedo', 'Asturias', '33007', 'Spain', '(98) 598 76 54', NULL, NULL),
(6, 'Mayumi''s', 'Mayumi Ohno', 'Marketing Representative', '92 Setsuko Chuo-ku', 'Osaka', NULL, '545', 'Japan', '(06) 431-7877', NULL, 'Mayumi''s (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/mayumi.htm#'),
(7, 'Pavlova, Ltd.', 'Ian Devling', 'Marketing Manager', '74 Rose St. Moonie Ponds', 'Melbourne', 'Victoria', '3058', 'Australia', '(03) 444-2343', '(03) 444-6588', NULL),
(8, 'Specialty Biscuits, Ltd.', 'Peter Wilson', 'Sales Representative', '29 King''s Way', 'Manchester', NULL, 'M14 GSD', 'UK', '(161) 555-4448', NULL, NULL),
(9, STRINGDECODE('PB Kn\u00c3\u00a4ckebr\u00c3\u00b6d AB'), 'Lars Peterson', 'Sales Agent', 'Kaloadagatan 13', STRINGDECODE('G\u00c3\u00b6teborg'), NULL, 'S-345 67', 'Sweden', '031-987 65 43', '031-987 65 91', NULL),
(10, 'Refrescos Americanas LTDA', 'Carlos Diaz', 'Marketing Manager', 'Av. das Americanas 12.890', 'Sao Paulo', NULL, '5442', 'Brazil', '(11) 555 4640', NULL, NULL),
(11, STRINGDECODE('Heli S\u00c3\u00bc\u00c3\u0178waren GmbH & Co. KG'), 'Petra Winkler', 'Sales Manager', STRINGDECODE('Tiergartenstra\u00c3\u0178e 5'), 'Berlin', NULL, '10785', 'Germany', '(010) 9984510', NULL, NULL),
(12, STRINGDECODE('Plutzer Lebensmittelgro\u00c3\u0178m\u00c3\u00a4rkte AG'), 'Martin Bein', 'International Marketing Mgr.', 'Bogenallee 51', 'Frankfurt', NULL, '60439', 'Germany', '(069) 992755', NULL, 'Plutzer (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/plutzer.htm#'),
(13, 'Nord-Ost-Fisch Handelsgesellschaft mbH', 'Sven Petersen', 'Coordinator Foreign Markets', 'Frahmredder 112a', 'Cuxhaven', NULL, '27478', 'Germany', '(04721) 8713', '(04721) 8714', NULL),
(14, 'Formaggi Fortini s.r.l.', 'Elio Rossi', 'Sales Representative', 'Viale Dante, 75', 'Ravenna', NULL, '48100', 'Italy', '(0544) 60323', '(0544) 60603', '#FORMAGGI.HTM#'),
(15, 'Norske Meierier', 'Beate Vileid', 'Marketing Manager', 'Hatlevegen 5', 'Sandvika', NULL, '1320', 'Norway', '(0)2-953010', NULL, NULL),
(16, 'Bigfoot Breweries', 'Cheryl Saylor', 'Regional Account Rep.', '3400 - 8th Avenue Suite 210', 'Bend', 'OR', '97101', 'USA', '(503) 555-9931', NULL, NULL),
(17, STRINGDECODE('Svensk Sj\u00c3\u00b6f\u00c3\u00b6da AB'), STRINGDECODE('Michael Bj\u00c3\u00b6rn'), 'Sales Representative', STRINGDECODE('Brovallav\u00c3\u00a4gen 231'), 'Stockholm', NULL, 'S-123 45', 'Sweden', '08-123 45 67', NULL, NULL),
(18, STRINGDECODE('Aux joyeux eccl\u00c3\u00a9siastiques'), STRINGDECODE('Guyl\u00c3\u00a8ne Nodier'), 'Sales Manager', '203, Rue des Francs-Bourgeois', 'Paris', NULL, '75004', 'France', '(1) 03.83.00.68', '(1) 03.83.00.62', NULL),
(19, 'New England Seafood Cannery', 'Robb Merchant', 'Wholesale Account Agent', 'Order Processing Dept. 2100 Paul Revere Blvd.', 'Boston', 'MA', '02134', 'USA', '(617) 555-3267', '(617) 555-3389', NULL),
(20, 'Leka Trading', 'Chandra Leka', 'Owner', '471 Serangoon Loop, Suite #402', 'Singapore', NULL, '0512', 'Singapore', '555-8787', NULL, NULL),
(21, 'Lyngbysild', 'Niels Petersen', 'Sales Manager', 'Lyngbysild Fiskebakken 10', 'Lyngby', NULL, '2800', 'Denmark', '43844108', '43844115', NULL),
(22, 'Zaanse Snoepfabriek', 'Dirk Luchte', 'Accounting Manager', 'Verkoop Rijnweg 22', 'Zaandam', NULL, '9999 ZZ', 'Netherlands', '(12345) 1212', '(12345) 1210', NULL);              
INSERT INTO PUBLIC.SUPPLIERS(SUPPLIER_ID, COMPANY_NAME, CONTACT_NAME, CONTACT_TITLE, ADDRESS, CITY, REGION, POSTAL_CODE, COUNTRY, PHONE, FAX, HOME_PAGE) VALUES
(23, 'Karkki Oy', 'Anne Heikkonen', 'Product Manager', 'Valtakatu 12', 'Lappeenranta', NULL, '53120', 'Finland', '(953) 10956', NULL, NULL),
(24, 'G''day, Mate', 'Wendy Mackenzie', 'Sales Representative', '170 Prince Edward Parade Hunter''s Hill', 'Sydney', 'NSW', '2042', 'Australia', '(02) 555-5914', '(02) 555-4873', 'G''day Mate (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/gdaymate.htm#'),
(25, 'Ma Maison', 'Jean-Guy Lauzon', 'Marketing Manager', '2960 Rue St. Laurent', STRINGDECODE('Montr\u00c3\u00a9al'), STRINGDECODE('Qu\u00c3\u00a9bec'), 'H1J 1C3', 'Canada', '(514) 555-9022', NULL, NULL),
(26, 'Pasta Buttini s.r.l.', 'Giovanni Giudici', 'Order Administrator', 'Via dei Gelsomini, 153', 'Salerno', NULL, '84100', 'Italy', '(089) 6547665', '(089) 6547667', NULL),
(27, 'Escargots Nouveaux', 'Marie Delamare', 'Sales Manager', '22, rue H. Voiron', 'Montceau', NULL, '71300', 'France', '85.57.00.07', NULL, NULL),
(28, STRINGDECODE('Gai p\u00c3\u00a2turage'), 'Eliane Noz', 'Sales Representative', 'Bat. B 3, rue des Alpes', 'Annecy', NULL, '74000', 'France', '38.76.98.06', '38.76.98.58', NULL),
(29, STRINGDECODE('For\u00c3\u00aats d''\u00c3\u00a9rables'), 'Chantal Goulet', 'Accounting Manager', '148 rue Chasseur', 'Ste-Hyacinthe', STRINGDECODE('Qu\u00c3\u00a9bec'), 'J2S 7S8', 'Canada', '(514) 555-2955', '(514) 555-2921', NULL);       
