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
public class Teatro {
    
    private String nombre;
    private Horario horario_atencion;
    private String telefono;
    private String extension;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Horario getHorario_atencion() {
        return horario_atencion;
    }

    public void setHorario_atencion(Horario horario_atencion) {
        this.horario_atencion = horario_atencion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    
    
}
