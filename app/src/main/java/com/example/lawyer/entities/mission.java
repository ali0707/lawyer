package com.example.lawyer.entities;

public class mission {

    private String nommission;
    private String date;
    private String duree;
    private String partieconcernee;
    private String addressepartiec;
    private String type;
    private String requis;
    private String note;

    public mission() {
    }

    public mission(String nommission, String date) {
        this.nommission = nommission;
        this.date = date;
    }

    public String getNommission() {
        return nommission;
    }

    public void setNommission(String nommission) {
        this.nommission = nommission;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getPartieconcernee() {
        return partieconcernee;
    }

    public void setPartieconcernee(String partieconcernee) {
        this.partieconcernee = partieconcernee;
    }

    public String getAddressepartiec() {
        return addressepartiec;
    }

    public void setAddressepartiec(String addressepartiec) {
        this.addressepartiec = addressepartiec;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequis() {
        return requis;
    }

    public void setRequis(String requis) {
        this.requis = requis;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
