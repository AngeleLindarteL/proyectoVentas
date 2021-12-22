package com.miempresa.proyectoventas.controladores;

import com.miempresa.proyectoventas.modelos.ModeloProductos;
import com.miempresa.proyectoventas.vistas.VistaConsultar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ControladorConsultar {
    
    JFrame ventanaPadre;
    VistaConsultar ventanaConsultar;

    public ControladorConsultar(JFrame ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        ventanaConsultar = new VistaConsultar();
        ventanaConsultar.setTitle("Ventana Consultar");
        ImageIcon icono = new ImageIcon("src/main/java/com/miempresa/proyectoventas/vistas/Logo.png");
        ventanaConsultar.setIconImage(icono.getImage());
        this.ventanaPadre.setVisible(false);
        ventanaConsultar.setVisible(true);
        ventanaConsultar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaConsultar.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                ventanaPadre.setVisible(true);
            }
        });
        JButton botonConsultar = ventanaConsultar.getBotonConsulta();
        botonConsultar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ventanaConsultar.getNombre().setText("");
                ventanaConsultar.getDescripcion().setText("");
                ventanaConsultar.getPrecio().setText("");
                
                String codigoConsulta = ventanaConsultar.getCodigoConsulta().getText();
                if(codigoConsulta.length() > 8){
                    ventanaConsultar.getProducto().setText("El codigo no debe superar los 8 caracteres");
                    return;
                }
                if(codigoConsulta.equalsIgnoreCase("")){
                    ventanaConsultar.getProducto().setText("El campo Consulta no puede estar vacio");
                    return;
                }
                try{
                    ModeloProductos modeloProductos = new ModeloProductos();
                    HashMap<String, String> respuesta = modeloProductos.consultarProducto(codigoConsulta);
                    if(respuesta.get("nombre_producto").equals("")){
                        ventanaConsultar.getProducto().setText("No se encontro el producto Solicitado");
                    }else{
                        ventanaConsultar.getProducto().setText("PRODUCTO CODIGO: "+codigoConsulta);
                        ventanaConsultar.getNombre().setText("Nombre: "+respuesta.get("nombre_producto"));
                        ventanaConsultar.getDescripcion().setText("Descripción: " + respuesta.get("descripcion_producto") );
                        ventanaConsultar.getPrecio().setText("Precio: " + respuesta.get("precio_producto") + "$");
                    }
                   if(respuesta.size() < 0){
                        return;
                    }
                }catch(Exception ex){
                    System.out.println("e = " + ex);
                }
            }
        });
    }
    
}