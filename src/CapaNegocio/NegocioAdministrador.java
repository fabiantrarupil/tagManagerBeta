/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Administrador;
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
public class NegocioAdministrador {

    //Variable de Conexión
    private Conexion con;

    public NegocioAdministrador() {
        con = new Conexion();
    }

    //Metodo para hacer la conexión con MySQL
    private void configurarConexion(String nombreTabla) {
        con.setDriver("org.postgresql.Driver");
        con.setUrl("jdbc:postgresql://localhost:5432/tag_manager01");
        con.setNombreTabla(nombreTabla);
        con.setUser("postgres");
        con.setPassword("root");
    }

   //Llama a JOptionPane configurado con TimeOut
    JOptionPaneConTimeOut jt = new JOptionPaneConTimeOut();


    /*
     * METODOS PARA IDENTIFICAR
     */
    public boolean IdentificarAdministrador(String rut, String password) {
        ArrayList lista = new ArrayList();
        
        this.configurarConexion("Administrador");
        con.setEsSelect(true);
        con.setSentenciaSQL("SELECT * FROM Administrador"
                + " where rut='" + rut+ "' and password='" + password + "';");
        con.conectar();
        System.out.println(con.getSentenciaSQL());

        try {

            while (con.getRst().next()) {
                //se crea nuevo objeto 
                Administrador adm = new Administrador();
                adm.setRut(con.getRst().getString("rut"));
                adm.setPassword(con.getRst().getString("password"));                
                lista.add(adm);
               return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(NegocioAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void IngresarAdministrador(Administrador adm) {
        this.configurarConexion("Administrador");
        con.setEsSelect(false);

        //Ingreso a la Base de Datos
        con.setSentenciaSQL("INSERT INTO Administrador VALUES("
                + adm.getIdAdministrador() + ",'"
                + adm.getRut() + "','"
                + adm.getPassword() + "','"
                + adm.getNombre() + "','"
                + adm.getApellido() + "');");
        System.out.println(con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();
    }

    //Consultar Administrador(Todos)...Como estaba puesto :3
    public ArrayList<Administrador> getConsultarAdministrador() {
        ArrayList lista = new ArrayList();
        this.configurarConexion("administrador");
        con.setEsSelect(true);
        con.setSentenciaSQL("select Administrador.idAdministrador,"
                + " Administrador.rut, Administrador.password, Administrador.nombre, "
                + " Administrador.apellido from administrador;");
        con.conectar();
        System.out.println(con.getSentenciaSQL());
        try {
            while (con.getRst().next()) {
                //Se crea un Nuevo Objeto.
            
            Administrador adm = new Administrador();
            adm.setIdAdministrador(con.getRst().getInt("idAdministrador"));
            adm.setRut(con.getRst().getString("rut"));
            adm.setPassword(con.getRst().getString("password"));
            adm.setNombre(con.getRst().getString("nombre"));
            adm.setApellido(con.getRst().getString("apellido"));
            lista.add(adm);
        }
    }catch (SQLException ex){
        Logger.getLogger(NegocioAdministrador.class
                .getName()).log(Level.SEVERE, null, ex);
    }
    return lista;
    }
    
    //Metodo Buscar Administrador como estaba el buscar Producto.
    public Administrador BuscarAdministrador(int idAdministrador){
        
        Administrador adm = new Administrador();
        this.configurarConexion("Administrador");
        con.setEsSelect(true);
        con.setSentenciaSQL("select * from "
                + con.getNombreTabla()
                + " where idAdministrador=" + idAdministrador + ";");
        
        System.out.println("Buscar sql " + con.getSentenciaSQL());
        con.conectar();
        try{
            if (con.getRst().next()) {
                adm.setIdAdministrador(con.getRst().getInt("idAdministrador"));
                adm.setRut(con.getRst().getString("rut"));
                adm.setPassword(con.getRst().getString("password"));
                adm.setNombre(con.getRst().getString("nombre"));
                adm.setApellido(con.getRst().getString("apellido"));
                
            } else {
                //Si Administrador No Existe.
                adm.setIdAdministrador(0);
                adm.setRut("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NegocioAdministrador.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return adm;
    
    }
    
    public void ModificarAdministrador(Administrador adm) {
        this.configurarConexion("Administrador");
        con.setEsSelect(false);

        //si vencimiento está desabilitado      
        con.setSentenciaSQL("UPDATE Administrador SET rut='"
                + adm.getRut()+ "', password='"
                + adm.getPassword()+ "', nombre='"
                + adm.getNombre()+ "', apellido='"
                + adm.getApellido()+ "' WHERE idAdministrador="
                + adm.getIdAdministrador()+ ";");

        jt.visualizaDialogo(null, "Modificado exitosamente!", "Modificación exitosa", 1000);
        System.out.println(con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();
    }
    
     //Eliminar producto
    public void eliminarAdministrador(Administrador adm) {
        this.configurarConexion("Administrador");
        con.setEsSelect(false);
        con.setSentenciaSQL("DELETE FROM " + con.getNombreTabla()
                + " WHERE idAdministrador=" + adm.getIdAdministrador());
        System.out.println("Eliminar adm: " + con.getSentenciaSQL());
        con.conectar();
        con.cerrarConexion();

        //comprueba que el registro fue eliminado
        if ((BuscarProductoBoolean(adm.getIdAdministrador())) == false) {
            jt.visualizaDialogo(null, "Eliminado exitosamente!", "Eliminación exitosa", 1000);
        } else {
            jt.visualizaDialogo(null, "El registro NO ha sido eliminado", "Error", 1000);
        }
    }
    
    //metodo saber si esta el producto
    public boolean BuscarProductoBoolean(int idAdministrador) {
        boolean siEsta = false;

        Administrador adm = new Administrador();
        this.configurarConexion("Administrador");
        con.setEsSelect(true);
        con.setSentenciaSQL("SELECT * FROM "
                + con.getNombreTabla()
                + " WHERE idAdministrador=" + idAdministrador + ";");

        System.out.println("Buscar sql " + con.getSentenciaSQL());
        con.conectar();
        try {
            if (con.getRst().next()) {
                adm.setIdAdministrador(con.getRst().getInt("idAdministrador"));
                siEsta = true;
            } else {
                //si producto no existe.
                adm.setIdAdministrador(0);
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

