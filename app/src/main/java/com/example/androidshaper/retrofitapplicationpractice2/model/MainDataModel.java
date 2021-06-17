package com.example.androidshaper.retrofitapplicationpractice2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainDataModel
{
    @SerializedName("e")
    @Expose
    private Integer e;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("p_totat")
    @Expose
    private Integer pTotat;
    @SerializedName("all_record")
    @Expose
    private List<AllRecord> allRecord = null;
    @SerializedName("Order")
    @Expose
    private List<Order> order = null;

    public Integer getE() {
        return e;
    }

    public void setE(Integer e) {
        this.e = e;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getpTotat() {
        return pTotat;
    }

    public void setpTotat(Integer pTotat) {
        this.pTotat = pTotat;
    }

    public List<AllRecord> getAllRecord() {
        return allRecord;
    }

    public void setAllRecord(List<AllRecord> allRecord) {
        this.allRecord = allRecord;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
}
