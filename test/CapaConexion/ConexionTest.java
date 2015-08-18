/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaConexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kyle
 */
public class ConexionTest {
    
    public ConexionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCnn method, of class Conexion.
     */
    @Test
    public void testGetCnn() {
        System.out.println("getCnn");
        Conexion instance = new Conexion();
        Connection expResult = null;
        Connection result = instance.getCnn();
    }

    /**
     * Test of setCnn method, of class Conexion.
     */
    @Test
    public void testSetCnn() {
        System.out.println("setCnn");
        Connection cnn = null;
        Conexion instance = new Conexion();
        instance.setCnn(cnn);
    }

    /**
     * Test of getStm method, of class Conexion.
     */
    @Test
    public void testGetStm() {
        System.out.println("getStm");
        Conexion instance = new Conexion();
        Statement expResult = null;
        Statement result = instance.getStm();
    }

    /**
     * Test of setStm method, of class Conexion.
     */
    @Test
    public void testSetStm() {
        System.out.println("setStm");
        Statement stm = null;
        Conexion instance = new Conexion();
        instance.setStm(stm);
    }

    /**
     * Test of getRst method, of class Conexion.
     */
    @Test
    public void testGetRst() {
        System.out.println("getRst");
        Conexion instance = new Conexion();
        ResultSet expResult = null;
        ResultSet result = instance.getRst();
    }

    /**
     * Test of setRst method, of class Conexion.
     */
    @Test
    public void testSetRst() {
        System.out.println("setRst");
        ResultSet rst = null;
        Conexion instance = new Conexion();
        instance.setRst(rst);
    }

    /**
     * Test of getNombreBaseDatos method, of class Conexion.
     */
    @Test
    public void testGetNombreBaseDatos() {
        System.out.println("getNombreBaseDatos");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getNombreBaseDatos();
    }

    /**
     * Test of setNombreBaseDatos method, of class Conexion.
     */
    @Test
    public void testSetNombreBaseDatos() {
        System.out.println("setNombreBaseDatos");
        String nombreBaseDatos = "";
        Conexion instance = new Conexion();
        instance.setNombreBaseDatos(nombreBaseDatos);
    }

    /**
     * Test of getNombreTabla method, of class Conexion.
     */
    @Test
    public void testGetNombreTabla() {
        System.out.println("getNombreTabla");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getNombreTabla();
    }

    /**
     * Test of setNombreTabla method, of class Conexion.
     */
    @Test
    public void testSetNombreTabla() {
        System.out.println("setNombreTabla");
        String nombreTabla = "";
        Conexion instance = new Conexion();
        instance.setNombreTabla(nombreTabla);
    }

    /**
     * Test of getDriver method, of class Conexion.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getDriver();
    }

    /**
     * Test of setDriver method, of class Conexion.
     */
    @Test
    public void testSetDriver() {
        System.out.println("setDriver");
        String driver = "";
        Conexion instance = new Conexion();
        instance.setDriver(driver);
    }

    /**
     * Test of getUrl method, of class Conexion.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getUrl();
    }

    /**
     * Test of setUrl method, of class Conexion.
     */
    @Test
    public void testSetUrl() {
        System.out.println("setUrl");
        String url = "";
        Conexion instance = new Conexion();
        instance.setUrl(url);
    }

    /**
     * Test of getUser method, of class Conexion.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getUser();
    }

    /**
     * Test of setUser method, of class Conexion.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Conexion instance = new Conexion();
        instance.setUser(user);
    }

    /**
     * Test of getPassword method, of class Conexion.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getPassword();
    }

    /**
     * Test of setPassword method, of class Conexion.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Conexion instance = new Conexion();
        instance.setPassword(password);
    }

    /**
     * Test of getSentenciaSQL method, of class Conexion.
     */
    @Test
    public void testGetSentenciaSQL() {
        System.out.println("getSentenciaSQL");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getSentenciaSQL();
    }

    /**
     * Test of setSentenciaSQL method, of class Conexion.
     */
    @Test
    public void testSetSentenciaSQL() {
        System.out.println("setSentenciaSQL");
        String sentenciaSQL = "";
        Conexion instance = new Conexion();
        instance.setSentenciaSQL(sentenciaSQL);
    }

    /**
     * Test of isEsSelect method, of class Conexion.
     */
    @Test
    public void testIsEsSelect() {
        System.out.println("isEsSelect");
        Conexion instance = new Conexion();
        boolean expResult = false;
        boolean result = instance.isEsSelect();
    }

    /**
     * Test of setEsSelect method, of class Conexion.
     */
    @Test
    public void testSetEsSelect() {
        System.out.println("setEsSelect");
        boolean esSelect = false;
        Conexion instance = new Conexion();
        instance.setEsSelect(esSelect);
    }

    /**
     * Test of cerrarConexion method, of class Conexion.
     */
    @Test
    public void testCerrarConexion() {
        System.out.println("cerrarConexion");
        Conexion instance = new Conexion();
        instance.cerrarConexion();
    }

    /**
     * Test of conectar method, of class Conexion.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        Conexion instance = new Conexion();
        instance.conectar();
    }
    
}
