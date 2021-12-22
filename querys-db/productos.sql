CREATE TABLE t_productos(
	cod_producto VARCHAR(8) NOT NULL,
	nombre_producto VARCHAR(30) NOT NULL,
	descripcion_producto VARCHAR(60) NOT NULL,
	precio_producto INT NOT NULL,
	primary key(cod_producto)
);

INSERT INTO t_productos (cod_producto, nombre_producto, descripcion_producto, precio_producto)
VALUES ('AAAAA001', 'PILA DOBLE AA','BATERIAS', 9000);

INSERT INTO t_productos (cod_producto, nombre_producto, descripcion_producto, precio_producto)
VALUES ('AAAAA002', 'PILA TRIPLE AAA','BATERIAS',7000);

INSERT INTO t_productos (cod_producto, nombre_producto, descripcion_producto, precio_producto)
VALUES ('AAAAA003', 'PILA GORDA AA','BATERIAS',12000);
