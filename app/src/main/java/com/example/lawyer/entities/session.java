package com.example.lawyer.entities;

public class session {


    private String num;
    private String nomSession;
    private String sujet;
    private String notes;
    private String descrip;
    private String Cpt_Rd;

    public session() {
    }

    public session(String num, String nomSession, String sujet) {
        this.num = num;
        this.nomSession = nomSession;
        this.sujet = sujet;
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNomSession() {
        return nomSession;
    }

    public void setNomSession(String nomSession) {
        this.nomSession = nomSession;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCpt_Rd() {
        return Cpt_Rd;
    }

    public void setCpt_Rd(String cpt_Rd) {
        Cpt_Rd = cpt_Rd;
    }
}
