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
public class ControladorTeatro extends Conexion {
    
    public void verificar_disponibilidad() {
        
    }
    
    public void cargar_teatros(JComboBox teatros) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT idteatro,nombre from teatro";
        try {
            ps = this.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            teatros.addItem("Seleccione");
            while (rs.next()) {
                teatros.addItem(rs.getInt(1) + " " + rs.getString(2));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
}

