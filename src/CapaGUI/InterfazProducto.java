/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDatos.Producto;
import CapaNegocio.NegocioProducto;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kyle
 */
public class InterfazProducto extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public InterfazProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarTabla();
    }

    //llama a la clase negocio
    NegocioProducto neg = new NegocioProducto();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtCodigoBarraProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGenerarQR = new javax.swing.JButton();
        txtPLUProducto = new javax.swing.JTextField();
        btnGenerarCodigoBarra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDProducto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        lblQR = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultarProducto = new javax.swing.JTable();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblRutaBarcodeProducto = new javax.swing.JLabel();
        lblRutaQRProducto = new javax.swing.JLabel();
        lblBarcode = new javax.swing.JLabel();
        lblCodebar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestionar Productos");

        jLabel4.setText("Codigo de barra:");

        txtCodigoBarraProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoBarraProductoKeyTyped(evt);
            }
        });

        jLabel5.setText("PLU:");

        btnGenerarQR.setText("Generar QR");
        btnGenerarQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarQRActionPerformed(evt);
            }
        });

        txtPLUProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPLUProductoKeyTyped(evt);
            }
        });

        btnGenerarCodigoBarra.setText("Generar Codigo de barra");
        btnGenerarCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoBarraActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel6.setText("Ruta QR:");

        jLabel2.setText("Nombre:");

        txtIDProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDProductoKeyTyped(evt);
            }
        });

        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });

        jLabel3.setText("Precio:");

        txtPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProductoKeyTyped(evt);
            }
        });

        lblQR.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\TagManagerBeta\\qr_images\\default_qr.png")); // NOI18N

        tblConsultarProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tblConsultarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConsultarProducto);

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

        btnVolver.setText("Volver");
        btnVolver.setName("Gestion de producto"); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel7.setText("Ruta Cod. Barra:");

        lblRutaBarcodeProducto.setText("RUTACODIGOBARRA");

        lblRutaQRProducto.setText("RUTACODIGOQR");

        lblCodebar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kyle\\Documents\\NetBeansProjects\\TagManagerBeta\\barcode_images\\default_codebar.gif")); // NOI18N

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQR, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGenerarCodigoBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBarcode)
                                    .addComponent(lblCodebar)
                                    .addComponent(btnGenerarQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel7))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRutaBarcodeProducto)
                                    .addComponent(txtPLUProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoBarraProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addComponent(txtNombreProducto)
                                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRutaQRProducto))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigoBarraProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtPLUProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblRutaQRProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRutaBarcodeProducto)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)
                            .addComponent(btnIngresar)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerarQR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerarCodigoBarra)
                                .addGap(76, 76, 76)
                                .addComponent(lblBarcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCodebar))
                            .addComponent(lblQR, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(11, 11, 11)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        getRootPane().setDefaultButton(btnGenerarQR);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarQRActionPerformed

        this.generarQR();
        this.cambiarQR();

    }//GEN-LAST:event_btnGenerarQRActionPerformed

    private void btnGenerarCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoBarraActionPerformed

        this.generarCodebar();
        this.cambiarBarcode();

    }//GEN-LAST:event_btnGenerarCodigoBarraActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // Guardar datos en objeto
        Producto prod = new Producto();
        prod.setIdProducto(Integer.parseInt(this.txtIDProducto.getText().trim()));
        prod.setCodigoBarra(this.txtCodigoBarraProducto.getText().trim());
        prod.setNombre(this.txtNombreProducto.getText().trim().toUpperCase());
        prod.setPlu(this.txtPLUProducto.getText().trim());
        prod.setRutaQR("qr_images//qr_" + this.txtIDProducto.getText().trim() + ".png");
        prod.setRutaBarcode("barcode_images//codebar_" + this.txtIDProducto.getText().trim() + ".png");
        prod.setPrecio(Integer.parseInt(this.txtPrecioProducto.getText().trim()));
        prod.setAdministrador_idAdministrador(1);
        neg.IngresarProducto(prod);

        this.generarQR();
        this.generarCodebar();
        this.mostrarTabla();
        this.limpiarCampos();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtCodigoBarraProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarraProductoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (txtCodigoBarraProducto.getText().length() >= 13) {
            evt.consume();
        }
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z')
                && (car < 'A' || car > 'Z')
                && (car != 'ñ')
                && (car != 'Ñ')
                && (car != '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoBarraProductoKeyTyped

    private void txtPLUProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPLUProductoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (txtPLUProducto.getText().length() >= 13) {
            evt.consume();
        }
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z')
                && (car < 'A' || car > 'Z')
                && (car != 'ñ')
                && (car != 'Ñ')
                && (car != '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPLUProductoKeyTyped

    private void txtPrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProductoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (txtPrecioProducto.getText().length() >= 13) {
            evt.consume();
        }
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioProductoKeyTyped

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped

        // elimina caracteres no validos
        char car = evt.getKeyChar();
        if (txtNombreProducto.getText().length() >= 45) {
            evt.consume();
        }
        if ((car < '0' || car > '9')
                && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_SPACE)
                && (car != 'ñ')
                && (car != 'Ñ')
                && (car != '.')
                && (car != '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtIDProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDProductoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (txtIDProducto.getText().length() >= 13) {
            evt.consume();
        }
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDProductoKeyTyped

    private void tblConsultarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarProductoMouseClicked
        if (evt.getButton() == 1) {
            //cambia font
            //consigue la fila seleccionada
            int row = this.tblConsultarProducto.getSelectedRow();

            //crea el objeto
            Producto prod = new Producto();
            try {
                //cantidad total de objetos (a partir de 1)
                Object[] datos = new Object[5];

                for (int i = 0; i < datos.length; i++) {
                    datos[i] = this.tblConsultarProducto.getValueAt(row, i);
                }
                //Se rescata el id del producto a partir del dato de la fila
                prod = neg.buscarProducto(Integer.parseInt(datos[0].toString()));
                if (prod.getIdProducto() != 0) {

                    //setea campos
                    this.txtIDProducto.setText("" + prod.getIdProducto());
                    this.txtCodigoBarraProducto.setText(prod.getCodigoBarra());
                    this.txtNombreProducto.setText(prod.getNombre());
                    this.txtPrecioProducto.setText("" + prod.getPrecio());
                    this.txtPLUProducto.setText("" + prod.getPlu());
                    this.lblRutaQRProducto.setText("" + prod.getRutaQR());
                    this.lblRutaBarcodeProducto.setText("" + prod.getRutaBarcode());

                    //Cambia QR
                    this.cambiarQR();

                    //Cambia Barcode
                    this.cambiarBarcode();
                   

                } else {
                    JOptionPane.showMessageDialog(this, "Producto no existe",
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
    }//GEN-LAST:event_tblConsultarProductoMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      //modificarf por id
            if ((this.txtIDProducto.getText().trim().equals(""))
                    || (this.txtIDProducto.getText().trim().equals("0"))) {
                JOptionPane.showMessageDialog(this,
                        "Debe seleccionar un producto o ingresar un ID",
                        "Error al Eliminar",
                        JOptionPane.ERROR_MESSAGE);
                this.btnEliminar.requestFocus();
                return;
            } else {

        
        // Guardar datos en objeto
        Producto prod = new Producto();
        prod.setIdProducto(Integer.parseInt(this.txtIDProducto.getText().trim()));
        prod.setCodigoBarra(this.txtCodigoBarraProducto.getText().trim());
        prod.setNombre(this.txtNombreProducto.getText().trim().toUpperCase());
        prod.setPlu(this.txtPLUProducto.getText().trim());
        prod.setRutaQR("qr_images//qr_" + this.txtIDProducto.getText().trim() + ".png");
        prod.setRutaBarcode("barcode_images//codebar_" + this.txtIDProducto.getText().trim() + ".png");
        prod.setPrecio(Integer.parseInt(this.txtPrecioProducto.getText().trim()));
        prod.setAdministrador_idAdministrador(1);
        neg.ModificarProducto(prod);

        this.generarQR();
        this.generarCodebar();
        this.mostrarTabla();
        this.limpiarCampos();
            }//fin else
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
            Producto prod = new Producto();

            //eliminar por id
            if ((this.txtIDProducto.getText().trim().equals(""))
                    || (this.txtIDProducto.getText().trim().equals("0"))) {
                JOptionPane.showMessageDialog(this,
                        "Debe seleccionar un producto o ingresar un ID",
                        "Error al Eliminar",
                        JOptionPane.ERROR_MESSAGE);
                this.btnEliminar.requestFocus();
                return;
            } else {

                int opcion = 0;
                opcion = JOptionPane.showConfirmDialog(this,
                        "¿Desea eliminar el producto? \n ",
                        "Confirmar Eliminación",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (opcion == JOptionPane.YES_OPTION) {
                    prod.setIdProducto(Integer.parseInt(this.txtIDProducto.getText().trim()));
                    neg.eliminarProducto(prod);
                //jt.visualizaDialogo(this, "Eliminado exitosamente!", "Eliminación exitosa", 1000);

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
            java.util.logging.Logger.getLogger(InterfazProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarCodigoBarra;
    private javax.swing.JButton btnGenerarQR;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblCodebar;
    private javax.swing.JLabel lblQR;
    private javax.swing.JLabel lblRutaBarcodeProducto;
    private javax.swing.JLabel lblRutaQRProducto;
    private javax.swing.JTable tblConsultarProducto;
    private javax.swing.JTextField txtCodigoBarraProducto;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPLUProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
//Metodo para mostrar tabla

    private void mostrarTabla() {
        ArrayList<Producto> lista = neg.getConsultarProducto();

        //numero de objetos
        Object[] datos = new Object[5];
        //llamar a decimal format para formatear precio
        DecimalFormat df = new DecimalFormat("$ #,###");

        //Tabla seleccionable pero NO editable
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //Para ordenar tabla con click en cabecera
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(modelo);
        tblConsultarProducto.setRowSorter(elQueOrdena);

        //Definir las columnas del modelo
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Codigo de Barra");
        modelo.addColumn("PLU");

        //tblConsultarProducto.setDefaultRenderer(Object.class, new TableCellRendererProducto());
        for (int i = 0; i < lista.size(); i++) {
            Producto prod = lista.get(i);

            datos[0] = prod.getIdProducto();
            datos[1] = prod.getNombre();
            datos[2] = (df.format(prod.getPrecio()));
            datos[3] = prod.getCodigoBarra();
            datos[4] = prod.getPlu();

            modelo.addRow(datos);

        }

        this.tblConsultarProducto.setModel(modelo);
        this.tblConsultarProducto.getTableHeader().setReorderingAllowed(true);

    }

    private void generarQR() {
        String aux = "";
        String a = this.txtNombreProducto.getText();
        String b = this.txtPrecioProducto.getText();
        aux = "Nombre: " + a + "/" + "Precio: " + b;
        int idProdcuto = Integer.parseInt(this.txtIDProducto.getText().trim());

        CapaGUI.GeneradorQR e = new CapaGUI.GeneradorQR(aux, idProdcuto);

    }

    private void generarCodebar() {
        GeneradorCodigoBarra g
                = new GeneradorCodigoBarra(Integer.parseInt(this.txtIDProducto.getText().trim()),
                        this.txtCodigoBarraProducto.getText().trim());
    }

    private void limpiarCampos() {

        this.txtIDProducto.setText("");
        this.txtCodigoBarraProducto.setText("");
        this.txtNombreProducto.setText("");
        this.txtPrecioProducto.setText("");
        this.txtPLUProducto.setText("");
    }

    private void cambiarQR() {
    ImageIcon imagen = null;
                    imagen = new ImageIcon(this.lblRutaQRProducto.getText());
                    this.lblQR.setIcon(imagen);
                    this.lblQR.repaint();   
    }

    private void cambiarBarcode() {
     ImageIcon imagen2 = null;
                    imagen2 = new ImageIcon(this.lblRutaBarcodeProducto.getText());
                    this.lblCodebar.setIcon(imagen2);
                    this.lblCodebar.repaint();  
    }

}
