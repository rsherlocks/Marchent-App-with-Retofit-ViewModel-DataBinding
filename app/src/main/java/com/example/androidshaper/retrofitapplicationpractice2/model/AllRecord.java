package com.example.androidshaper.retrofitapplicationpractice2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllRecord
{
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("total_parcels")
    @Expose
    private Integer totalParcels;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalParcels() {
        return totalParcels;
    }

    public void setTotalParcels(Integer totalParcels) {
        this.totalParcels = totalParcels;
    }
}
