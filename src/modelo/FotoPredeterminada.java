/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Windows 10
 */
public class FotoPredeterminada {
    
    private int idfotoPredeterminada;
    private String fotoPredeterminada;

    public FotoPredeterminada() {
    }

    public FotoPredeterminada(int idfotoPredeterminada, String fotoPredeterminada) {
        this.idfotoPredeterminada = idfotoPredeterminada;
        this.fotoPredeterminada = fotoPredeterminada;
    }

    public FotoPredeterminada(String fotoPredeterminada) {
        this.fotoPredeterminada = fotoPredeterminada;
    }

    public int getIdfotoPredeterminada() {
        return idfotoPredeterminada;
    }

    public void setIdfotoPredeterminada(int idfotoPredeterminada) {
        this.idfotoPredeterminada = idfotoPredeterminada;
    }

    public String getFotoPredeterminada() {
        return fotoPredeterminada;
    }

    public void setFotoPredeterminada(String fotoPredeterminada) {
        this.fotoPredeterminada = fotoPredeterminada;
    }

    @Override
    public String toString() {
        return "FotoPredeterminada{" + "idfotoPredeterminada=" + idfotoPredeterminada + ", fotoPredeterminada=" + fotoPredeterminada + '}';
    }
    
}
