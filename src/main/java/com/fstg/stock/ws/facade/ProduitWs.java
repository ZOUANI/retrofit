package com.fstg.stock.ws.facade;

import com.fstg.stock.bean.Produit;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface ProduitWs {
    @GET("produit/ref/{ref}")
     Call<Produit> findByRef(@Path("ref") String ref);

    @GET("produit/")
    Call<List<Produit>> findAll();


    @POST("produit/")
    Call<Integer> save(@Body Produit produit);
}
