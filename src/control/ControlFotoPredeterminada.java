/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
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

    public LinkedList<FotoPredeterminada> consultarFotoPredeterminada() {
        String sql="Select * from fotospredeterminadas;";
        FotoPredeterminada objfp = new FotoPredeterminada();
        LinkedList<FotoPredeterminada> listfp = objfp.buscarFotoPredeterminada(sql);
        return listfp;
    }

    public boolean eliminarFotoPredeterminada(String idFoto) {
        boolean t = false;
        FotoPredeterminada fp = new FotoPredeterminada();
        String sql = "DELETE FROM fotospredeterminadas WHERE(idfotoPredeterminada = '" + idFoto + "');";
        t = fp.eliminarFotoPredeterminada(sql);
        return t;
    }
    
}
