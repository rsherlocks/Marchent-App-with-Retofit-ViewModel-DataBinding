package com.example.androidshaper.retrofitapplicationpractice2.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.example.androidshaper.retrofitapplicationpractice2.adapter.RecyclerViewAdapter;
import com.example.androidshaper.retrofitapplicationpractice2.model.AllRecord;
import com.example.androidshaper.retrofitapplicationpractice2.model.MainDataModel;
import com.example.androidshaper.retrofitapplicationpractice2.model.Order;
import com.example.androidshaper.retrofitapplicationpractice2.model.Payload;
import com.example.androidshaper.retrofitapplicationpractice2.R;
import com.example.androidshaper.retrofitapplicationpractice2.repositories.ViewRepositories;
import com.example.androidshaper.retrofitapplicationpractice2.service.OurRetrofitClient;
import com.example.androidshaper.retrofitapplicationpractice2.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    ViewRepositories viewRepositories;
    OurRetrofitClient ourRetrofitClient;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.recyclerViewPayload.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        getData();
        //getDataRetrofit();
    }

    //    private void getDataRetrofit()
    //    {
    //        ourRetrofitClient= RetrofitInstance.getService();
    //        Call<MainDataModel> call=ourRetrofitClient.getObject();
    //        call.enqueue(new Callback<MainDataModel>() {
    //            @Override
    //            public void onResponse(
    //                    Call<MainDataModel> call,
    //                    Response<MainDataModel> response)
    //            {
    //                MainDataModel mainDataModel=response.body();
    //                Log.d("Test", "onResponse: "+mainDataModel.getE());
    //                Log.d("Test", "onResponse: "+mainDataModel.getAmount());
    //                Log.d("Test", "onResponse: "+mainDataModel.getpTotat());
    //                List<AllRecord> allRecordList=mainDataModel.getAllRecord();
    //
    //            }
    //
    //            @Override
    //            public void onFailure(
    //                    Call<MainDataModel> call,
    //                    Throwable t)
    //            {
    //
    //            }
    //        });
    //    }

    private void getData()
    {
        viewRepositories = new ViewModelProvider(this).get(ViewRepositories.class);
        viewRepositories.getMainDataModelMutableLiveData().observe(this, new Observer<MainDataModel>()
        {
            @Override
            public void onChanged(MainDataModel mainDataModel)
            {
                Log.d("Test", "E: " + mainDataModel.getE());
                Log.d("Test", "Amount: " + mainDataModel.getAmount());
                Log.d("Test", "Total_price: " + mainDataModel.getpTotat());
                for (AllRecord allRecord : mainDataModel.getAllRecord())
                {
                    Log.d("Test", "Id: " + allRecord.getId());
                    Log.d("Test", "Total_Parcel: " + allRecord.getTotalParcels());
                }
                for (Order order : mainDataModel.getOrder())
                {
                    List<Payload> payloadList = order.getPayloads();
                    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(payloadList);
                    activityMainBinding.recyclerViewPayload.setAdapter(recyclerViewAdapter);
                }

            }
        });
    }
}