package com.example.lawyer.entities;

import java.util.Date;

public class affaire {

    private int num;
    private String name;
    private String degre;
    private String sujet;
    private String etat;
    private String date;


    public affaire(String name, String degre, String etat) {
        this.name = name;
        this.degre = degre;
        this.etat = etat;
    }

    public affaire(int num, String name, String degre, String sujet, String etat, String date) {
        this.num = num;
        this.name = name;
        this.degre = degre;
        this.sujet = sujet;
        this.etat = etat;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegre() {
        return degre;
    }

    public void setDegre(String degre) {
        this.degre = degre;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
