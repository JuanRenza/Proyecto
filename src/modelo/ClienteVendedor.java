/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author W°
 */
public class ClienteVendedor {
    
    private String identificacionC;
    private String nom1Cliente;
    private String nom2Cliente;
    private String ape1Cliente;
    private String ape2Cliente;
    private String fechaNac;
    private String direccion;

    public ClienteVendedor() {
    }

    public ClienteVendedor(String identificacionC, String nom1Cliente, String nom2Cliente, String ape1Cliente, String ape2Cliente, String fechaNac, String direccion) {
        this.identificacionC = identificacionC;
        this.nom1Cliente = nom1Cliente;
        this.nom2Cliente = nom2Cliente;
        this.ape1Cliente = ape1Cliente;
        this.ape2Cliente = ape2Cliente;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
    }

    public ClienteVendedor(String nom1Cliente, String nom2Cliente, String ape1Cliente, String ape2Cliente, String fechaNac, String direccion) {
        this.nom1Cliente = nom1Cliente;
        this.nom2Cliente = nom2Cliente;
        this.ape1Cliente = ape1Cliente;
        this.ape2Cliente = ape2Cliente;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
    }
    
    public String getIdentificacionC() {
        return identificacionC;
    }

    public void setIdentificacionC(String identificacionC) {
        this.identificacionC = identificacionC;
    }

    public String getNom1Cliente() {
        return nom1Cliente;
    }

    public void setNom1Cliente(String nom1Cliente) {
        this.nom1Cliente = nom1Cliente;
    }

    public String getNom2Cliente() {
        return nom2Cliente;
    }

    public void setNom2Cliente(String nom2Cliente) {
        this.nom2Cliente = nom2Cliente;
    }

    public String getApe1Cliente() {
        return ape1Cliente;
    }

    public void setApe1Cliente(String ape1Cliente) {
        this.ape1Cliente = ape1Cliente;
    }

    public String getApe2Cliente() {
        return ape2Cliente;
    }

    public void setApe2Cliente(String ape2Cliente) {
        this.ape2Cliente = ape2Cliente;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ClienteVendedor{" + "identificacionC=" + identificacionC + ", nom1Cliente=" + nom1Cliente + ", nom2Cliente=" + nom2Cliente + ", ape1Cliente=" + ape1Cliente + ", ape2Cliente=" + ape2Cliente + ", fechaNac=" + fechaNac + ", direccion=" + direccion + '}';
    }
    
}
