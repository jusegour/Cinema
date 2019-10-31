/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Horario;
import modelo.Reservas;
import modelo.Tarjeta;

/**
 *
 * @author PC5
 */
public class ControladorCliente extends Conexion {

    public String idtarjeta(Tarjeta t) {
        return null;

    }

    public boolean registrar_cliente(Cliente c) {
        PreparedStatement ps = null;
        String sql = "insert into cliente values(?,?,?,?,?,?)";
        try {
            ps = this.getCon().prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, c.getTipo_identificacion());
            ps.setString(3, c.getNro_identificacion());
            ps.setString(4, c.getNombre());
            ps.setString(5, c.getUsuario());
            ps.setString(6, c.getPassword());

            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    public ArrayList<Cliente> listar_clientes() {
        ResultSet rs = null;
        PreparedStatement ps = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        String sql = "select * from cliente";
        Cliente c;

        try {
            ps=this.getCon().prepareStatement(sql);
            rs=ps.executeQuery();

            while(rs.next()){
            String id=String.valueOf(rs.getInt(1));
            String tipo_cliente=rs.getString(2);
            String nro_identificacion=rs.getString(3);
            String nombres=rs.getString(4);
            String usuario=rs.getString(5);
            String contraseña=rs.getString(6);
            
            c=new Cliente(id,tipo_cliente,nro_identificacion,nombres,usuario,contraseña);
            
            lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public ArrayList<Horario> consultar_pelicula(Horario h) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        ArrayList<Horario> lista = new ArrayList<Horario>();
        String sql = "SELECT * FROM horario where fecha=? and hora";
        Horario h1;
        try {
            ps = this.getCon().prepareStatement(sql);
            ps.setString(1, h.getFecha());
            ps.setString(2, h.getHora());
            rs = ps.executeQuery();
            while (rs.next()) {
                String teatro, sala, pelicula, fecha, hora;
                teatro = rs.getString(2);
                sala = rs.getString(3);
                pelicula = rs.getString(4);
                fecha = rs.getString(5);
                hora = rs.getString(6);

                h1 = new Horario(teatro, sala, pelicula, fecha, hora);

                lista.add(h1);

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return lista;

    }

    public boolean reservar_boletas(Reservas r) {

        PreparedStatement ps = null;
        String sql = "insert into reservas values(?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = this.getCon().prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, r.getTipo_cliente());
            ps.setString(3, r.getId_cliente());
            ps.setString(4, r.getCiudad());
            ps.setString(5, r.getMultiplex());
            ps.setString(6, r.getPelicula());
            ps.setString(7, r.getHora());
            ps.setString(8, r.getUbicacion());
            ps.setString(9, r.getMetodo_pago());
            ps.setString(10, r.getSillas_reservadas());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }

    }

    public boolean modificar_cliente(Cliente c) {

        PreparedStatement ps = null;
        String sql = "update cliente set nro_identificacion=?,nombre=?,usuario=?,contraseña=? where idcliente=?";

        try {
            ps = this.getCon().prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, c.getTipo_identificacion());
            ps.setString(3, c.getNro_identificacion());
            ps.setString(4, c.getNombre());
            ps.setString(5, c.getUsuario());
            ps.setString(6, c.getPassword());

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return true;
        }

    }

    public boolean eliminar_cliente(Cliente c) {
        PreparedStatement ps = null;
        String sql = "delete from cliente where idcliente=?";

        try {
            ps = this.getCon().prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }

    }

}
