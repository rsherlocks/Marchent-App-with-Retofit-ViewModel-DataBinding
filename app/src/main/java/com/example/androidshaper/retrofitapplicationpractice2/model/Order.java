package com.example.androidshaper.retrofitapplicationpractice2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Order
{
    @SerializedName("courier")
    @Expose
    private String courier;
    @SerializedName("payloads")
    @Expose
    private List<Payload> payloads = null;
    @SerializedName("received_by")
    @Expose
    private Integer receivedBy;

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public List<Payload> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<Payload> payloads) {
        this.payloads = payloads;
    }

    public Integer getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(Integer receivedBy) {
        this.receivedBy = receivedBy;
    }
}
