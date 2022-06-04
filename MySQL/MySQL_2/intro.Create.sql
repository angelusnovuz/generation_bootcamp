-- CREAR 

CREATE DATABASE familia;
-- CREATE SCHEMA familia
USE familia;

-- es necesario poner al menos una column al crear una tabla
-- no es necesario poenr NOT NULL en llave primaria
-- por DEFAULT el valor asigando es NULL, se puede modificar al crear una tabla
-- para agregar valores unicos se utiliza UNIQUE

CREATE TABLE persona (
	persona_id INT AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    edad INT NOT NULL,
    estado VARCHAR(255) DEFAULT "Desconocido",
    cumpleanios DATE,
    PRIMARY KEY(persona_id),
    -- asignar una restriccion con un mensaje y la restriccion
    CONSTRAINT correo_unico UNIQUE(correo)
);

-- Insertar datos en una tabla
-- Tiene que ser en el orden indicado
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) VALUES
	('Jonathan', "jonathan@gmail.com", 23, "Feliz", "1998-12-14"),
    ('Yair', "yair@gmail.com", 24, "Triste", "1998-05-31");
    
-- error 1062: dato unico repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) VALUES
	("pepe", "yair@gmail.com", 34, "Alegre", "1980-01-01");

-- error 1364: no llenar un dato NOT NULL
INSERT INTO persona(correo, edad, estado, cumpleanios) VALUES
	("pepe@gmail.com", 34, "Alegre", "1980-01-01");

-- ingresar datos que no son necesarios
INSERT INTO persona(nombre, correo, edad, estado) VALUES
	("Pepe", "pepe@gmail.com", 34, "Alegre");

-- ingresar datos con valor por defecto
INSERT INTO persona(nombre, correo, edad, cumpleanios) VALUES
	("Toño", "tonio@gmail.com", 40, "1970-08-08");

SELECT * FROM persona;


CREATE TABLE mascota (
mascota_id INT AUTO_INCREMENT, 
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL,
fk1_persona INT NOT NULL,
PRIMARY KEY(mascota_id),
FOREIGN KEY(fk1_persona) REFERENCES persona(persona_id)
ON DELETE CASCADE
ON UPDATE CASCADE
);

SELECT * FROM mascota;


INSERT INTO mascota(nombre, edad, fk1_persona) VALUES
	("Leo", 3, 1),
    ("Tobi", 9, 1),
    ("Beni", 12, 2),
    ("Patitas", 3, 3);










