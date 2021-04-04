package com.fstg.stock.ws.impl;

import com.fstg.stock.bean.Produit;
import com.fstg.stock.ws.facade.ProduitWs;
import retrofit2.Call;
import retrofit2.http.POST;

import java.io.IOException;
import java.util.List;

public class ProduitWsImpl extends AbstractWsImpl<ProduitWs>{

    public ProduitWsImpl() {
        super(ProduitWs.class);
    }

    public Integer save(Produit produit){
        try {
            return getApi().save(produit).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Produit> findAll(){
        try {
            return getApi().findAll().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Produit findByRef(String ref){
        try {
            return getApi().findByRef(ref).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
