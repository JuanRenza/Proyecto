/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.util.LinkedList;
import modelo.ClienteVendedor;
import modelo.Tienda;

/**
 *
 * @author W°
 */
public class ControlTienda {

    public LinkedList<Tienda> consultarTiendas() {
        LinkedList<Tienda> listac = new LinkedList<>();
        Tienda objclasi = new Tienda();
        String sql = "select * from tiendas;";
        listac = objclasi.consultarTiendas(sql);
        return listac;
    }

    public boolean insertarTiendas(Tienda objT) {
        boolean t = false;
        Tienda objciudad = new Tienda();
        String sql = "";
        sql = "INSERT INTO tiendas (idTienda,nomTienda,direccionTienda,fotoTienda,descripcionTienda,aprobacionTienda, fechaAprobacionTienda, idAdminTF, identificacionCVF, idFotoPredeterminadaTF) VALUES(?,?,?,?,?,?,?,?,?,?);";
        t = objciudad.insertarTiendas(objT, sql);
        return t;

    }

    public boolean eliminarTiendas(LinkedList<Tienda> listaTiendas) {
        boolean t = false;
        Tienda objtienda = new Tienda();
        for (int i = 0; i < listaTiendas.size(); i++) {
            Tienda getobjeto = listaTiendas.get(i);
            String sql = "";
            sql = "DELETE FROM tiendas WHERE(idTienda = '"+getobjeto.getIdTienda()+"');";
            t=objtienda.eliminarTienda(sql);
        }
        return t;
    }
    
    

}
