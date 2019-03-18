--
-- Create schema arte
--
 
CREATE DATABASE IF NOT EXISTS arte;
USE arte;

DROP TABLE IF EXISTS pinturas;
DROP TABLE IF EXISTS pintores;
--
-- Definition of table pintores
--


CREATE TABLE pintores (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  apellido varchar(45) NOT NULL,
  edad int(2) unsigned NOT NULL,
  PRIMARY KEY (id)
);

--
-- Dumping data for table pintores
--

/*!40000 ALTER TABLE pintores DISABLE KEYS */;
INSERT INTO pintores (id,nombre,apellido,edad) VALUES
 (1,'Pablo','Picasso',91),
 (2,'Leonardo','Da Vinci',67),
 (3,'Vincent','Van Gogh',37),
 (4,'Salvador','Dali',84);
/*!40000 ALTER TABLE pintores ENABLE KEYS */;

--
-- Definition of table pinturas
--
 

CREATE TABLE pinturas (
  id int(10)  NOT NULL AUTO_INCREMENT,
  nombre varchar(70) NOT NULL,
  epoca varchar(50) NOT NULL,
  fecha_creacion int(4) NOT NULL,
  PRIMARY KEY (id),
  id_pintor int(10) unsigned NOT NULL,
  FOREIGN KEY(id_pintor) REFERENCES pintores(id)
);

--
-- Dumping data for table pinturas
--
 
/*!40000 ALTER TABLE pinturas DISABLE KEYS */;
INSERT INTO pinturas (id,nombre,epoca,fecha_creacion,id_pintor) VALUES
 (1,'La Gioconda','Renacimiento',1503,1),
 (2,'La ultima cena','Renacimiento',1498,1),
 (3,'La noche estrellada','Posimpresionismo',1889,1),
 (4,'Guernica','Cubismo',1937,1);
/*!40000 ALTER TABLE pinturas ENABLE KEYS */;
 
 
SELECT * FROM pintores;
SELECT * FROM pinturas;
