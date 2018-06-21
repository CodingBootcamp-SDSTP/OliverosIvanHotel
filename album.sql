DROP TABLE IF EXISTS albumtable;
CREATE TABLE albumtable ( 
	id INTEGER AUTO_INCREMENT,
	artist VARCHAR(25) NOT NULL, 
	albumname VARCHAR(255) NOT NULL,
	price DECIMAL(10, 2) NOT NULL,
	quantity INTEGER NOT NULL,
	genre VARCHAR(25) NOT NULL,
	PRIMARY KEY(id)
	);
	INSERT INTO albumtable ( artist, albumname, price, quantity, genre ) VALUES ('Iostream', 'Fighting Fate', 500, 20, 'Punk');
	INSERT INTO albumtable ( artist, albumname, price, quantity, genre ) VALUES ('Franco', 'To Slow', 350, 23, 'Rock');
	INSERT INTO albumtable ( artist, albumname, price, quantity, genre ) VALUES ('Foo Fighters', 'Under the Sea', 250.50, 10, 'Rock');
	INSERT INTO albumtable ( artist, albumname, price, quantity, genre ) VALUES ('Urbandub', 'Southern Lights', 150.75, 12, 'Rock');
	INSERT INTO albumtable ( artist, albumname, price, quantity, genre ) VALUES ('Vhong Navaro', 'Giling Giling', 100.25, 4, 'Metal');
	INSERT INTO albumtable ( artist, albumname, price, quantity, genre ) VALUES ('Willy Revillame', 'Hep Horray', 150, 8, 'Metal');

DROP TABLE IF EXISTS usertable;
CREATE TABLE usertable (
	id INTEGER AUTO_INCREMENT,
	username VARCHAR(25) NOT NULL,
	password VARCHAR(25) NOT NULL,
	PRIMARY KEY(id)
	);
	INSERT INTO usertable ( username, password ) VALUES ('ivan', 'ivan123');
	INSERT INTO usertable ( username, password ) VALUES ('i', '123');
	