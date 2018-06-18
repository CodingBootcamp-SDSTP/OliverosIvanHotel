DROP TABLE IF (10, 10)EXISTS instrument;
CREATE TABLE instrumenttable ( 
	id INTEGER AUTO_INCREMENT,
	brand VARCHAR(25) NOT NULL, 
	model VARCHAR(50) NOT NULL,
	price DECIMAL(10, 10) NOT NULL,
	quantity INTEGER NOT NULL,
	type VARCHAR(25) NOT NULL,
	PRIMARY KEY(id)
	);
	INSERT INTO instrumenttable ( brand, model, price, quantity, type ) VALUES ('SQOE', 'PRS300', 30000, 6, 'Guitar');
	INSERT INTO instrumenttable ( brand, model, price, quantity, type ) VALUES ('Ephiphone', 'Special 2', 12500.50, 4, 'Guitar');
	INSERT INTO instrumenttable ( brand, model, price, quantity, type ) VALUES ('Pearl', 'S400', 3000, 10, 'Percussion');
	INSERT INTO instrumenttable ( brand, model, price, quantity, type ) VALUES ('Ludwig', 'CB81', 4000, 12, 'Percussion');
	INSERT INTO instrumenttable ( brand, model, price, quantity, type ) VALUES ('Zoom', 'G5', 16000, 19, 'Gadget');
	INSERT INTO instrumenttable ( brand, model, price, quantity, type ) VALUES ('Boss', 'DS1', 4500.50, 8, 'Gadget');
	