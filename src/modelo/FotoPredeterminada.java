/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows 10
 */
public class FotoPredeterminada {
    
    private int idfotoPredeterminada;
    private byte[] fotoPredeterminada;

    public FotoPredeterminada() {
    }

    public FotoPredeterminada(int idfotoPredeterminada, byte[] fotoPredeterminada) {
        this.idfotoPredeterminada = idfotoPredeterminada;
        this.fotoPredeterminada = fotoPredeterminada;
    }

    public FotoPredeterminada(byte[] fotoPredeterminada) {
        this.fotoPredeterminada = fotoPredeterminada;
    }

    public int getIdfotoPredeterminada() {
        return idfotoPredeterminada;
    }

    public void setIdfotoPredeterminada(int idfotoPredeterminada) {
        this.idfotoPredeterminada = idfotoPredeterminada;
    }

    public byte[] getFotoPredeterminada() {
        return fotoPredeterminada;
    }

    public void setFotoPredeterminada(byte[] fotoPredeterminada) {
        this.fotoPredeterminada = fotoPredeterminada;
    }

    @Override
    public String toString() {
        return "FotoPredeterminada{" + "idfotoPredeterminada=" + idfotoPredeterminada + ", fotoPredeterminada=" + fotoPredeterminada + '}';
    }

    public boolean insertFotoPredeterminada(FotoPredeterminada objfp, String sql) {
        boolean t = false;
            BaseDatos objb = new BaseDatos();
            PreparedStatement ps = null;
            try {
                if (objb.crearConexion()) {
                    objb.getConexion().setAutoCommit(false);
                    ps = objb.getConexion().prepareStatement(sql);
                    
                    ps.setBytes(1, objfp.getFotoPredeterminada());
                    ps.executeUpdate();
                    objb.getConexion().commit();
                    t = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                t = false;
            }
            return t;
    }



    public LinkedList<FotoPredeterminada> buscarFotoPredeterminada(String sql) {
        ResultSet rs = null;
        LinkedList<FotoPredeterminada> lfp = new LinkedList<FotoPredeterminada>();
        BaseDatos objcone = new BaseDatos();     
        
        if (objcone.crearConexion()) {
            try{
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    
                    FotoPredeterminada fp = new FotoPredeterminada();
                    
                    try {
                        fp.setIdfotoPredeterminada(rs.getInt("idfotoPredeterminada"));
                        fp.setFotoPredeterminada(rs.getBytes("fotoPredeterminada"));
                    } catch (NullPointerException n) { }
                    
                    lfp.add(fp);
                    
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return lfp;
    }

    public boolean eliminarFotoPredeterminada(String sql) {
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
