package com.company;

import java.util.ArrayList;

public class PaginaPrincipala extends Produs{

    private ArrayList<Produs> produse;

    public PaginaPrincipala(ArrayList<Produs> produse){
        this.produse=produse;
    }

    @Override
    public void updateAmbalaj(String ambalajNou) {
        for(Produs produs:produse){
            produs.updateAmbalaj(ambalajNou);
        }
    }

    public void afisare(){
        for(Produs produs:produse){
            System.out.println(produs.toString());
        }
    }
}
