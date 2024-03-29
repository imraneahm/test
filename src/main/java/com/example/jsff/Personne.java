package com.example.jsff;

public class Personne  {

    public String  name ;
    private String  prenom ;
    private String  email ;
    private String  tel ;


    public Personne() {
    }

    public Personne(String name, String prenom, String email, String tel) {
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
