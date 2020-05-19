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
        String sql = "SELECT * FROM tiendas;";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendas(sql);
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

    public boolean eliminarTiendas(int listaTiendas) {
        boolean t = false;
        ClienteVendedor getobjeto = new ClienteVendedor();
        String sql = "DELETE FROM tiendas WHERE(idTienda = '" + listaTiendas + "');";
        t = getobjeto.eliminarClientesV(sql);

        return t;
    }
    
    

}
