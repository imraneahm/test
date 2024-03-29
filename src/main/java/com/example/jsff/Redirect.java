package com.example.jsff;

import jakarta.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import java.util.Random;

@RequestScoped
@ManagedBean
public class Redirect {
    public String gotopage() {
        Random random = new Random();
        int valeur = random.nextInt(2);
        if (valeur==1) return "/pile.xhtml";
        return "/face.xhtml";
    }
}