package com.miempresa.proyectoventas.controladores;

import com.miempresa.proyectoventas.modelos.ModeloProductos;
import com.miempresa.proyectoventas.vistas.VistaEditar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ControladorEditar {
    
    JFrame ventanaPadre;
    VistaEditar ventanaEditar;
    public void modificarVisibilidad(boolean res){
        ventanaEditar.getBtnActualizar().setVisible(res);
        ventanaEditar.getNombreField().setVisible(res);
        ventanaEditar.getNombreInput().setVisible(res);
        ventanaEditar.getDescripcionLabel().setVisible(res);
        ventanaEditar.getDescripcionInput().setVisible(res);
        ventanaEditar.getPrecioInput().setVisible(res);
        ventanaEditar.getPrecioLabel().setVisible(res);
    }

    public ControladorEditar(JFrame ventanaPadre) {
        this.ventanaPadre = ventanaPadre;
        ventanaEditar = new VistaEditar();
        ventanaEditar.setTitle("Ventana Editar");
        ImageIcon icono = new ImageIcon("src/main/java/com/miempresa/proyectoventas/vistas/Logo.png");
        ventanaEditar.setIconImage(icono.getImage());
        this.ventanaPadre.setVisible(false);
        ventanaEditar.setVisible(true);
        ventanaEditar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaEditar.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                ventanaPadre.setVisible(true);
            }
        });
        modificarVisibilidad(false);
        JButton botonConsulta = ventanaEditar.getBtnConsulta();
        JButton botonUpdate = ventanaEditar.getBtnActualizar();
        botonConsulta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                modificarVisibilidad(false);
                ventanaEditar.getResult().setText("");
                String codigoConsulta = ventanaEditar.getCodConsulta().getText();
                if(codigoConsulta.equalsIgnoreCase("")){
                    ventanaEditar.getResult().setText("El campo no puede esta vacio");
                    return;
                }if(codigoConsulta.length() > 8){
                    ventanaEditar.getResult().setText("El campo no puede tener más de 8 caracteres");
                    return;
                }
                try{
                    ModeloProductos modeloProducto = new ModeloProductos();
                    HashMap<String,String> resConsulta = modeloProducto.consultarProducto(codigoConsulta);
                    if(!resConsulta.get("nombre_producto").equals("")){
                        ventanaEditar.getResult().setText("Editar producto codigo: "+codigoConsulta);
                        ventanaEditar.getNombreInput().setText(resConsulta.get("nombre_producto"));
                        ventanaEditar.getDescripcionInput().setText(resConsulta.get("descripcion_producto"));
                        ventanaEditar.getPrecioInput().setText(resConsulta.get("precio_producto"));
                        modificarVisibilidad(true);
                        
                        botonUpdate.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Float precioFloat; 
                                String nombre = ventanaEditar.getNombreInput().getText();
                                String descripcion = ventanaEditar.getDescripcionInput().getText();
                                String precio = ventanaEditar.getPrecioInput().getText();
                                if(nombre.equalsIgnoreCase("")){
                                    ventanaEditar.getErrorInput().setText("El nombre no puede estar vacio");
                                    return;
                                }else if(nombre.length() > 30){
                                    ventanaEditar.getErrorInput().setText("El nombre no puede superar los 30 caracteres");
                                    return;
                                }if(descripcion.equalsIgnoreCase("")){
                                    ventanaEditar.getErrorInput().setText("La descripcion no puede estar vacia");
                                    return;
                                }if(descripcion.length() > 60){
                                    ventanaEditar.getErrorInput().setText("La descripcion no puede superar los 60 caracteres");
                                    return;
                                }if(precio.equalsIgnoreCase("")){
                                    ventanaEditar.getErrorInput().setText("El precio no puede estar vacio");
                                }try{
                                    precioFloat = Float.parseFloat(precio);
                                }catch(Exception ex){
                                    ventanaEditar.getErrorInput().setText("El precio debe ser tipo numerico");
                                    return;
                                }try{
                                    modeloProducto.actualizarProducto(codigoConsulta, nombre, descripcion, precioFloat);
                                    modificarVisibilidad(false);
                                    ventanaEditar.getResult().setText("");
                                    ventanaEditar.getErrorInput().setText("");
                                }catch(Exception exc){
                                    ventanaEditar.getErrorInput().setText("Hubo un error en la Consulta intentelo de nuevo");                                    
                                }
                           }
                        });
                        
                    }else{
                        ventanaEditar.getResult().setText("No existe un producto con codigo: "+codigoConsulta);                        
                    }
                }catch(Exception e){
                    System.out.println("e = " + e);
                }
            }
        });
    }
}
