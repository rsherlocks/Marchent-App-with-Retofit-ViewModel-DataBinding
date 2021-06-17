package com.example.androidshaper.retrofitapplicationpractice2.repositories;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.androidshaper.retrofitapplicationpractice2.model.MainDataModel;
import com.example.androidshaper.retrofitapplicationpractice2.viewmodel.LiveDataModel;

public class ViewRepositories extends AndroidViewModel
{
    public LiveDataModel liveDataModel;

    public ViewRepositories(Application application)
    {
        super(application);
        this.liveDataModel=new LiveDataModel(application);

    }

    public MutableLiveData<MainDataModel> getMainDataModelMutableLiveData()
    {
        return liveDataModel.getMainDataModelMutableLiveData();
    }
}
