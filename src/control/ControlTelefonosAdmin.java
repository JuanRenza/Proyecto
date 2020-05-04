/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.TelefonosAdmin;

/**
 *
 * @author Nicolas Alexander
 */
public class ControlTelefonosAdmin {
    
    
    
    public boolean insertarTelefonosAdmin(LinkedList<TelefonosAdmin> listaTelefonos) {
        boolean t=false;
        TelefonosAdmin objc=new TelefonosAdmin();
        for (int i = 0; i < listaTelefonos.size(); i++) {
            TelefonosAdmin get = listaTelefonos.get(i);
            String sql="insert into TelefonosAdmin(numTelefono) value('"+get.getNumTelefono()+"');";
            
            t=objc.insertarTelefonosAdmin(sql);
        }
        
        return t;
        
        
        
    }
}
