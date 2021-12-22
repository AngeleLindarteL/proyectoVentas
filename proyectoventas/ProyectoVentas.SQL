DROP DATABASE IF EXISTS p_ventas;
CREATE DATABASE p_ventas;

DROP TABLE  IF EXISTS p_ventas.t_usuarios;
CREATE TABLE p_ventas.t_usuarios (
	nombre_usuario VARCHAR(15) PRIMARY KEY,
	hash_password VARCHAR(200) NOT NULL	
);
INSERT INTO p_ventas.t_usuarios (
	nombre_usuario,hash_password)
VALUES (
	'usuario','25d55ad283aa400af464c76d713c07ad'
);

DROP TABLE  IF EXISTS p_ventas.t_productos;
CREATE TABLE p_ventas.t_productos (
	cod_producto VARCHAR(8) PRIMARY KEY,
	nombre_producto VARCHAR(30) NOT NULL,
	descripcion_producto VARCHAR(60), 
	precio_producto FLOAT
);
INSERT INTO p_ventas.t_productos (
cod_producto,nombre_producto,descripcion_producto,precio_producto
)
VALUES ('AAAAA001','PILA DOBLE AA','BATERIAS',9000);
INSERT INTO p_ventas.t_productos (
cod_producto,nombre_producto,descripcion_producto,precio_producto
)
VALUES ('AAAAA002','PILA TRIPLE AAA','BATERIAS',7000);
INSERT INTO p_ventas.t_productos (
cod_producto,nombre_producto,descripcion_producto,precio_producto
)
VALUES ('AAAAA003','PILA GORDA AA','BATERIAS',12000);

DROP TABLE  IF EXISTS p_ventas.t_vendedores ;

CREATE TABLE p_ventas.t_vendedores (
	cod_vendedor VARCHAR(8) PRIMARY KEY,
	nombre_vendedor VARCHAR(50) NOT NULL
);
INSERT INTO p_ventas.t_vendedores (
cod_vendedor,nombre_vendedor
)
VALUES ('VEND01','JOSÉ MARÍA CORDOBA CORONEL');
INSERT INTO p_ventas.t_vendedores (
cod_vendedor,nombre_vendedor
)
VALUES ('VEND02','MANUEL MEDINA MESA');

DROP TABLE  IF EXISTS p_ventas.t_ventas;

CREATE TABLE p_ventas.t_ventas (
	id_venta INT AUTO_INCREMENT PRIMARY KEY,
	numero_factura VARCHAR(6) NOT NULL,
	cod_producto VARCHAR(8) NOT NULL,
	fecha_venta DATE,
	cod_vendedor VARCHAR(8),
	FOREIGN KEY (cod_producto) REFERENCES p_ventas.t_productos (cod_producto),
	FOREIGN KEY (cod_vendedor) REFERENCES p_ventas.t_vendedores (cod_vendedor)
);
INSERT INTO p_ventas.t_ventas (
numero_factura,cod_producto, fecha_venta,cod_vendedor
)
VALUES ('FAC001','AAAAA001','2021-08-21','VEND01');
INSERT INTO p_ventas.t_ventas (
numero_factura,cod_producto, fecha_venta,cod_vendedor
)
VALUES ('FAC001','AAAAA002','2021-08-21','VEND02');