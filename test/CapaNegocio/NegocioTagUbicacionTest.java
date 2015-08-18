/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.TagUbicacion;
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
public class NegocioTagUbicacionTest {
    
    public NegocioTagUbicacionTest() {
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
     * Test of IngresarTagUbicacion method, of class NegocioTagUbicacion.
     */
    @Test
    public void testIngresarTagUbicacion() {
        System.out.println("IngresarTagUbicacion");
        TagUbicacion tag = new TagUbicacion();
        NegocioTagUbicacion instance = new NegocioTagUbicacion();
        instance.IngresarTagUbicacion(tag);
    }

    /**
     * Test of getConsultarTagUbicacion method, of class NegocioTagUbicacion.
     */
    @Test
    public void testGetConsultarTagUbicacion() {
        System.out.println("getConsultarTagUbicacion");
        NegocioTagUbicacion instance = new NegocioTagUbicacion();
        ArrayList<TagUbicacion> expResult = null;
        ArrayList<TagUbicacion> result = instance.getConsultarTagUbicacion();
        
    }

    /**
     * Test of BuscarTagUbicacion method, of class NegocioTagUbicacion.
     */
    @Test
    public void testBuscarTagUbicacion() {
        System.out.println("BuscarTagUbicacion");
        int idTagUbicacion = 0;
        NegocioTagUbicacion instance = new NegocioTagUbicacion();
        TagUbicacion expResult = null;
        TagUbicacion result = instance.BuscarTagUbicacion(idTagUbicacion);
        
    }

    /**
     * Test of ModificarTagUbicacion method, of class NegocioTagUbicacion.
     */
    @Test
    public void testModificarTagUbicacion() {
        System.out.println("ModificarTagUbicacion");
        TagUbicacion tu = new TagUbicacion();
        NegocioTagUbicacion instance = new NegocioTagUbicacion();
        instance.ModificarTagUbicacion(tu);
    }

    /**
     * Test of EliminarTagUbicacion method, of class NegocioTagUbicacion.
     */
    @Test
    public void testEliminarTagUbicacion() {
        System.out.println("EliminarTagUbicacion");
        TagUbicacion tu = new TagUbicacion();
        NegocioTagUbicacion instance = new NegocioTagUbicacion();
        instance.EliminarTagUbicacion(tu);
    }

    /**
     * Test of BuscarTagUbicacionBoolean method, of class NegocioTagUbicacion.
     */
    @Test
    public void testBuscarTagUbicacionBoolean() {
        System.out.println("BuscarTagUbicacionBoolean");
        int idTagUbicacion = 0;
        NegocioTagUbicacion instance = new NegocioTagUbicacion();
        boolean expResult = false;
        boolean result = instance.BuscarTagUbicacionBoolean(idTagUbicacion);
        
    }
    
}
