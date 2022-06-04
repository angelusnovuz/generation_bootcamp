USE sakila;

-- DIRECCION DE TODOS LOS PAISES
SELECT 
    country.country AS Pais,
    address.district AS Estado,  
    city.city AS Ciudad, 
    address.address AS Direccion,
    address.postal_code AS C_P
FROM country
INNER JOIN city
ON city.country_id = country.country_id
INNER JOIN address
ON address.city_id = city.city_id;

-- IDIOMAS DISPONIBLES PARA CADA PELICULA
SELECT 
	film.title AS titulo, 
    language.name AS idioma 
FROM film
INNER JOIN language 
ON language.language_id = film.language_id;

-- NUMERO DE PELICULAS POR IDIOMA
SELECT  
	language.name as Idioma, 
    COUNT(film.language_id) AS Peliculas 
FROM film
INNER JOIN language 
ON language.language_id = film.language_id
GROUP BY language.name;

-- ACTORES QUE TRABAJARON EN UNA PELICULA FRANCESA
SELECT 
	actor.first_name, 
    actor.last_name,  
    film.title 
FROM film_actor
INNER JOIN actor 
ON actor.actor_id = film_actor.actor_id
INNER JOIN film
ON film.film_id = film_actor.film_id;

-- ACTORES QUE TRABAJARON EN UNA PELICULA FRANCESA
SELECT actor.first_name, last_name,  film.title, language.name   FROM film
INNER JOIN language 
INNER JOIN actor
WHERE language.name = "French";






