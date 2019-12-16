package com.example.lawyer.entities;

public class demande {

    private String nomdemande;
    private String partieConcernee;
    private String type;
    private String syjet;
    private String date;
    private String notes;

    public demande() {
    }

    public demande(String nomdemande, String partieConcernee) {
        this.nomdemande = nomdemande;
        this.partieConcernee = partieConcernee;
    }

    public String getNomdemande() {
        return nomdemande;
    }

    public void setNomdemande(String nomdemande) {
        this.nomdemande = nomdemande;
    }

    public String getPartieConcernee() {
        return partieConcernee;
    }

    public void setPartieConcernee(String partieConcernee) {
        this.partieConcernee = partieConcernee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSyjet() {
        return syjet;
    }

    public void setSyjet(String syjet) {
        this.syjet = syjet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
