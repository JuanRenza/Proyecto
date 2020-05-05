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
 * @author Windows 10
 */
public class TipoProducto {
    
    private int idTipo;
    private String tipoProducto;

    public TipoProducto() {
    }

    public TipoProducto(int idTipo, String tipoProducto) {
        this.idTipo = idTipo;
        this.tipoProducto = tipoProducto;
    }

    public TipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "TipoProductos{" + "idTipo=" + idTipo + ", tipoProducto=" + tipoProducto + '}';
    }
    
    public LinkedList<TipoProducto> buscarTipoProducto(String sql) {
        
        ResultSet rs = null;
        LinkedList<TipoProducto> ltp = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idTipo = 0;
        String tipoProducto="";
        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    try {
                        idTipo = rs.getInt("idTipo");
                    } catch (NullPointerException n) { }
                    try {
                        tipoProducto = rs.getString("tipoProducto");
                    } catch (NullPointerException n) { }
                 
                    ltp.add(new TipoProducto(idTipo, tipoProducto));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ltp;
    }
    
    public boolean insertTipoProducto(String sql) {
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
