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
    
}
