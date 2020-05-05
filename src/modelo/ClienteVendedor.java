/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W°
 */
public class ClienteVendedor {

    private String identificacionC;
    private String nom1Cliente;
    private String nom2Cliente;
    private String ape1Cliente;
    private String ape2Cliente;
    private String fechaNac;
    private String direccion;

    public ClienteVendedor() {
    }

    public ClienteVendedor(String identificacionC, String nom1Cliente, String nom2Cliente, String ape1Cliente, String ape2Cliente, String fechaNac, String direccion) {
        this.identificacionC = identificacionC;
        this.nom1Cliente = nom1Cliente;
        this.nom2Cliente = nom2Cliente;
        this.ape1Cliente = ape1Cliente;
        this.ape2Cliente = ape2Cliente;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
    }

    public ClienteVendedor(String nom1Cliente, String nom2Cliente, String ape1Cliente, String ape2Cliente, String fechaNac, String direccion) {
        this.nom1Cliente = nom1Cliente;
        this.nom2Cliente = nom2Cliente;
        this.ape1Cliente = ape1Cliente;
        this.ape2Cliente = ape2Cliente;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
    }

    public String getIdentificacionC() {
        return identificacionC;
    }

    public void setIdentificacionC(String identificacionC) {
        this.identificacionC = identificacionC;
    }

    public String getNom1Cliente() {
        return nom1Cliente;
    }

    public void setNom1Cliente(String nom1Cliente) {
        this.nom1Cliente = nom1Cliente;
    }

    public String getNom2Cliente() {
        return nom2Cliente;
    }

    public void setNom2Cliente(String nom2Cliente) {
        this.nom2Cliente = nom2Cliente;
    }

    public String getApe1Cliente() {
        return ape1Cliente;
    }

    public void setApe1Cliente(String ape1Cliente) {
        this.ape1Cliente = ape1Cliente;
    }

    public String getApe2Cliente() {
        return ape2Cliente;
    }

    public void setApe2Cliente(String ape2Cliente) {
        this.ape2Cliente = ape2Cliente;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ClienteVendedor{" + "identificacionC=" + identificacionC + ", nom1Cliente=" + nom1Cliente + ", nom2Cliente=" + nom2Cliente + ", ape1Cliente=" + ape1Cliente + ", ape2Cliente=" + ape2Cliente + ", fechaNac=" + fechaNac + ", direccion=" + direccion + '}';
    }

    public LinkedList<ClienteVendedor> consultarClienteV(String sql) {
        LinkedList<ClienteVendedor> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        String identificacionC = "";
        String nom1Cliente = "";
        String nom2Cliente = "";
        String ape1Cliente = "";
        String ape2Cliente = "";
        String fechaNac = "";
        String direccion = "";

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    identificacionC = rs.getString("identificacionC");
                    nom1Cliente = rs.getString("nom1Cliente");
                    nom2Cliente = rs.getString("nom2Cliente");
                    ape1Cliente = rs.getString("ape1Cliente");
                    ape2Cliente = rs.getString("ape2Cliente");
                    fechaNac = rs.getString("fechaNac");
                    direccion = rs.getString("direccion");
                    lc.add(new ClienteVendedor(identificacionC, nom1Cliente, nom2Cliente, ape1Cliente, ape2Cliente, fechaNac, direccion));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;

    }

    public boolean insertClientesV(ClienteVendedor objV, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objV.getIdentificacionC());
                ps.setString(2, objV.getNom1Cliente());
                ps.setString(3, objV.getNom2Cliente());
                ps.setString(4, objV.getApe1Cliente());
                ps.setString(5, objV.getApe2Cliente());
                ps.setString(6, objV.getFechaNac());
                ps.setString(6, objV.getDireccion());

                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
    }

    public LinkedList<ClienteVendedor> consultarClientesV(String sql) {
        LinkedList<ClienteVendedor> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        String identificacionC = "";
        String nom1Cliente = "";
        String nom2Cliente = "";
        String ape1Cliente = "";
        String ape2Cliente = "";
        String fechaNac = "";
        String direccion = "";

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    identificacionC = rs.getString("identificacionC");
                    nom1Cliente = rs.getString("nom1Cliente");
                    nom2Cliente = rs.getString("nom2Cliente");
                    ape1Cliente = rs.getString("ape1Cliente");
                    ape2Cliente = rs.getString("ape2Cliente");
                    fechaNac = rs.getString("fechaNac");
                    direccion = rs.getString("direccion");
                    lc.add(new ClienteVendedor(nom1Cliente, nom2Cliente, ape1Cliente, ape2Cliente, fechaNac, direccion));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;

    }

    public boolean insertarClientesV(ClienteVendedor objT, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objT.getIdentificacionC());
                ps.setString(2, objT.getNom1Cliente());
                ps.setString(3, objT.getNom2Cliente());
                ps.setString(4, objT.getApe1Cliente());
                ps.setString(5, objT.getApe2Cliente());
                ps.setString(6, objT.getFechaNac());
                ps.setString(7, objT.getDireccion());

                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
    }

    public boolean eliminarClientesV(String sql) {
        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }

        return t;
    }

}
