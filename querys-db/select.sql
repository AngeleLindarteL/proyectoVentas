SELECT "Consulta 1";
SELECT * FROM t_ventas v INNER JOIN t_productos p ON v.cod_producto = p.cod_producto;
SELECT "Consulta 2";
SELECT * FROM t_ventas v INNER JOIN t_productos p ON v.cod_producto = p.cod_producto WHERE id_venta = 2;