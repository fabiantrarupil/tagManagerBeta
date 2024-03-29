/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class MenuAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdministrador
     */
    public MenuAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGestionarProducto = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnGestionarAdministrador = new javax.swing.JButton();
        btnGestionarTagubicacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu de Administrador");

        btnGestionarProducto.setText("Gestionar Producto");
        btnGestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarProductoActionPerformed(evt);
            }
        });

        btnVolver.setText("Cerrar Sesion");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGestionarAdministrador.setText("Gestionar Administradores");
        btnGestionarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarAdministradorActionPerformed(evt);
            }
        });

        btnGestionarTagubicacion.setText("Gestionar Tags de ubicacion");
        btnGestionarTagubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarTagubicacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionarAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionarTagubicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGestionarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestionarAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestionarTagubicacion)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarProductoActionPerformed
        this.dispose();
        InterfazProducto pantalla = new InterfazProducto();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnGestionarProductoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        int opcion = 0;
        opcion = JOptionPane.showConfirmDialog(this,
                "¿Desea cerrar la sesión de administrador? \n ",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
            MenuPrincipal pantalla = new MenuPrincipal();
            pantalla.setVisible(true);

        }

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGestionarTagubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarTagubicacionActionPerformed
            this.dispose();
            InterfazTagUbicacion pantalla = new InterfazTagUbicacion();
            pantalla.setVisible(true);
    }//GEN-LAST:event_btnGestionarTagubicacionActionPerformed

    private void btnGestionarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarAdministradorActionPerformed
        this.dispose();
            InterfazUsuario pantalla = new InterfazUsuario();
            pantalla.setVisible(true);
    }//GEN-LAST:event_btnGestionarAdministradorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionarAdministrador;
    private javax.swing.JButton btnGestionarProducto;
    private javax.swing.JButton btnGestionarTagubicacion;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
