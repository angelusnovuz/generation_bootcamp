-- ACTUALIZAR

-- agregar una columna
ALTER TABLE mascota ADD COLUMN especie VARCHAR(255) NOT NULL;

-- agregar una columna en una posición especifica
ALTER TABLE mascota ADD COLUMN cumpleanios DATE AFTER edad;

-- modificar las caracteristicas de una columna
ALTER TABLE mascota MODIFY especie INT ;

-- podemos cambiar el nombre de una columnas
ALTER TABLE mascota CHANGE COLUMN edad edad_mod INT NOT NULL;

-- renombrar tabla
ALTER TABLE mascota RENAME mascotas;

-- actualizr datos de una fila
UPDATE mascotas SET especie = "Gato" WHERE mascota_id=1;




SELECT * FROM mascotas;








