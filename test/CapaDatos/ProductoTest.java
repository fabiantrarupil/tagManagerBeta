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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of getIdProducto method, of class Producto.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getIdProducto();
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getPrecio();
    }

    /**
     * Test of getCodigoBarra method, of class Producto.
     */
    @Test
    public void testGetCodigoBarra() {
        System.out.println("getCodigoBarra");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getCodigoBarra();
    }

    /**
     * Test of getPlu method, of class Producto.
     */
    @Test
    public void testGetPlu() {
        System.out.println("getPlu");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getPlu();
    }

    /**
     * Test of getRutaQR method, of class Producto.
     */
    @Test
    public void testGetRutaQR() {
        System.out.println("getRutaQR");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getRutaQR();
    }

    /**
     * Test of getAdministrador_idAdministrador method, of class Producto.
     */
    @Test
    public void testGetAdministrador_idAdministrador() {
        System.out.println("getAdministrador_idAdministrador");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getAdministrador_idAdministrador();
    }

    /**
     * Test of setIdProducto method, of class Producto.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        int idProducto = 0;
        Producto instance = new Producto();
        instance.setIdProducto(idProducto);
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Producto instance = new Producto();
        instance.setNombre(nombre);
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 0;
        Producto instance = new Producto();
        instance.setPrecio(precio);
    }

    /**
     * Test of setCodigoBarra method, of class Producto.
     */
    @Test
    public void testSetCodigoBarra() {
        System.out.println("setCodigoBarra");
        String codigoBarra = "";
        Producto instance = new Producto();
        instance.setCodigoBarra(codigoBarra);
    }

    /**
     * Test of setPlu method, of class Producto.
     */
    @Test
    public void testSetPlu() {
        System.out.println("setPlu");
        String plu = "";
        Producto instance = new Producto();
        instance.setPlu(plu);
    }

    /**
     * Test of setRutaQR method, of class Producto.
     */
    @Test
    public void testSetRutaQR() {
        System.out.println("setRutaQR");
        String rutaQR = "";
        Producto instance = new Producto();
        instance.setRutaQR(rutaQR);
    }

    /**
     * Test of setAdministrador_idAdministrador method, of class Producto.
     */
    @Test
    public void testSetAdministrador_idAdministrador() {
        System.out.println("setAdministrador_idAdministrador");
        int administrador_idAdministrador = 0;
        Producto instance = new Producto();
        instance.setAdministrador_idAdministrador(administrador_idAdministrador);
    }

    /**
     * Test of getRutaBarcode method, of class Producto.
     */
    @Test
    public void testGetRutaBarcode() {
        System.out.println("getRutaBarcode");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getRutaBarcode();
    }

    /**
     * Test of setRutaBarcode method, of class Producto.
     */
    @Test
    public void testSetRutaBarcode() {
        System.out.println("setRutaBarcode");
        String rutaBarcode = "";
        Producto instance = new Producto();
        instance.setRutaBarcode(rutaBarcode);
    }
    
}
