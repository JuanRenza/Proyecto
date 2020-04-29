/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    private boolean aprobacionTienda;
    private String fechaAprobacionTienda;
    private int idAdminTF;
    private String identificacionCVF;
    private int idFotoPredeterminadaTF;

    public Tienda() {
    }
    
    public Tienda(int idTienda, String nomTienda, String direccionTienda, String fotoTienda, String descripcionTienda, boolean aprobacionTienda, String fechaAprobacionTienda, int idAdminTF, String identificacionCVF, int idFotoPredeterminadaTF) {
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

    public Tienda(String nomTienda, String direccionTienda, String fotoTienda, String descripcionTienda, boolean aprobacionTienda, String fechaAprobacionTienda) {
        this.nomTienda = nomTienda;
        this.direccionTienda = direccionTienda;
        this.fotoTienda = fotoTienda;
        this.descripcionTienda = descripcionTienda;
        this.aprobacionTienda = aprobacionTienda;
        this.fechaAprobacionTienda = fechaAprobacionTienda;
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

    public boolean isAprobacionTienda() {
        return aprobacionTienda;
    }

    public void setAprobacionTienda(boolean aprobacionTienda) {
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
    
}
