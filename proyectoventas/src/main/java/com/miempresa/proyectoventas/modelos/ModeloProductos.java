package com.miempresa.proyectoventas.modelos;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


public class ModeloProductos extends ModeloBase{

    public ModeloProductos(){
        super();
    }
    
    public String insertarProducto(String codigoProducto,String nombreProducto,String descripcionProducto,Float precioProducto){
        String queryValidadKey = "SELECT cod_producto FROM t_productos WHERE cod_producto = '"
                +codigoProducto+"'";
        HashMap r = consultarPrimerResultado(queryValidadKey);
        if (r != null){
            return "Ya existe un producto con ese código";
        }
        String query = "INSERT INTO t_productos (cod_producto,"
                + "nombre_producto,descripcion_producto,precio_producto) "
                + "VALUES ("
                + "'"+codigoProducto+"','"+nombreProducto+"','"+descripcionProducto+"',"
                + precioProducto+ ")";
        System.out.println(query);
        if (insertar(query)){
            return "No se pudo guardar el producto";
        }
        return "";
    }
    public HashMap<String, String> consultarProducto(String codigoProducto){
        HashMap<String,String> f = new HashMap<String,String>();
        String query = "SELECT * FROM t_productos WHERE cod_producto = '"
                + codigoProducto + "'";
        List<HashMap<String, String>> productoFinal = consultar(query);
        System.out.println(productoFinal);
        if(!productoFinal.isEmpty()){
            f = productoFinal.get(0);
        }else{
            f.put("nombre_producto", "");
        }
        return f;
    }
    
    public void actualizarProducto(String codigoProducto, String nombreProducto, String descripcionProducto, float precioProducto){
        String query = "UPDATE t_productos SET nombre_producto=\""+nombreProducto+"\", " + 
                "descripcion_producto=\""+descripcionProducto+"\", "+
                "precio_producto=\""+precioProducto+"\" "+
                "WHERE cod_producto = '"+codigoProducto+"';";
        Boolean operacion = actualizar(query);
        System.out.println("query = " + query);
        System.out.println("operacion = " + operacion);
    }
    
    public void borrarProducto(String codProducto){
        String query = "DELETE FROM t_productos WHERE cod_producto = \""+codProducto+"\";";
        try{
            boolean operacion = borrar(query);
            System.out.println("query = " + query);
            System.out.println("operacion = " + operacion);
        }catch(Exception ex){
            System.out.println("ex = " + ex);
        }
    }
}
