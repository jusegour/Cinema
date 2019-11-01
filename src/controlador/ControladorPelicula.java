/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author PC5
 */
public class ControladorPelicula extends Conexion {
    
    public void verificar_informacion() {
        
    }
    
    public boolean registrar() {
        return false;
        
    }
    
    public void cargar_pelicula(JComboBox peliculas,int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String p = "SELECT pelicula from horario where idteatro=?";
        try {
            ps = this.getCon().prepareStatement(p);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            peliculas.addItem("Seleccione");
            while (rs.next()) {
                peliculas.addItem(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
    }
}


