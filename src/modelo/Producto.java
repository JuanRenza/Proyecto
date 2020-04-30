/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Windows 10
 */
public class Producto {
    
    private int idProducto;
    private String nombreProducto;
    private String fotoProducto;
    private String referenciaProducto;
    private double valorProducto;
    private String descripcionProducto;
    private int idTiendaPF;
    private int idTipoPF;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String fotoProducto, String referenciaProducto, double valorProducto, String descripcionProducto, int idTiendaPF, int idTipoPF) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.fotoProducto = fotoProducto;
        this.referenciaProducto = referenciaProducto;
        this.valorProducto = valorProducto;
        this.descripcionProducto = descripcionProducto;
        this.idTiendaPF = idTiendaPF;
        this.idTipoPF = idTipoPF;
    }

    public Producto(String nombreProducto, String fotoProducto, String referenciaProducto, double valorProducto, String descripcionProducto, int idTiendaPF, int idTipoPF) {
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

    public String getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(String fotoProducto) {
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
    
}
