package com.example.androidshaper.retrofitapplicationpractice2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload
{
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("order_id")
    @Expose
    private Integer orderId;
    @SerializedName("client_id")
    @Expose
    private Integer clientId;

    public Payload(
            Integer amount,
            Integer orderId,
            Integer clientId)
    {
        this.amount = amount;
        this.orderId = orderId;
        this.clientId = clientId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

}
