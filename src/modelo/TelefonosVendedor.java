/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nicolas Alexander
 */
public class TelefonosVendedor {
    
    private int idTelefonosV;
    private String numTelefono;
    private String identificacionCVF;

    public TelefonosVendedor() {
    }

    public TelefonosVendedor(int idTelefonosV, String numTelefono, String identificacionCVF) {
        this.idTelefonosV = idTelefonosV;
        this.numTelefono = numTelefono;
        this.identificacionCVF = identificacionCVF;
    }

    public TelefonosVendedor(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getIdTelefonosV() {
        return idTelefonosV;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getIdentificacionCVF() {
        return identificacionCVF;
    }

    public void setIdTelefonosV(int idTelefonosV) {
        this.idTelefonosV = idTelefonosV;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setIdentificacionCVF(String identificacionCVF) {
        this.identificacionCVF = identificacionCVF;
    }

    @Override
    public String toString() {
        return "TelefonosVendedor{" + "idTelefonosV=" + idTelefonosV + ", numTelefono=" + numTelefono + ", identificacionCVF=" + identificacionCVF + '}';
    }
    public boolean insertarTelefonosVendedor(String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }

        return t;

    }
    
    
}
