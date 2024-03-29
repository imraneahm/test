package com.example.jsff;

import jakarta.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

@RequestScoped
@ManagedBean
public class UserBean {
    public String nom ;
    public String prenom ;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public String afficherinfos() {
        if (nom==null) return "" ;
        return "Bonjour " + nom + " "  ;
    }

}