package com.miempresa.proyectoventas.controladores;

import com.miempresa.proyectoventas.modelos.ModeloProductos;
import com.miempresa.proyectoventas.vistas.VistaEliminar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class ControladorEliminar {
        
    JFrame ventanaPadre;
    VistaEliminar ventanaEliminar;
    
    public void cambiarVisibilidad (boolean state){
        ventanaEliminar.getCancelar().setVisible(state);
        ventanaEliminar.getEliminar().setVisible(state);
        ventanaEliminar.getNombre().setVisible(state);
        ventanaEliminar.getDescripcion().setVisible(state);
        ventanaEliminar.getSure().setVisible(state);
    }

    public ControladorEliminar(JFrame ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        ventanaEliminar = new VistaEliminar();
        ventanaEliminar.setTitle("Ventana Eliminar");
        ImageIcon icono = new ImageIcon("src/main/java/com/miempresa/proyectoventas/vistas/Logo.png");
        ventanaEliminar.setIconImage(icono.getImage());
        this.ventanaPadre.setVisible(false);
        ventanaEliminar.setVisible(true);
        ventanaEliminar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaEliminar.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                ventanaPadre.setVisible(true);
            }
        });
        cambiarVisibilidad(false);
        ventanaEliminar.getConsultar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarVisibilidad(false);
                String codConsulta = ventanaEliminar.getCodConsulta().getText();
                if(codConsulta.length() > 8){
                    ventanaEliminar.getResult().setText("El codigo no debe superar los 8 caracteres");
                    return;
                }
                if(codConsulta.equalsIgnoreCase("")){
                    ventanaEliminar.getResult().setText("El campo Consulta no puede estar vacio");
                    return;
                }
                try{
                    ModeloProductos modeloProducto = new ModeloProductos();
                    HashMap<String,String> res = modeloProducto.consultarProducto(codConsulta);
                    if(!res.get("nombre_producto").equalsIgnoreCase("")){
                        ventanaEliminar.getResult().setText("Producto Codigo: " + codConsulta);
                        ventanaEliminar.getNombre().setText("NOMBRE:" +res.get("nombre_producto"));
                        ventanaEliminar.getDescripcion().setText("DESCRIPCION: "+res.get("descripcion_producto"));
                        cambiarVisibilidad(true);
                        ventanaEliminar.getCancelar().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ec) {
                                try{
                                    ventanaEliminar.getResult().setText("");
                                    cambiarVisibilidad(false);
                                    return;
                                }catch(Exception cex){
                                    System.out.println("cex = " + cex);
                                    return;
                                }
                            }
                        });
                        ventanaEliminar.getEliminar().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ee) {
                                try{
                                    modeloProducto.borrarProducto(ventanaEliminar.getCodConsulta().getText());
                                    cambiarVisibilidad(false);
                                    ventanaEliminar.getResult().setText("Acción realizada con exito");
                                    return;
                                }catch(Exception cex){
                                    System.out.println("cex = " + cex);
                                    return;
                                }
                            }
                        });                    
                    }else{
                        ventanaEliminar.getResult().setText("El producto con codigo " + codConsulta + " No existe");
                    }
                }catch(Exception ex){
                    System.out.println("ex = " + ex);
                    return;
                }
            }
        });
    }
}
