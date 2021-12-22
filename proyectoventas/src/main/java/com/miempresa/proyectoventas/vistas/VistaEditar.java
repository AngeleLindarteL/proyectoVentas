/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.proyectoventas.vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class VistaEditar extends javax.swing.JFrame {

    /**
     * Creates new form VistaEditar
     */
    public VistaEditar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLblTituloEditar = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        codConsulta = new javax.swing.JTextField();
        Result = new javax.swing.JLabel();
        precioInput = new javax.swing.JTextField();
        nombreInput = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        descripcionLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        errorInput = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionInput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblTituloEditar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLblTituloEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTituloEditar.setText("EDITAR");
        jLblTituloEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLblTituloEditar.setFocusable(false);
        jLblTituloEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnConsulta.setBackground(new java.awt.Color(153, 204, 255));
        btnConsulta.setText("BUSCAR");

        codConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codConsultaActionPerformed(evt);
            }
        });

        Result.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnActualizar.setBackground(new java.awt.Color(242, 186, 40));
        btnActualizar.setText("ACTUALIZAR");

        descripcionLabel.setText("Descripción");

        nombreField.setText("Nombre");

        precioLabel.setText("Precio");

        descripcionInput.setColumns(20);
        descripcionInput.setRows(5);
        jScrollPane1.setViewportView(descripcionInput);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("CODIGO DEL PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblTituloEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(294, 390, Short.MAX_VALUE))
                    .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(codConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombreInput)
                            .addComponent(precioInput, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioLabel)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLblTituloEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEditar().setVisible(true);
            }
        });
    }

    public JLabel getResult() {
        return Result;
    }

    public void setResult(JLabel Result) {
        this.Result = Result;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnConsulta() {
        return btnConsulta;
    }

    public void setBtnConsulta(JButton btnConsulta) {
        this.btnConsulta = btnConsulta;
    }

    public JTextField getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(JTextField codConsulta) {
        this.codConsulta = codConsulta;
    }

    public JTextArea getDescripcionInput() {
        return descripcionInput;
    }

    public void setDescripcionInput(JTextArea descripcionInput) {
        this.descripcionInput = descripcionInput;
    }

    public JLabel getDescripcionLabel() {
        return descripcionLabel;
    }

    public void setDescripcionLabel(JLabel descripcionLabel) {
        this.descripcionLabel = descripcionLabel;
    }

    public JLabel getErrorInput() {
        return errorInput;
    }

    public void setErrorInput(JLabel errorInput) {
        this.errorInput = errorInput;
    }

    public JLabel getjLblTituloEditar() {
        return jLblTituloEditar;
    }

    public void setjLblTituloEditar(JLabel jLblTituloEditar) {
        this.jLblTituloEditar = jLblTituloEditar;
    }

    public JLabel getNombreField() {
        return nombreField;
    }

    public void setNombreField(JLabel nombreField) {
        this.nombreField = nombreField;
    }

    public JTextField getNombreInput() {
        return nombreInput;
    }

    public void setNombreInput(JTextField nombreInput) {
        this.nombreInput = nombreInput;
    }

    public JTextField getPrecioInput() {
        return precioInput;
    }

    public void setPrecioInput(JTextField precioInput) {
        this.precioInput = precioInput;
    }

    public JLabel getPrecioLabel() {
        return precioLabel;
    }

    public void setPrecioLabel(JLabel precioLabel) {
        this.precioLabel = precioLabel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Result;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JTextField codConsulta;
    private javax.swing.JTextArea descripcionInput;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel errorInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblTituloEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreField;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JTextField precioInput;
    private javax.swing.JLabel precioLabel;
    // End of variables declaration//GEN-END:variables
}