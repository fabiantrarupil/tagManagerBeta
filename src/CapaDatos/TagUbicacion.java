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
public class TagUbicacion {

    private int idTagUbicacion;
    private int numeroPasillo;
    private String descripcionPasillo;
    private int administrador_idAdministrador;

    /**
     * @return the idTagUbicacion
     */
    public int getIdTagUbicacion() {
        return idTagUbicacion;
    }

    /**
     * @return the numeroPasillo
     */
    public int getNumeroPasillo() {
        return numeroPasillo;
    }

    /**
     * @return the descripcionPasillo
     */
    public String getDescripcionPasillo() {
        return descripcionPasillo;
    }

    /**
     * @return the administrador_idAdministrador
     */
    public int getAdministrador_idAdministrador() {
        return administrador_idAdministrador;
    }

    /**
     * @param idTagUbicacion the idTagUbicacion to set
     */
    public void setIdTagUbicacion(int idTagUbicacion) {
        this.idTagUbicacion = idTagUbicacion;
    }

    /**
     * @param numeroPasillo the numeroPasillo to set
     */
    public void setNumeroPasillo(int numeroPasillo) {
        this.numeroPasillo = numeroPasillo;
    }

    /**
     * @param descripcionPasillo the descripcionPasillo to set
     */
    public void setDescripcionPasillo(String descripcionPasillo) {
        this.descripcionPasillo = descripcionPasillo;
    }

    /**
     * @param administrador_idAdministrador the administrador_idAdministrador to set
     */
    public void setAdministrador_idAdministrador(int administrador_idAdministrador) {
        this.administrador_idAdministrador = administrador_idAdministrador;
    }

    

}
