/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDatos.TagUbicacion;
import CapaNegocio.NegocioTagUbicacion;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kyle
 */
public class InterfazTagUbicacion extends javax.swing.JFrame {

    /**
     * Creates new form InterfazTagUbicacion
     */
    public InterfazTagUbicacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarTabla();
    }

     //llama a la clase negocio
    NegocioTagUbicacion neg = new NegocioTagUbicacion();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDTagUbicacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroPasillo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionPasillo = new javax.swing.JTextArea();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsultarTagUbicacion = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion Tag Ubicacion");

        jLabel1.setText("ID:");

        jLabel2.setText("Numero pasillo:");

        jLabel3.setText("Descripción:");

        txtDescripcionPasillo.setColumns(20);
        txtDescripcionPasillo.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionPasillo);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblConsultarTagUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblConsultarTagUbicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarTagUbicacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblConsultarTagUbicacion);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnLimpiar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNumeroPasillo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                            .addComponent(txtIDTagUbicacion, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDTagUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumeroPasillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)
                            .addComponent(btnIngresar)
                            .addComponent(btnLimpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // Guardar datos en objeto
        TagUbicacion tu = new TagUbicacion();
        tu.setIdTagUbicacion(Integer.parseInt(this.txtIDTagUbicacion.getText().trim()));
        tu.setNumeroPasillo(Integer.parseInt(this.txtNumeroPasillo.getText().trim()));
        tu.setDescripcionPasillo(this.txtDescripcionPasillo.getText().trim().toUpperCase());
        
        tu.setAdministrador_idAdministrador(1);
        neg.IngresarTagUbicacion(tu);

        
        this.mostrarTabla();
        this.limpiarCampos();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //modificarf por id
        if ((this.txtIDTagUbicacion.getText().trim().equals(""))
            || (this.txtIDTagUbicacion.getText().trim().equals("0"))) {
            JOptionPane.showMessageDialog(this,
                "Debe seleccionar un Tag de ubicacion o ingresar un ID",
                "Error al Eliminar",
                JOptionPane.ERROR_MESSAGE);
            this.btnEliminar.requestFocus();
            return;
        } else {

           // Guardar datos en objeto
        TagUbicacion tu = new TagUbicacion();
        tu.setIdTagUbicacion(Integer.parseInt(this.txtIDTagUbicacion.getText().trim()));
        tu.setNumeroPasillo(Integer.parseInt(this.txtNumeroPasillo.getText().trim()));
        tu.setDescripcionPasillo(this.txtDescripcionPasillo.getText().trim().toUpperCase());
        
        tu.setAdministrador_idAdministrador(1);
        neg.ModificarTagUbicacion(tu);

           
            this.mostrarTabla();
            this.limpiarCampos();
        }//fin else
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        TagUbicacion tu = new TagUbicacion();

        //eliminar por id
        if ((this.txtIDTagUbicacion.getText().trim().equals(""))
            || (this.txtIDTagUbicacion.getText().trim().equals("0"))) {
            JOptionPane.showMessageDialog(this,
                "Debe seleccionar un TagUbicación o ingresar un ID",
                "Error al Eliminar",
                JOptionPane.ERROR_MESSAGE);
            this.btnEliminar.requestFocus();
            return;
        } else {

            int opcion = 0;
            opcion = JOptionPane.showConfirmDialog(this,
                "Â¿Desea eliminar el TagUbicación? \n ",
                "Confirmar EliminaciÃ³n",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if (opcion == JOptionPane.YES_OPTION) {
                tu.setIdTagUbicacion(Integer.parseInt(this.txtIDTagUbicacion.getText().trim()));
                neg.EliminarTagUbicacion(tu);
                //jt.visualizaDialogo(this, "Eliminado exitosamente!", "EliminaciÃ³n exitosa", 1000);

                this.mostrarTabla();

            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        MenuAdministrador pantalla = new MenuAdministrador();
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tblConsultarTagUbicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarTagUbicacionMouseClicked
        if (evt.getButton() == 1) {
            //cambia font
            //consigue la fila seleccionada
            int row = this.tblConsultarTagUbicacion.getSelectedRow();

            //crea el objeto
            TagUbicacion tu = new TagUbicacion();
            try {
                //cantidad total de objetos (a partir de 1)
                Object[] datos = new Object[3];

                for (int i = 0; i < datos.length; i++) {
                    datos[i] = this.tblConsultarTagUbicacion.getValueAt(row, i);
                }
                //Se rescata el id del producto a partir del dato de la fila
                tu = neg.BuscarTagUbicacion(Integer.parseInt(datos[0].toString()));
                if (tu.getIdTagUbicacion()!= 0) {

                    //setea campos
                    this.txtIDTagUbicacion.setText("" + tu.getIdTagUbicacion());
                    this.txtNumeroPasillo.setText("" + tu.getNumeroPasillo());
                    this.txtDescripcionPasillo.setText(tu.getDescripcionPasillo());
                    
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Tag ubicacion no existe",
                            "Error de busqueda", JOptionPane.ERROR_MESSAGE);
                }

                //Atrapa el error
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this,
                        "Ocurrio un error",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);

                return;
            }
        }
    }//GEN-LAST:event_tblConsultarTagUbicacionMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazTagUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazTagUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazTagUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazTagUbicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazTagUbicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblConsultarTagUbicacion;
    private javax.swing.JTextArea txtDescripcionPasillo;
    private javax.swing.JTextField txtIDTagUbicacion;
    private javax.swing.JTextField txtNumeroPasillo;
    // End of variables declaration//GEN-END:variables

     private void mostrarTabla() {
        ArrayList<TagUbicacion> lista = neg.getConsultarTagUbicacion();

        //numero de objetos
        Object[] datos = new Object[3];
 

        //Tabla seleccionable pero NO editable
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //Para ordenar tabla con click en cabecera
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(modelo);
        tblConsultarTagUbicacion.setRowSorter(elQueOrdena);

        //Definir las columnas del modelo
        modelo.addColumn("ID");
        modelo.addColumn("Numero Pasillo");
        modelo.addColumn("Descripción");


        //tblConsultarProducto.setDefaultRenderer(Object.class, new TableCellRendererProducto());
        for (int i = 0; i < lista.size(); i++) {
            TagUbicacion tu = lista.get(i);

            datos[0] = tu.getIdTagUbicacion();
            datos[1] = tu.getNumeroPasillo();
            datos[2] = tu.getDescripcionPasillo();
            

            modelo.addRow(datos);

        }

        this.tblConsultarTagUbicacion.setModel(modelo);
        this.tblConsultarTagUbicacion.getTableHeader().setReorderingAllowed(true);

    }

    
    private void limpiarCampos() {

        this.txtIDTagUbicacion.setText("");
        this.txtNumeroPasillo.setText("");
        this.txtDescripcionPasillo.setText("");

    }

}
