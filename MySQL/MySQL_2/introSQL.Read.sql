
-- LERR

SHOW DATABASES;
USE sakila;

SELECT *  FROM actor;

SELECT first_name, last_name FROM actor ;

-- limitar la cantidad de resultados
SELECT * FROM actor LIMIT 10;

-- ordenar los datos de acuerdo a una columna ascendente
SELECT * FROM city ORDER BY country_id ASC;

-- ordenar los datos de acuerdo a una columna ascendente
SELECT * FROM city ORDER BY country_id ASC;

-- ordenar los datos de acuerdo a una columna descendente
SELECT * FROM city ORDER BY city DESC;

/*
OPERADORES DE COMPARACIÓN
- igual =
- distinto de !=
- mayor >
- menor <
- menor que <=
- mayor que >=
- LIKE 

*/

-- igual
SELECT * FROM city WHERE city = "cuman";
SELECT * FROM actor WHERE first_name = "penelope";

-- diferente de
SELECT * FROM city WHERE city != "cuman";
SELECT * FROM actor WHERE first_name != "penelope";
-- mayor, menor, mayor que, menor que
SELECT * FROM actor WHERE actor_id <= 50;
SELECT * FROM actor WHERE actor_id >= 50;
SELECT * FROM actor WHERE actor_id < 50;
SELECT * FROM actor WHERE actor_id > 50;

-- LIKE se utiliza para realizar busquedas
-- arroja los resultados que cumplan con la condicion "%texto%"
SELECT * FROM actor WHERE first_name LIKE "%an";
SELECT * FROM actor WHERE first_name LIKE "%an%";
SELECT * FROM actor WHERE first_name LIKE "an%";
-- podemos utilizar _ para representar los espacios de un caracter
SELECT * FROM actor WHERE first_name LIKE "%_an";

-- NOT LIKE es la negacion de LIKE
SELECT * FROM actor WHERE first_name NOT LIKE "%_an";

-- uniendo todo
SELECT * FROM actor 
WHERE first_name 
LIKE "%nn%" 
ORDER BY last_name 
ASC LIMIT 5;










