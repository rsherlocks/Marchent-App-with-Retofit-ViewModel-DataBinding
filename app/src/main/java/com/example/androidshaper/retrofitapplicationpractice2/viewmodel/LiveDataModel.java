package com.example.androidshaper.retrofitapplicationpractice2.viewmodel;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.androidshaper.retrofitapplicationpractice2.model.MainDataModel;
import com.example.androidshaper.retrofitapplicationpractice2.service.OurRetrofitClient;
import com.example.androidshaper.retrofitapplicationpractice2.service.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveDataModel
{
    private Application application;
    OurRetrofitClient ourRetrofitClient;
    MutableLiveData<MainDataModel> mainDataModelMutableLiveData =new MutableLiveData<>();

    public LiveDataModel(Application application)
    {
        this.application = application;
    }

    public MutableLiveData<MainDataModel> getMainDataModelMutableLiveData()
    {

            ourRetrofitClient= RetrofitInstance.getService();
            Call<MainDataModel> call=ourRetrofitClient.getObject();
            call.enqueue(new Callback<MainDataModel>() {
                @Override
                public void onResponse(
                        Call<MainDataModel> call,
                        Response<MainDataModel> response)
                {
                    MainDataModel mainDataModel=response.body();
//                    Log.d("Test", "onResponse: "+mainDataModel.getE());
//                    Log.d("Test", "onResponse: "+mainDataModel.getAmount());
//                    Log.d("Test", "onResponse: "+mainDataModel.getpTotat());
                    mainDataModelMutableLiveData.setValue(mainDataModel);
                }

                @Override
                public void onFailure(
                        Call<MainDataModel> call,
                        Throwable t)
                {

                }
            });


        return mainDataModelMutableLiveData;
    }
}
