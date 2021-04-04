package com.fstg.stock.ws.impl;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class AbstractWsImpl<T> {
    private OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    private Retrofit retrofit;
    private Class entityClass;
    private String baseUrl="http://localhost:8090/stock-api/";

    public AbstractWsImpl(Class entityClass){
        this.entityClass=entityClass;
    }
    public OkHttpClient.Builder getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(OkHttpClient.Builder httpClient) {
        this.httpClient = httpClient;
    }


    public  T getApi(){
        return (T) getRetrofit().create(entityClass);
    }
    public Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
        }
        return retrofit;
    }

    public void setRetrofit(Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}
