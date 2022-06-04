USE sakila;

SELECT * FROM sakila.payment;

-- COUNT contar los elementos o celdas de una columna
SELECT COUNT(*) AS cantidad_filas FROM payment;

SELECT COUNT(*) AS cantidad_filas FROM payment GROUP BY customer_id;

SELECT COUNT(DISTINCT customer_id) AS cantidad_filas FROM payment GROUP BY customer_id;

-- SUM realiza una suma de los valores de una columna
SELECT sum(amount) AS total FROM payment;

SELECT customer_id, SUM(amount) AS total FROM payment 
GROUP BY customer_id 
ORDER BY total DESC;

-- AVG obtener el promedio de una columna
SELECT customer_id as Cliente  ,AVG(amount) AS promedio FROM payment GROUP BY Cliente; 