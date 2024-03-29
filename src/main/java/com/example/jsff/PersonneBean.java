package com.example.jsff;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class PersonneBean {
    public PersonneBean() {
    }

    public List<Personne> getPersonnes(){
        List<Personne> Personnes = new ArrayList<>();
        Personnes.add(new Personne("AA","BB","CC","DD"));
        Personnes.add(new Personne("AA1","BB1","CC1","DD2"));
        Personnes.add(new Personne("AA2","BB2","CC2","DD2"));
        return Personnes ;
    }
}
