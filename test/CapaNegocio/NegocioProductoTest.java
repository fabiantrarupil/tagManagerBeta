/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Producto;
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
public class NegocioProductoTest {
    
    public NegocioProductoTest() {
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
     * Test of IngresarProducto method, of class NegocioProducto.
     */
    @Test
    public void testIngresarProducto() {
        System.out.println("IngresarProducto");
        Producto prod = new Producto();
        NegocioProducto instance = new NegocioProducto();
        instance.IngresarProducto(prod);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getConsultarProducto method, of class NegocioProducto.
     */
    @Test
    public void testGetConsultarProducto() {
        System.out.println("getConsultarProducto");
        NegocioProducto instance = new NegocioProducto();
        ArrayList<Producto> expResult = null;
        ArrayList<Producto> result = instance.getConsultarProducto();
        
    }

    /**
     * Test of buscarProducto method, of class NegocioProducto.
     */
    @Test
    public void testBuscarProducto() {
        System.out.println("buscarProducto");
        int idProducto = 0;
        NegocioProducto instance = new NegocioProducto();
        Producto expResult = null;
        Producto result = instance.buscarProducto(idProducto);
        
    }

    /**
     * Test of ModificarProducto method, of class NegocioProducto.
     */
    @Test
    public void testModificarProducto() {
        System.out.println("ModificarProducto");
        Producto prod = new Producto();
        NegocioProducto instance = new NegocioProducto();
        instance.ModificarProducto(prod);
    }

    /**
     * Test of eliminarProducto method, of class NegocioProducto.
     */
    @Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        Producto prod = new Producto();
        NegocioProducto instance = new NegocioProducto();
        instance.eliminarProducto(prod);
    }

    /**
     * Test of buscarProductoBoolean method, of class NegocioProducto.
     */
    @Test
    public void testBuscarProductoBoolean() {
        System.out.println("buscarProductoBoolean");
        int idProducto = 0;
        NegocioProducto instance = new NegocioProducto();
        boolean expResult = false;
        boolean result = instance.buscarProductoBoolean(idProducto);
        assertEquals(expResult, result);
    }
    
}
