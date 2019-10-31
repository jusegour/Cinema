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
public class Reservas {

    private String tipo_cliente, id_cliente, ciudad, multiplex, pelicula, hora, ubicacion, metodo_pago, sillas_reservadas;
    private Taquillero taquillero;

    public Taquillero getTaquillero() {
        return taquillero;
    }

    public void setTaquillero(Taquillero taquillero) {
        this.taquillero = taquillero;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMultiplex() {
        return multiplex;
    }

    public void setMultiplex(String multiplex) {
        this.multiplex = multiplex;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getSillas_reservadas() {
        return sillas_reservadas;
    }

    public void setSillas_reservadas(String sillas_reservadas) {
        this.sillas_reservadas = sillas_reservadas;
    }

}
