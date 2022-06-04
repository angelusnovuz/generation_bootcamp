USE World;

SELECT * FROM country;

SELECT Name, population FROM country 
ORDER BY population DESC;

SELECT population FROM country 
WHERE Name="Mexico";

SELECT * FROM country 
WHERE population > 50000000 AND population < 70000000 
ORDER BY population;

-- BETWEEN filtrar resultados dentro de cierto rango
SELECT * FROM country
WHERE population BETWEEN 50000000 AND 70000000
ORDER BY population;
-- negacion de BETWEEN con NOT
SELECT * FROM country
WHERE population NOT BETWEEN 50000000 AND 70000000
ORDER BY population;

SELECT * FROM country
WHERE Continent = "Asia" OR Continent = "North America"
ORDER BY population;

SELECT * FROM country
WHERE Continent IN ("Asia", "North America")
ORDER BY Continent;

-- LIKE buscar patrones especificos
SELECT * FROM country WHERE name LIKE "%and";
SELECT * FROM country WHERE name LIKE "%e__a";


-- DISTINCT seleccionar elementos unicos de una columna
SELECT continent FROM country;
SELECT DISTINCT continent FROM country;









