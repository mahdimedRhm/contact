/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import java.io.Serializable;

/**
 *
 * @author acer
 */
public class Contact implements Serializable{
    private String nom ; 
    private String prenom ; 
    private String mobile ; 

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Contact(String nom, String prenom, String mobile) {
        setNom(nom);
        setPrenom(prenom);
        setMobile(mobile);
    }

    public Contact() {
        setNom(null);
        setPrenom(null);
        setMobile(null);
    }
    
    
}
