/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Nicolas Alexander
 */
public class TelefonosAdmin {
    
    private int idTelefonosA;
    private String numTelefono;
    private int  idAdminTF;
    
     public TelefonosAdmin() {
    }

    public TelefonosAdmin(int idTelefonosA, String numTelefono, int idAdminTF) {
        this.idTelefonosA = idTelefonosA;
        this.numTelefono = numTelefono;
        this.idAdminTF = idAdminTF;
    }

    public TelefonosAdmin(String numTelefono) {
        this.numTelefono = numTelefono;
       
    }

    public int getIdTelefonosA() {
        return idTelefonosA;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public int getIdAdminTF() {
        return idAdminTF;
    }

    public void setIdTelefonosA(int idTelefonosA) {
        this.idTelefonosA = idTelefonosA;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setIdAdminTF(int idAdminTF) {
        this.idAdminTF = idAdminTF;
    }

    @Override
    public String toString() {
        return "TelefonosAdmin{" + "idTelefonosA=" + idTelefonosA + ", numTelefono=" + numTelefono + ", idAdminTF=" + idAdminTF + '}';
    }
     
     
}
