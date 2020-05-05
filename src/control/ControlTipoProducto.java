/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.TipoProducto;

/**
 *
 * @author Windows 10
 */
public class ControlTipoProducto {
    
        public LinkedList<TipoProducto> consultarTipoProducto() {
        String sql="Select * from tiposproductos;";
        TipoProducto objtp = new TipoProducto();
        LinkedList<TipoProducto> listtp = objtp.buscarTipoProducto(sql);
        return listtp;
        }
        
        public boolean insertarTipoProducto(String nomTipoProducto) {
        boolean t=false;
        TipoProducto objtp = new TipoProducto();
        String sql="insert into tiposproductos(tipoProducto) value('" + nomTipoProducto + "');";
        t= objtp.insertTipoProducto(sql);
        return t;
        }
    
    
}
