/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.FotoPredeterminada;

/**
 *
 * @author Windows 10
 */
public class ControlFotoPredeterminada {

    public boolean insertarFotoPredeterminada(FotoPredeterminada objfp) {
        boolean t=false;
        FotoPredeterminada objp2 = new FotoPredeterminada();
        String sql="";
        sql="INSERT INTO fotospredeterminadas (fotoPredeterminada) VALUES(?)";
        t = objp2.insertFotoPredeterminada(objfp, sql);
        return t;
    }
    
}
