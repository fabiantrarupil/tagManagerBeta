/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Producto;
import CapaDatos.TagUbicacion;
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
public class NegocioTagUbicacion {

    //Variable de Conexión.
    private Conexion con;

    public NegocioTagUbicacion() {
        con = new Conexion();
    }

    //Metodo para hacer la Conexión con MySql
    private void configurarConexion(String nombreTabla) {
        con.setDriver("org.postgresql.Driver");
        con.setUrl("jdbc:postgresql://localhost:5432/tag_manager01");
        con.setNombreTabla(nombreTabla);
        con.setUser("postgres");
        con.setPassword("root");
    }
    
    //llama a joptionpane configurado con timeout
    JOptionPaneConTimeOut jt = new JOptionPaneConTimeOut();

    public void IngresarTagUbicacion(TagUbicacion tu) {
        this.configurarConexion("TagUbicacion");
        con.setEsSelect(false);

        //Ingresar TagUbicacion a la Base de Datos
        con.setSentenciaSQL("INSERT INTO TagUbicacion VALUES("
                + tu.getIdTagUbicacion() + ","
                + tu.getNumeroPasillo() + ",'"
                + tu.getDescripcionPasillo() + "',"
                + tu.getAdministrador_idAdministrador() + ");");
        System.out.println(con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();

    }

//Consultoria de TagUbicaciones!
    public ArrayList<TagUbicacion> getConsultarTagUbicacion() {
        ArrayList lista = new ArrayList();
        this.configurarConexion("TagUbicacion");
        con.setEsSelect(true);
        con.setSentenciaSQL("select TagUbicacion.idTagUbicacion,"
                + " TagUbicacion.numeroPasillo, TagUbicacion.descripcionPasillo from TagUbicacion;");
        con.conectar();
        System.out.println(con.getSentenciaSQL());
        try {
            while (con.getRst().next()) {
                //Se crea un Nuevo Objeto
                TagUbicacion tu = new TagUbicacion();
                tu.setIdTagUbicacion(con.getRst().getInt("idTagUbicacion"));
                tu.setNumeroPasillo(con.getRst().getInt("numeroPasillo"));
                tu.setDescripcionPasillo(con.getRst().getString("descripcionPasillo"));
                lista.add(tu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NegocioTagUbicacion.class
            .getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    //Metodo Buscar Producto Por Id
    public TagUbicacion BuscarTagUbicacion(int idTagUbicacion){
        
        TagUbicacion tu  = new TagUbicacion();
        this.configurarConexion("TagUbicacion");
        con.setEsSelect(true);
        con.setSentenciaSQL("SELECT * FROM "
                + con.getNombreTabla()
                + " WHERE idTagUbicacion=" + idTagUbicacion + ";");
               
        System.out.println("Buscar sql " + con.getSentenciaSQL());
        con.conectar();
        try {
            if (con.getRst().next()){
                tu.setIdTagUbicacion(con.getRst().getInt("idTagUbicacion"));
                tu.setNumeroPasillo(con.getRst().getInt("numeroPasillo"));
                tu.setDescripcionPasillo(con.getRst().getString("descripcionPasillo"));
            } else {
                //Si Tag Ubicacion No Existe.
                tu.setIdTagUbicacion(0);
                tu.setNumeroPasillo(0);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(NegocioTagUbicacion.class
                .getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return tu;
    }
    
    public void ModificarTagUbicacion(TagUbicacion tu) {
        this.configurarConexion("TagUbicacion");
        con.setEsSelect(false);

        //si vencimiento está desabilitado      
        con.setSentenciaSQL("UPDATE TagUbicacion SET numeroPasillo="
                + tu.getNumeroPasillo()+ ", descripcionPasillo='"
                + tu.getDescripcionPasillo()+ "', administrador_idAdministrador="
                + tu.getAdministrador_idAdministrador()
                + " WHERE idTagUbicacion="
                + tu.getIdTagUbicacion()+ ";");

        jt.visualizaDialogo(null, "Modificado exitosamente!", "Modificación exitosa", 1000);
        System.out.println(con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();
    }
    
     //Eliminar producto
    public void EliminarTagUbicacion(TagUbicacion tu) {
        this.configurarConexion("TagUbicacion");
        con.setEsSelect(false);
        con.setSentenciaSQL("DELETE FROM " + con.getNombreTabla()
                + " WHERE idTagUbicacion=" + tu.getIdTagUbicacion());
        System.out.println("Eliminar TagUbicacion: " + con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();

        //comprueba que el registro fue eliminado
        if ((BuscarTagUbicacionBoolean(tu.getIdTagUbicacion())) == false) {
            jt.visualizaDialogo(null, "Eliminado exitosamente!", "Eliminación exitosa", 1000);
        } else {
            jt.visualizaDialogo(null, "El registro NO ha sido eliminado", "Error", 1000);
        }
    }
    
    //metodo saber si esta el producto
    public boolean BuscarTagUbicacionBoolean(int idTagUbicacion) {
        boolean siEsta = false;

        TagUbicacion tu = new TagUbicacion();
        this.configurarConexion("TagUbicacion");

        con.setEsSelect(true);
        con.setSentenciaSQL("SELECT * FROM "
                + con.getNombreTabla()
                + " WHERE idTagUbicacion=" + idTagUbicacion + ";");

        System.out.println("Buscar sql " + con.getSentenciaSQL());
        con.conectar();
        try {
            if (con.getRst().next()) {
                tu.setIdTagUbicacion(con.getRst().getInt("idTagUbicacion"));
                siEsta = true;
            } else {
                //si producto no existe.
                tu.setIdTagUbicacion(0);
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
