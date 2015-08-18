/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author Kyle
 */
public class Producto {
    
    private int idProducto;
    private String nombre;
    private int precio;
    private String codigoBarra;
    private String plu;
    private String rutaQR;
    private String rutaBarcode;
    private int administrador_idAdministrador;

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @return the codigoBarra
     */
    public String getCodigoBarra() {
        return codigoBarra;
    }

    /**
     * @return the plu
     */
    public String getPlu() {
        return plu;
    }

    /**
     * @return the rutaQR
     */
    public String getRutaQR() {
        return rutaQR;
    }

    /**
     * @return the administrador_idAdministrador
     */
    public int getAdministrador_idAdministrador() {
        return administrador_idAdministrador;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @param codigoBarra the codigoBarra to set
     */
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    /**
     * @param plu the plu to set
     */
    public void setPlu(String plu) {
        this.plu = plu;
    }

    /**
     * @param rutaQR the rutaQR to set
     */
    public void setRutaQR(String rutaQR) {
        this.rutaQR = rutaQR;
    }

    /**
     * @param administrador_idAdministrador the administrador_idAdministrador to set
     */
    public void setAdministrador_idAdministrador(int administrador_idAdministrador) {
        this.administrador_idAdministrador = administrador_idAdministrador;
    }

    /**
     * @return the rutaBarcode
     */
    public String getRutaBarcode() {
        return rutaBarcode;
    }

    /**
     * @param rutaBarcode the rutaBarcode to set
     */
    public void setRutaBarcode(String rutaBarcode) {
        this.rutaBarcode = rutaBarcode;
    }
    
    
    
}
