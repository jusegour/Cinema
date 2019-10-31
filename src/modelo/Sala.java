/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PC5
 */
public class Sala {

    private String capacidad, nlocalidades, nsillaspref, nsillasgen, nsillarcinebar, nsillasfum;
    private Horario h;

    /**
     * @return the capacidad
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the nlocalidades
     */
    public String getNlocalidades() {
        return nlocalidades;
    }

    /**
     * @param nlocalidades the nlocalidades to set
     */
    public void setNlocalidades(String nlocalidades) {
        this.nlocalidades = nlocalidades;
    }

    /**
     * @return the nsillaspref
     */
    public String getNsillaspref() {
        return nsillaspref;
    }

    /**
     * @param nsillaspref the nsillaspref to set
     */
    public void setNsillaspref(String nsillaspref) {
        this.nsillaspref = nsillaspref;
    }

    /**
     * @return the nsillasgen
     */
    public String getNsillasgen() {
        return nsillasgen;
    }

    /**
     * @param nsillasgen the nsillasgen to set
     */
    public void setNsillasgen(String nsillasgen) {
        this.nsillasgen = nsillasgen;
    }

    /**
     * @return the nsillarcinebar
     */
    public String getNsillarcinebar() {
        return nsillarcinebar;
    }

    /**
     * @param nsillarcinebar the nsillarcinebar to set
     */
    public void setNsillarcinebar(String nsillarcinebar) {
        this.nsillarcinebar = nsillarcinebar;
    }

    /**
     * @return the nsillasfum
     */
    public String getNsillasfum() {
        return nsillasfum;
    }

    /**
     * @param nsillasfum the nsillasfum to set
     */
    public void setNsillasfum(String nsillasfum) {
        this.nsillasfum = nsillasfum;
    }

    /**
     * @return the h
     */
    public Horario getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(Horario h) {
        this.h = h;
    }

}
