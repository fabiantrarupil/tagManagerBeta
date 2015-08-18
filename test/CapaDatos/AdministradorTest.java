/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

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
public class AdministradorTest {
    
    public AdministradorTest() {
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
     * Test of getIdAdministrador method, of class Administrador.
     */
    @Test
    public void testGetIdAdministrador() {
        System.out.println("getIdAdministrador");
        Administrador instance = new Administrador();
        int expResult = 0;
        int result = instance.getIdAdministrador();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRut method, of class Administrador.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Administrador instance = new Administrador();
        String expResult = "";
        String result = instance.getRut();
    }

    /**
     * Test of getPassword method, of class Administrador.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Administrador instance = new Administrador();
        String expResult = "root";
        String result = instance.getPassword();
    }

    /**
     * Test of getNombre method, of class Administrador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Administrador instance = new Administrador();
        String expResult = "";
        String result = instance.getNombre();
    }

    /**
     * Test of getApellido method, of class Administrador.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Administrador instance = new Administrador();
        String expResult = "";
        String result = instance.getApellido();
    }

    /**
     * Test of setIdAdministrador method, of class Administrador.
     */
    @Test
    public void testSetIdAdministrador() {
        System.out.println("setIdAdministrador");
        int idAdministrador = 0;
        Administrador instance = new Administrador();
        instance.setIdAdministrador(idAdministrador);
    }

    /**
     * Test of setRut method, of class Administrador.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Administrador instance = new Administrador();
        instance.setRut(rut);
    }

    /**
     * Test of setPassword method, of class Administrador.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Administrador instance = new Administrador();
        instance.setPassword(password);
    }

    /**
     * Test of setNombre method, of class Administrador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Administrador instance = new Administrador();
        instance.setNombre(nombre);
    }

    /**
     * Test of setApellido method, of class Administrador.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Administrador instance = new Administrador();
        instance.setApellido(apellido);
    }
    
}
