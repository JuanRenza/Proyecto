/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
