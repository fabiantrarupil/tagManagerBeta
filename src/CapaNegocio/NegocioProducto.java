/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Producto;
import CapaGUI.JOptionPaneConTimeOut;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyle
 */
public class NegocioProducto {

    //VARIABLE DE CONEXION

    private Conexion con;

    public NegocioProducto() {
        con = new Conexion();
    }

    //Metodo para hacer la conexion con mysql
    private void configurarConexion(String nombreTabla) {
        con.setDriver("org.postgresql.Driver");
        con.setUrl("jdbc:postgresql://localhost:5432/tag_manager01");
        con.setNombreTabla(nombreTabla);
        con.setUser("postgres");
        con.setPassword("root");
    }

    //llama a joptionpane configurado con timeout
    JOptionPaneConTimeOut jt = new JOptionPaneConTimeOut();
    
    public void IngresarProducto(Producto prod) {
        this.configurarConexion("Producto");
        con.setEsSelect(false);

        //si vencimiento está desabilitado      
        con.setSentenciaSQL("INSERT INTO Producto VALUES("
                + prod.getIdProducto() + ",'"
                + prod.getNombre() + "',"
                + prod.getPrecio() + ","
                + prod.getCodigoBarra() + ",'"
                + prod.getPlu() + "','"
                + prod.getRutaQR() + "','"
                + prod.getRutaBarcode() + "',"
                + prod.getAdministrador_idAdministrador() + ");");

        jt.visualizaDialogo(null, "Ingresado exitosamente!", "Ingreso exitoso", 1000);
        System.out.println(con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();

    }

    //Consultar producto (todos)
    public ArrayList<Producto> getConsultarProducto() {
        ArrayList lista = new ArrayList();
        this.configurarConexion("producto");
        con.setEsSelect(true);
        con.setSentenciaSQL("select Producto.idProducto,"
                + " Producto.nombre, Producto.precio, Producto.codigoBarra,"
                + " Producto.plu from producto;");
        con.conectar();
        System.out.println(con.getSentenciaSQL());
        try {
            while (con.getRst().next()) {
                //se crea nuevo objeto 
                Producto prod = new Producto();
                prod.setIdProducto(con.getRst().getInt("idProducto"));
                prod.setNombre(con.getRst().getString("Nombre"));
                prod.setPrecio((con.getRst().getInt("Precio")));
                prod.setCodigoBarra(con.getRst().getString("CodigoBarra"));
                prod.setPlu((con.getRst().getString("Plu")));
                lista.add(prod);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NegocioProducto.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //metodo buscar producto por id
    public Producto buscarProducto(int idProducto) {

        Producto prod = new Producto();
        this.configurarConexion("Producto");
        con.setEsSelect(true);
        con.setSentenciaSQL("select * from "
                + con.getNombreTabla()
                + " where idProducto=" + idProducto + ";");

        System.out.println("Buscar sql " + con.getSentenciaSQL());
        con.conectar();
        try {
            if (con.getRst().next()) {
                prod.setIdProducto(con.getRst().getInt("idProducto"));
                prod.setNombre(con.getRst().getString("nombre"));
                prod.setPrecio(con.getRst().getInt("precio"));
                prod.setCodigoBarra(con.getRst().getString("codigoBarra"));
                prod.setPlu((con.getRst().getString("Plu")));
                prod.setRutaQR((con.getRst().getString("RutaQR")));
                prod.setRutaBarcode((con.getRst().getString("RutaBarcode")));

            } else {
                //si producto no existe.
                prod.setCodigoBarra("");
                prod.setNombre("");

            }
        } catch (SQLException ex) {
            Logger.getLogger(NegocioProducto.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return prod;

    }

    public void ModificarProducto(Producto prod) {
        this.configurarConexion("Producto");
        con.setEsSelect(false);

        //si vencimiento está desabilitado      
        con.setSentenciaSQL("UPDATE Producto SET nombre='"
                + prod.getNombre() + "', precio="
                + prod.getPrecio() + ", codigoBarra='"
                + prod.getCodigoBarra() + "', plu='"
                + prod.getPlu() + "', rutaQR='"
                + prod.getRutaQR() + "', rutaBarcode='"
                + prod.getRutaBarcode() + "', administrador_idAdministrador="
                + prod.getAdministrador_idAdministrador() + " WHERE idproducto="
                + prod.getIdProducto() + ";");

        jt.visualizaDialogo(null, "Modificado exitosamente!", "Modificación exitosa", 1000);
        System.out.println(con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();
    }
    
     //Eliminar producto
    public void eliminarProducto(Producto prod) {
        this.configurarConexion("producto");
        con.setEsSelect(false);
        con.setSentenciaSQL("DELETE FROM " + con.getNombreTabla()
                + " WHERE idProducto=" + prod.getIdProducto());
        System.out.println("Eliminar producto: " + con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();

        //comprueba que el registro fue eliminado
        if ((buscarProductoBoolean(prod.getIdProducto())) == false) {
            jt.visualizaDialogo(null, "Eliminado exitosamente!", "Eliminación exitosa", 1000);
        } else {
            jt.visualizaDialogo(null, "El registro NO ha sido eliminado", "Error", 1000);
        }
    }
    
    //metodo saber si esta el producto
    public boolean buscarProductoBoolean(int idProducto) {
        boolean siEsta = false;

        Producto prod = new Producto();
        this.configurarConexion("Producto");

        con.setEsSelect(true);
        con.setSentenciaSQL("SELECT * FROM "
                + con.getNombreTabla()
                + " WHERE idProducto=" + idProducto + ";");

        System.out.println("Buscar sql " + con.getSentenciaSQL());
        con.conectar();
        try {
            if (con.getRst().next()) {
                prod.setIdProducto(con.getRst().getInt("idProducto"));
                siEsta = true;
            } else {
                //si producto no existe.
                prod.setIdProducto(0);
                siEsta = false;

            }
        } catch (SQLException ex) {
            Logger.getLogger(NegocioProducto.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return siEsta;

    }
}
