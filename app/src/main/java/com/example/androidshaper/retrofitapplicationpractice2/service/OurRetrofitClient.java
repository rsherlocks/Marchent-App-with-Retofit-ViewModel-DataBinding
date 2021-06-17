package com.example.androidshaper.retrofitapplicationpractice2.service;


import com.example.androidshaper.retrofitapplicationpractice2.model.MainDataModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OurRetrofitClient
{
    @GET("test_api_cash_received_by_hub_pintu")
    Call<MainDataModel> getObject();
}
