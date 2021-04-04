package com.fstg.stock;

import com.fstg.stock.bean.Produit;
import com.fstg.stock.ws.impl.ProduitWsImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProduitWsImpl produitWs= new ProduitWsImpl();
        Integer save = produitWs.save(new Produit("p4", "produit 4"));
        System.out.println("save = " + save);
        Produit produit = produitWs.findByRef("p2");
        System.out.println("produit = " + produit);
        List<Produit> all = produitWs.findAll();
        System.out.println("all = " + all);

    }
}
