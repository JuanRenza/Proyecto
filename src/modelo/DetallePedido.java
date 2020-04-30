/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joseb
 */
public class DetallePedido {
    				
            
    private int idDetalle; 					
    private String cantidadProducto;
    private String subTotal;
    private int idProductoDF;
    private int idPedidoDF;

    public DetallePedido() {
    }

    public DetallePedido(int idDetalle, String cantidadProducto, String subTotal, int idProductoDF, int idPedidoDF) {
        this.idDetalle = idDetalle;
        this.cantidadProducto = cantidadProducto;
        this.subTotal = subTotal;
        this.idProductoDF = idProductoDF;
        this.idPedidoDF = idPedidoDF;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public int getIdProductoDF() {
        return idProductoDF;
    }

    public void setIdProductoDF(int idProductoDF) {
        this.idProductoDF = idProductoDF;
    }

    public int getIdPedidoDF() {
        return idPedidoDF;
    }

    public void setIdPedidoDF(int idPedidoDF) {
        this.idPedidoDF = idPedidoDF;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "idDetalle=" + idDetalle + ", cantidadProducto=" + cantidadProducto + ", subTotal=" + subTotal + ", idProductoDF=" + idProductoDF + ", idPedidoDF=" + idPedidoDF + '}';
    }
   
}
