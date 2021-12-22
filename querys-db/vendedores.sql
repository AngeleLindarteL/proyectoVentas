CREATE TABLE t_vendedores(
	cod_vendedor VARCHAR(8) NOT NULL,
	nombre_vendedor VARCHAR(50) NOT NULL,
	primary key(cod_vendedor)
);


INSERT INTO t_vendedores (cod_vendedor, nombre_vendedor) 
VALUES ('VEND01', 'José María Cordoba Coronel');

INSERT INTO t_vendedores (cod_vendedor, nombre_vendedor) 
VALUES ('VEND02', 'Manuel Medina Mesa');
