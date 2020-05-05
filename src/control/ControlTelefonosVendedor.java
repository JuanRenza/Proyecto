/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.TelefonosVendedor;

/**
 *
 * @author Nicolas Alexander
 */
public class ControlTelefonosVendedor {
    
    public boolean insertarTelefonosVendedor(LinkedList<TelefonosVendedor> listaTelefonosV) {
        boolean t=false;
        TelefonosVendedor objc=new TelefonosVendedor();
        for (int i = 0; i < listaTelefonosV.size(); i++) {
            TelefonosVendedor get = listaTelefonosV.get(i);
            String sql="insert into TelefonosVendedor(numTelefono) value('"+get.getNumTelefono()+"');";
            
            t=objc.insertarTelefonosVendedor(sql);
        }
        
        return t;
        
        
        
    }
    
}
