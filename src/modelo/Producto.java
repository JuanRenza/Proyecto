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
 * @author Windows 10
 */
public class Producto {
    
    private int idProducto;
    private String nombreProducto;
    private byte[] fotoProducto;
    private String referenciaProducto;
    private double valorProducto;
    private String descripcionProducto;
    private int idTiendaPF;
    private int idTipoPF;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, byte[] fotoProducto, String referenciaProducto, double valorProducto, String descripcionProducto, int idTiendaPF, int idTipoPF) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.fotoProducto = fotoProducto;
        this.referenciaProducto = referenciaProducto;
        this.valorProducto = valorProducto;
        this.descripcionProducto = descripcionProducto;
        this.idTiendaPF = idTiendaPF;
        this.idTipoPF = idTipoPF;
    }

    public Producto(String nombreProducto, byte[] fotoProducto, String referenciaProducto, double valorProducto, String descripcionProducto, int idTiendaPF, int idTipoPF) {
        this.nombreProducto = nombreProducto;
        this.fotoProducto = fotoProducto;
        this.referenciaProducto = referenciaProducto;
        this.valorProducto = valorProducto;
        this.descripcionProducto = descripcionProducto;
        this.idTiendaPF = idTiendaPF;
        this.idTipoPF = idTipoPF;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public byte[] getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(byte[] fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public String getReferenciaProducto() {
        return referenciaProducto;
    }

    public void setReferenciaProducto(String referenciaProducto) {
        this.referenciaProducto = referenciaProducto;
    }

    public double getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getIdTiendaPF() {
        return idTiendaPF;
    }

    public void setIdTiendaPF(int idTiendaPF) {
        this.idTiendaPF = idTiendaPF;
    }

    public int getIdTipoPF() {
        return idTipoPF;
    }

    public void setIdTipoPF(int idTipoPF) {
        this.idTipoPF = idTipoPF;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", fotoProducto=" + fotoProducto + ", referenciaProducto=" + referenciaProducto + ", valorProducto=" + valorProducto + ", descripcionProducto=" + descripcionProducto + ", idTiendaPF=" + idTiendaPF + ", idTipoPF=" + idTipoPF + '}';
    }
    
    public LinkedList<Producto> buscarProducto(String sql){
        ResultSet rs = null;
        LinkedList<Producto> lp = new LinkedList<Producto>();
        BaseDatos objcone = new BaseDatos();     
        
        if (objcone.crearConexion()) {
            try{
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    
                    Producto p = new Producto();
                    
                    try {
                        p.setIdProducto(rs.getInt("idProducto"));
                        p.setNombreProducto(rs.getString("nombreProducto"));
                        p.setFotoProducto(rs.getBytes("idTipo"));
                        p.setReferenciaProducto(rs.getString("referenciaProducto"));
                        p.setDescripcionProducto(rs.getString("descripcionProducto"));
                        p.setValorProducto(rs.getDouble("valorProducto"));
                        p.setIdTiendaPF(rs.getInt("idTiendaPF"));
                        p.setIdTipoPF(rs.getInt("idTipoPF"));
                    } catch (NullPointerException n) { }
                    
                    lp.add(p);
                    
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return lp;
    }
    
    public boolean insertProducto(Producto p, String sql){
        boolean t = false;
            BaseDatos objb = new BaseDatos();
            PreparedStatement ps = null;
            try {
                if (objb.crearConexion()) {
                    objb.getConexion().setAutoCommit(false);
                    ps = objb.getConexion().prepareStatement(sql);
                    
                    ps.setString(1, p.getNombreProducto());
                    ps.setBytes(2, p.getFotoProducto());
                    ps.setString(3, p.getReferenciaProducto());
                    ps.setDouble(4, p.getValorProducto());
                    ps.setString(5, p.getDescripcionProducto());
                    ps.setInt(6,p.getIdTiendaPF());
                    ps.setInt(7,p.getIdTipoPF());
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
}
