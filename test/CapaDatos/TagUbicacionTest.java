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
public class TagUbicacionTest {
    
    public TagUbicacionTest() {
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
     * Test of getIdTagUbicacion method, of class TagUbicacion.
     */
    @Test
    public void testGetIdTagUbicacion() {
        System.out.println("getIdTagUbicacion");
        TagUbicacion instance = new TagUbicacion();
        int expResult = 0;
        int result = instance.getIdTagUbicacion();
    }

    /**
     * Test of getNumeroPasillo method, of class TagUbicacion.
     */
    @Test
    public void testGetNumeroPasillo() {
        System.out.println("getNumeroPasillo");
        TagUbicacion instance = new TagUbicacion();
        int expResult = 0;
        int result = instance.getNumeroPasillo();
    }

    /**
     * Test of getDescripcionPasillo method, of class TagUbicacion.
     */
    @Test
    public void testGetDescripcionPasillo() {
        System.out.println("getDescripcionPasillo");
        TagUbicacion instance = new TagUbicacion();
        String expResult = "";
        String result = instance.getDescripcionPasillo();
    }

    /**
     * Test of getAdministrador_idAdministrador method, of class TagUbicacion.
     */
    @Test
    public void testGetAdministrador_idAdministrador() {
        System.out.println("getAdministrador_idAdministrador");
        TagUbicacion instance = new TagUbicacion();
        int expResult = 0;
        int result = instance.getAdministrador_idAdministrador();
    }

    /**
     * Test of setIdTagUbicacion method, of class TagUbicacion.
     */
    @Test
    public void testSetIdTagUbicacion() {
        System.out.println("setIdTagUbicacion");
        int idTagUbicacion = 0;
        TagUbicacion instance = new TagUbicacion();
        instance.setIdTagUbicacion(idTagUbicacion);
    }

    /**
     * Test of setNumeroPasillo method, of class TagUbicacion.
     */
    @Test
    public void testSetNumeroPasillo() {
        System.out.println("setNumeroPasillo");
        int numeroPasillo = 0;
        TagUbicacion instance = new TagUbicacion();
        instance.setNumeroPasillo(numeroPasillo);
    }

    /**
     * Test of setDescripcionPasillo method, of class TagUbicacion.
     */
    @Test
    public void testSetDescripcionPasillo() {
        System.out.println("setDescripcionPasillo");
        String descripcionPasillo = "";
        TagUbicacion instance = new TagUbicacion();
        instance.setDescripcionPasillo(descripcionPasillo);
    }

    /**
     * Test of setAdministrador_idAdministrador method, of class TagUbicacion.
     */
    @Test
    public void testSetAdministrador_idAdministrador() {
        System.out.println("setAdministrador_idAdministrador");
        int administrador_idAdministrador = 0;
        TagUbicacion instance = new TagUbicacion();
        instance.setAdministrador_idAdministrador(administrador_idAdministrador);
    }
    
}
