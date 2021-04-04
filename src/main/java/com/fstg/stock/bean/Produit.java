package com.fstg.stock.bean;

public class Produit {
    private Long id;
    private String ref;
    private String libelle;

    public Produit(String ref, String libelle) {
        this.ref = ref;
        this.libelle = libelle;
    }

    public Produit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
