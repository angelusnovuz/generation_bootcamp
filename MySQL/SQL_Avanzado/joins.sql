-- INNER JOIN va incluir todos los valores que cumplan en ambas tablas
SELECT 
	cliente.nombre AS nombre,
    factura.idFactura
FROM cliente
INNER JOIN factura
ON factura.idCliente = cliente.idCliente
ORDER BY nombre;


-- LEFT JOIN va incluir todos los valores de la tabla de la izquierda (primera)
SELECT 
	cliente.nombre AS nombre,
    factura.idFactura
FROM cliente
LEFT JOIN factura
ON factura.idCliente = cliente.idCliente
ORDER BY nombre;

-- RIGHT JOIN va incluir todos los valores de la tabla de la derecha (segunda)
SELECT 
	cliente.nombre AS nombre,
    factura.idFactura
FROM cliente
RIGHT JOIN factura
ON factura.idCliente = cliente.idCliente
ORDER BY nombre;