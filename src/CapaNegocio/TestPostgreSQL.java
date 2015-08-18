/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.sql.*; // importamos java.sql para poder trabajar con SQL :P
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyle
 */
public class TestPostgreSQL {

    public TestPostgreSQL() {
    }

    public static void main(String[] args) throws SQLException {

        String driver = "org.postgresql.Driver";
        String connecString = "jdbc:postgresql://localhost:5432/tag_manager01";
        String user = "postgres";
        String password = "root";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Hacemos la coneccion.
        Connection conn = DriverManager.getConnection(connecString, user, password);
        //Si la conexion fue realizada con exito, muestra el sgte mensaje.
        System.out.println("Conexion a la base de datos Ejemplo realizada con exito! ");
        //Cerramos la conexion
        conn.close();
    }
}
