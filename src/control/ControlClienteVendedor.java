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

        String sql = "SELECT * FROM clientesvendedor;";
        ClienteVendedor objclasi = new ClienteVendedor();
        LinkedList<ClienteVendedor> listac = objclasi.consultarClienteV(sql);
        return listac;
    }
    public LinkedList<ClienteVendedor> consultarClienteVendedor2(String id) {

        String sql = "SELECT * FROM clientesvendedor WHERE identificacionC = '"+ id +"';";
        ClienteVendedor objclasi = new ClienteVendedor();
        LinkedList<ClienteVendedor> listac = objclasi.consultarClienteV(sql);
        return listac;
    }

    public boolean insertarClientesV(ClienteVendedor objC) {

        boolean t = false;
        ClienteVendedor objC2 = new ClienteVendedor();
        String sql = "";
        sql = "INSERT INTO proyecto.clientesvendedor (identificacionC, nom1Cliente, nom2Cliente, ape1Cliente, ape2Cliente, fechaNac, direccion) VALUES(?,?,?,?,?,?,?);";
        t = objC2.insertClientesV(objC, sql);

        return t;
    }

    public boolean eliminarclientesV(String listaClientes) {

        boolean t = false;
        ClienteVendedor getobjeto = new ClienteVendedor();
        String sql = "DELETE FROM clientesvendedor WHERE(identificacionc = '" + listaClientes + "');";
        t = getobjeto.eliminarClientesV(sql);

        return t;
    }
    
    public boolean consultarClienteV(String n1, String n2, String a1, String a2, String fecha, String dire, String idCliente) {

        boolean t = false;
        ClienteVendedor getobjeto = new ClienteVendedor();
        String sql = "UPDATE clientesvendedor SET nom1Cliente = '"+ n1 +"', nom2Cliente = '"+ n2 +"', ape1Cliente = '"+ a1 +"', ape2Cliente = '"+ a2 +"', fechaNac = '"+ fecha +"', direccion = '"+ dire +"' WHERE (`identificacionC` = '"+ idCliente +"');";
        t = getobjeto.consultarCliente(sql);

        return t;
    }
    
}
