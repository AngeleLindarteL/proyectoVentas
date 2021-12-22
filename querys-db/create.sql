CREATE TABLE t_ventas(
	id_venta INT NOT NULL,
	numero_factura VARCHAR(8),	
	cod_producto VARCHAR(8),
	fecha_venta DATE,
	cod_vendedor VARCHAR(8),	
	primary key(id_venta),
	FOREIGN KEY (cod_producto) REFERENCES t_productos(cod_producto),
	FOREIGN KEY (cod_vendedor) REFERENCES t_vendedores(cod_vendedor)
);


INSERT INTO t_ventas(id_venta ,cod_producto, cod_vendedor,numero_factura, fecha_venta)
VALUES ('1','AAAAA001', 'VEND01', 'FAC001', '2021-08-21');

INSERT INTO t_ventas(id_venta, cod_producto, cod_vendedor,numero_factura, fecha_venta)
VALUES ('2','AAAAA002', 'VEND02','FAC001',  '2021-08-21');
