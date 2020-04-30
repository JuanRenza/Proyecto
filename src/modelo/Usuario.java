/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author joseb
 */
public class Usuario {
 private String idUsuario; 					
    private String nombreUsuario1;
    private String nombreUsuario2;
    private String apellidoUsuario1;
    private String apellidoUsuario2;
    private String telefonoUsuario;
    private String direccionUsuario;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombreUsuario1, String nombreUsuario2, String apellidoUsuario1, String apellidoUsuario2, String telefonoUsuario, String direccionUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario1 = nombreUsuario1;
        this.nombreUsuario2 = nombreUsuario2;
        this.apellidoUsuario1 = apellidoUsuario1;
        this.apellidoUsuario2 = apellidoUsuario2;
        this.telefonoUsuario = telefonoUsuario;
        this.direccionUsuario = direccionUsuario;
    }

    public Usuario(String idUsuario, String nombreUsuario1, String apellidoUsuario1, String telefonoUsuario, String direccionUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario1 = nombreUsuario1;
        this.apellidoUsuario1 = apellidoUsuario1;
        this.telefonoUsuario = telefonoUsuario;
        this.direccionUsuario = direccionUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario1() {
        return nombreUsuario1;
    }

    public void setNombreUsuario1(String nombreUsuario1) {
        this.nombreUsuario1 = nombreUsuario1;
    }

    public String getNombreUsuario2() {
        return nombreUsuario2;
    }

    public void setNombreUsuario2(String nombreUsuario2) {
        this.nombreUsuario2 = nombreUsuario2;
    }

    public String getApellidoUsuario1() {
        return apellidoUsuario1;
    }

    public void setApellidoUsuario1(String apellidoUsuario1) {
        this.apellidoUsuario1 = apellidoUsuario1;
    }

    public String getApellidoUsuario2() {
        return apellidoUsuario2;
    }

    public void setApellidoUsuario2(String apellidoUsuario2) {
        this.apellidoUsuario2 = apellidoUsuario2;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario1=" + nombreUsuario1 + ", nombreUsuario2=" + nombreUsuario2 + ", apellidoUsuario1=" + apellidoUsuario1 + ", apellidoUsuario2=" + apellidoUsuario2 + ", telefonoUsuario=" + telefonoUsuario + ", direccionUsuario=" + direccionUsuario + '}';
    }
    
    
    
    public LinkedList<Usuario> buscarUsuario(String sql) {
      ResultSet rs = null;
        LinkedList<Usuario> lu = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        String idu;
        String nombre1u;
        String nombre2u="";
        String apellido1u;
        String apellido2u="";
        String telefonou;
        String direccionu;
        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idu = rs.getNString("identificacionc");
                    nombre1u = rs.getNString("nombre1");
                    try {
                        nombre2u = rs.getString("nombre2");
                    } catch (NullPointerException n) { }
                    if(nombre2u==null){
                        nombre2u = "";
                    }
                    
                    apellido1u = rs.getString("apellido1");
                     try {
                        apellido2u = rs.getString("apellido2");
                    } catch (NullPointerException n) { }
                    if(apellido2u==null){
                        apellido2u = "";
                    }
                    
                 
                    lu.add(new Usuario(idu, nombre1u, nombre2u, apellido1u, apellido2u));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lu;
    }
    }
    

