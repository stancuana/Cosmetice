package com.company;

public class Produs extends ProduseCosmetice{


    private String nume;
    private String ambalaj;


    public Produs(String nume,String ambalaj) {
        this.nume = nume;
        this.ambalaj=ambalaj;
    }

    public Produs() {
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAmbalaj() {
        return ambalaj;
    }

    public void setAmbalaj(String ambalaj) {
        this.ambalaj = ambalaj;
    }


    @Override
    public String toString() {
        return "Nume: " + this.nume + "\n" +
                "Ambalaj: " + this.ambalaj + "\n";
    }

    @Override
    public void updateAmbalaj(String ambalajNou) {

        this.setAmbalaj(ambalajNou);
        this.getAmbalaj();
    }
}
