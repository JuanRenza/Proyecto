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
public class Tienda {
    
    private int idTienda;
    private String nomTienda;
    private String direccionTienda;
    private String fotoTienda;
    private String descripcionTienda;
    private int aprobacionTienda;
    private String fechaAprobacionTienda;
    private int idAdminTF;
    private String identificacionCVF;
    private int idFotoPredeterminadaTF;

    public Tienda() {
    }

    public Tienda(int idTienda) {
        this.idTienda = idTienda;
    }
    
    
    
    public Tienda(int idTienda, String nomTienda, String direccionTienda, String fotoTienda, String descripcionTienda, int aprobacionTienda, String fechaAprobacionTienda, int idAdminTF, String identificacionCVF, int idFotoPredeterminadaTF) {
        this.idTienda = idTienda;
        this.nomTienda = nomTienda;
        this.direccionTienda = direccionTienda;
        this.fotoTienda = fotoTienda;
        this.descripcionTienda = descripcionTienda;
        this.aprobacionTienda = aprobacionTienda;
        this.fechaAprobacionTienda = fechaAprobacionTienda;
        this.idAdminTF = idAdminTF;
        this.identificacionCVF = identificacionCVF;
        this.idFotoPredeterminadaTF = idFotoPredeterminadaTF;
    }

    public Tienda(String nomTienda, String direccionTienda, String fotoTienda, String descripcionTienda, int aprobacionTienda, String fechaAprobacionTienda, int idAdminTF, String identificacionCVF, int idFotoPredeterminadaTF) {
        this.nomTienda = nomTienda;
        this.direccionTienda = direccionTienda;
        this.fotoTienda = fotoTienda;
        this.descripcionTienda = descripcionTienda;
        this.aprobacionTienda = aprobacionTienda;
        this.fechaAprobacionTienda = fechaAprobacionTienda;
        this.idAdminTF = idAdminTF;
        this.identificacionCVF = identificacionCVF;
        this.idFotoPredeterminadaTF = idFotoPredeterminadaTF;
    }
    
    

    
    
    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getNomTienda() {
        return nomTienda;
    }

    public void setNomTienda(String nomTienda) {
        this.nomTienda = nomTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getFotoTienda() {
        return fotoTienda;
    }

    public void setFotoTienda(String fotoTienda) {
        this.fotoTienda = fotoTienda;
    }

    public String getDescripcionTienda() {
        return descripcionTienda;
    }

    public void setDescripcionTienda(String descripcionTienda) {
        this.descripcionTienda = descripcionTienda;
    }

    public int getAprobacionTienda() {
        return aprobacionTienda;
    }

    public void setAprobacionTienda(int aprobacionTienda) {
        this.aprobacionTienda = aprobacionTienda;
    }
    
    


    public String getFechaAprobacionTienda() {
        return fechaAprobacionTienda;
    }

    public void setFechaAprobacionTienda(String fechaAprobacionTienda) {
        this.fechaAprobacionTienda = fechaAprobacionTienda;
    }

    public int getIdAdminTF() {
        return idAdminTF;
    }

    public void setIdAdminTF(int idAdminTF) {
        this.idAdminTF = idAdminTF;
    }

    public String getIdentificacionCVF() {
        return identificacionCVF;
    }

    public void setIdentificacionCVF(String identificacionCVF) {
        this.identificacionCVF = identificacionCVF;
    }

    public int getIdFotoPredeterminadaTF() {
        return idFotoPredeterminadaTF;
    }

    public void setIdFotoPredeterminadaTF(int idFotoPredeterminadaTF) {
        this.idFotoPredeterminadaTF = idFotoPredeterminadaTF;
    }

    @Override
    public String toString() {
        return "Tienda{" + "idTienda=" + idTienda + ", nomTienda=" + nomTienda + ", direccionTienda=" + direccionTienda + ", fotoTienda=" + fotoTienda + ", descripcionTienda=" + descripcionTienda + ", aprobacionTienda=" + aprobacionTienda + ", fechaAprobacionTienda=" + fechaAprobacionTienda + ", idAdminTF=" + idAdminTF + ", identificacionCVF=" + identificacionCVF + ", idFotoPredeterminadaTF=" + idFotoPredeterminadaTF + '}';
    }
    
    public LinkedList<Tienda> consultarTiendas(String sql) {
        LinkedList<Tienda> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idTienda= 0;
        String nomTienda= "";
        String direccionTienda= "";
        String fotoTienda= "";
        String descripcionTienda= "";
        int aprobacionTienda= 0;
        String fechaAprobacionTienda= "";
        int idAdminTF= 0;
        String identificacionCVF= "";
        int idFotoPredeterminadaTF= 0;
        
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    idTienda = rs.getInt("idTienda");
                    nomTienda = rs.getString("nomTienda");
                    direccionTienda = rs.getString("direccionTienda");
                    fotoTienda = rs.getString("fotoTienda");
                    descripcionTienda = rs.getString("descripcionTienda");
                    aprobacionTienda = rs.getInt("aprobacionTienda");
                    fechaAprobacionTienda = rs.getString("fechaAprobacionTienda");
                    idAdminTF = rs.getInt("idAdminTF");
                    identificacionCVF = rs.getString("identificacionCVF");
                    idFotoPredeterminadaTF = rs.getInt("idFotoPredeterminadaTF");
                    lc.add(new Tienda(idTienda, nomTienda, direccionTienda, fotoTienda, descripcionTienda, aprobacionTienda, fechaAprobacionTienda, idAdminTF, identificacionCVF, idFotoPredeterminadaTF));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;

    }

    public boolean insertarTiendas(Tienda objT,String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                File file = new File(objT.getFotoTienda());
                fis = new FileInputStream(file);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objT.getNomTienda());
                ps.setString(2, objT.getDireccionTienda());
                ps.setBinaryStream(3, fis, (int) file.length());
                ps.setString(4, objT.getDescripcionTienda());
                ps.setInt(5, objT.getAprobacionTienda());
                ps.setString(6, objT.getFechaAprobacionTienda());
                ps.setInt(7, objT.getIdAdminTF());
                ps.setString(8, objT.getIdentificacionCVF());
                ps.setInt(9, objT.getIdFotoPredeterminadaTF());
                

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

    public boolean eliminarTienda(String sql) {
        boolean t=false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t= false;
            }
        }
        
        return t;
    }
    
    
    
    }
    
