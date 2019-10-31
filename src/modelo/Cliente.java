/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Cliente {

    private String id;
    private String tipo_identificacion;
    private String nro_identificacion;
    private String nombre;
    private String usuario, password;
    
    private Reservas reservas;

    public Cliente() {
    }

    public Cliente(String id,String tipo_identificacion, String nro_identificacion, String nombre, String usuario, String password) {
        this.tipo_identificacion = tipo_identificacion;
        this.nro_identificacion = nro_identificacion;
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.id=id;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

    public Reservas getReservas() {
        return reservas;
    }

    public void setReservas(Reservas reservas) {
        this.reservas = reservas;
    }
    
    

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getNro_identificacion() {
        return nro_identificacion;
    }

    public void setNro_identificacion(String nro_identificacion) {
        this.nro_identificacion = nro_identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
