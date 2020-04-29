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
public class Administrador {
    
    private int idAdmin;
    private String nom1Admin;
    private String nom2Admin;
    private String ape1Admin;
    private String ape2Admin;
    private String correoAdmin;
    private String contraseñaAdmin;
    private String direccionAdmin;
    private String fotoAdmin;
    
    public Administrador() {
    }

    public Administrador(int idAdministrador, String nom1Admin, String nom2Admin, String ape1Admin, String ape2Admin, String correoAdmin,
            String contraseñaAdmin, String direccionAdmin, String fotoAdmin) {
        
        this.idAdmin = idAdministrador;
        this.nom1Admin = nom1Admin;
        this.nom2Admin = nom2Admin;
        this.ape1Admin = ape1Admin;
        this.ape2Admin = ape2Admin;
        this.correoAdmin = correoAdmin;
        this.direccionAdmin = direccionAdmin;
        this.contraseñaAdmin = contraseñaAdmin;
        this.fotoAdmin = fotoAdmin;
      
               
    }

    public Administrador(String nom1Admin, String nom2Admin, String ape1Admin, String ape2Admin, String correoAdmin, String contraseñaAdmin, String direccionAdmin, String fotoAdmin) {
        this.nom1Admin = nom1Admin;
        this.nom2Admin = nom2Admin;
        this.ape1Admin = ape1Admin;
        this.ape2Admin = ape2Admin;
        this.correoAdmin = correoAdmin;
        this.contraseñaAdmin = contraseñaAdmin;
        this.direccionAdmin = direccionAdmin;
        this.fotoAdmin = fotoAdmin;
    }
    
    

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNom1Admin() {
        return nom1Admin;
    }

    public String getNom2Admin() {
        return nom2Admin;
    }

    public String getApe1Admin() {
        return ape1Admin;
    }

    public String getApe2Admin() {
        return ape2Admin;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public String getContraseñaAdmin() {
        return contraseñaAdmin;
    }

    public String getDireccionAdmin() {
        return direccionAdmin;
    }

    public String getFotoAdmin() {
        return fotoAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNom1Admin(String nom1Admin) {
        this.nom1Admin = nom1Admin;
    }

    public void setNom2Admin(String nom2Admin) {
        this.nom2Admin = nom2Admin;
    }

    public void setApe1Admin(String ape1Admin) {
        this.ape1Admin = ape1Admin;
    }

    public void setApe2Admin(String ape2Admin) {
        this.ape2Admin = ape2Admin;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    public void setContraseñaAdmin(String contraseñaAdmin) {
        this.contraseñaAdmin = contraseñaAdmin;
    }

    public void setDireccionAdmin(String direccionAdmin) {
        this.direccionAdmin = direccionAdmin;
    }

    public void setFotoAdmin(String fotoAdmin) {
        this.fotoAdmin = fotoAdmin;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdmin=" + idAdmin + ", nom1Admin=" + nom1Admin + ", nom2Admin=" + nom2Admin + ", ape1Admin=" + ape1Admin + ", ape2Admin=" + ape2Admin + ", correoAdmin=" + correoAdmin + ", contrase\u00f1aAdmin=" + contraseñaAdmin + ", direccionAdmin=" + direccionAdmin + ", fotoAdmin=" + fotoAdmin + '}';
    }
    
    
                   
}
