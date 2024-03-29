package com.example.jsff;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Bind {
    public String valeur ;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String message="" ;

    public boolean isInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    public boolean invisible = false ;

    public Bind() {
    }



    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public void check(){
        int value = Integer.parseInt(valeur);
        invisible = true ;
        if (value==20) message="Nady";
        if (value > 20) {
            message = " Plus petit " ;
        }
        if(value<20){
            message = " Plus Grand ";
        }
    }

    public  void reset(){
        this.valeur = "" ;
        this.invisible = false ;

    }
}
