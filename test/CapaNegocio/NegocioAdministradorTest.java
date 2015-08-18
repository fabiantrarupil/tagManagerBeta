/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Administrador;
import java.util.ArrayList;
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
public class NegocioAdministradorTest {
    
    public NegocioAdministradorTest() {
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
     * Test of IdentificarAdministrador method, of class NegocioAdministrador.
     */
    @Test
    public void testIdentificarAdministrador() {
        System.out.println("IdentificarAdministrador");
        String rut = "";
        String password = "";
        NegocioAdministrador instance = new NegocioAdministrador();
        boolean expResult = false;
        boolean result = instance.IdentificarAdministrador(rut, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of IngresarAdministrador method, of class NegocioAdministrador.
     */
    @Test
    public void testIngresarAdministrador() {
        System.out.println("IngresarAdministrador");
        Administrador adm = new Administrador();
        NegocioAdministrador instance = new NegocioAdministrador();
        instance.IngresarAdministrador(adm);
    }

    /**
     * Test of getConsultarAdministrador method, of class NegocioAdministrador.
     */
    @Test
    public void testGetConsultarAdministrador() {
        System.out.println("getConsultarAdministrador");
        NegocioAdministrador instance = new NegocioAdministrador();
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = instance.getConsultarAdministrador();
    }

    /**
     * Test of BuscarAdministrador method, of class NegocioAdministrador.
     */
    @Test
    public void testBuscarAdministrador() {
        System.out.println("BuscarAdministrador");
        int idAdministrador = 0;
        NegocioAdministrador instance = new NegocioAdministrador();
        Administrador expResult = null;
        Administrador result = instance.BuscarAdministrador(idAdministrador);
    }

    /**
     * Test of ModificarAdministrador method, of class NegocioAdministrador.
     */
    @Test
    public void testModificarAdministrador() {
        System.out.println("ModificarAdministrador");
        Administrador adm = new Administrador();
        NegocioAdministrador instance = new NegocioAdministrador();
        instance.ModificarAdministrador(adm);
    }

    /**
     * Test of eliminarAdministrador method, of class NegocioAdministrador.
     */
    @Test
    public void testEliminarAdministrador() {
        System.out.println("eliminarAdministrador");
        Administrador adm = new Administrador();
        NegocioAdministrador instance = new NegocioAdministrador();
        instance.eliminarAdministrador(adm);
    }

    /**
     * Test of BuscarProductoBoolean method, of class NegocioAdministrador.
     */
    @Test
    public void testBuscarProductoBoolean() {
        System.out.println("BuscarProductoBoolean");
        int idAdministrador = 0;
        NegocioAdministrador instance = new NegocioAdministrador();
        boolean expResult = false;
        boolean result = instance.BuscarProductoBoolean(idAdministrador);
        assertEquals(expResult, result);
    }
    
}
