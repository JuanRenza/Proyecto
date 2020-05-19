/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Producto;

/**
 *
 * @author Windows 10
 */
public class ControlProducto {
    
    public LinkedList<Producto> consultarProducto() {
        String sql="Select * from productos;";
        Producto objp = new Producto();
        LinkedList<Producto> listp = objp.buscarProducto(sql);
        return listp;
    }
        
    public boolean insertarProducto(Producto objp) {
        boolean t=false;
        Producto objp2 = new Producto();
        String sql="";
        sql="INSERT INTO productos (nombreProducto,fotoProducto,referenciaProducto,valorProducto,descripcionProducto,idTiendaPF,idTipoPF) VALUES(?,?,?,?,?,?,?)";
        t = objp2.insertProducto(objp, sql);
        return t;
    }

    public boolean eliminarTipoProducto(String idProducto) {
        boolean t = false;
        Producto p = new Producto();
        String sql = "DELETE FROM productos WHERE(idProducto = '" + idProducto + "');";
        t = p.eliminarProducto(sql);
        return t;
    }
    
}
