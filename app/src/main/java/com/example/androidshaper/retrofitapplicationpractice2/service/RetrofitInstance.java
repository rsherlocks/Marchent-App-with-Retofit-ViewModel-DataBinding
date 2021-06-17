package com.example.androidshaper.retrofitapplicationpractice2.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance
{
    private static Retrofit retrofit = null;
    private static String baseUrl = "https://dheo.com/ops/d/courierapp/";

    public static OurRetrofitClient getService()
    {
        retrofit = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build();

        return retrofit.create(OurRetrofitClient.class);
    }

}
