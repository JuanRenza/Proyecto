/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.ClienteVendedor;

/**
 *
 * @author W°
 */
public class ControlClienteVendedor {

    public LinkedList<ClienteVendedor> consultarClienteVendedor() {
        LinkedList<ClienteVendedor> listac = new LinkedList<>();
        ClienteVendedor objclasi = new ClienteVendedor();
        String sql = "select * from clientesvendedor;";
        listac = objclasi.consultarClienteV(sql);
        return listac;
    }

    public boolean insertarClientesV(ClienteVendedor objC) {
        boolean t = false;
        ClienteVendedor objC2 = new ClienteVendedor();
        String sql = "";
        sql = "insert into clientesvendedor(identificacionC, nom1Cliente, nom2Cliente, ape1Cliente, ape2Cliente, fechaNac, direccion) values(?,?,?,?,?,?);";
        t = objC2.insertClientesV(objC,sql);

        return t;

    }
    
    public boolean eliminarTiendas(LinkedList<ClienteVendedor> listaTiendas) {
        boolean t = false;
        ClienteVendedor objtienda = new ClienteVendedor();
        for (int i = 0; i < listaTiendas.size(); i++) {
            ClienteVendedor getobjeto = listaTiendas.get(i);
            String sql = "";
            sql = "DELETE FROM clientevendedor WHERE(identificacionc = '"+getobjeto.getIdentificacionC()+"');";
            t=objtienda.eliminarClientesV(sql);
        }
        return t;
}
}
