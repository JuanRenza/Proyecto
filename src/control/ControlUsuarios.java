/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Usuario;

/**
 *
 * @author joseb
 */
public class ControlUsuarios {
      public LinkedList<Usuario> consultarClientes() {
        String sql="Select * from usuarios;";
        Usuario objc=new Usuario();
        LinkedList<Usuario> listaU=objc.buscarUsuario(sql);
        
        return listaU;
    }
}
