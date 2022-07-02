package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PaginaPrincipalaTest {

    @Test
    public void test(){

        Spf spf=new Spf("Spf","palstic");
        Primer primer=new Primer("Primer","Sticla");

        ArrayList<Produs> produse=new ArrayList<>();

        produse.add(primer);
        produse.add(spf);

        PaginaPrincipala paginaPrincipala=new PaginaPrincipala(produse);

        System.out.println("..........afisare............");
        paginaPrincipala.afisare();
        System.out.println(".............Update ambalaj...........");
        paginaPrincipala.updateAmbalaj("hartie");
        paginaPrincipala.afisare();


    }

}