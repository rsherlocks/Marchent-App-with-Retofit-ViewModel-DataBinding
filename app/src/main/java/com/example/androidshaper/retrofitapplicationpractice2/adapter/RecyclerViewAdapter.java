package com.example.androidshaper.retrofitapplicationpractice2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidshaper.retrofitapplicationpractice2.model.Payload;
import com.example.androidshaper.retrofitapplicationpractice2.R;
import com.example.androidshaper.retrofitapplicationpractice2.databinding.PayloadChildLayoutBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.UserViewHolder>
{
    List<Payload> payloadList;

    public RecyclerViewAdapter(List<Payload> payloadList)
    {
        this.payloadList = payloadList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public UserViewHolder onCreateViewHolder(
            @NonNull @org.jetbrains.annotations.NotNull ViewGroup parent,
            int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        PayloadChildLayoutBinding payloadChildLayoutBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.payload_child_layout, parent, false);

        return new UserViewHolder(payloadChildLayoutBinding);
    }

    @Override
    public void onBindViewHolder(
            @NonNull @org.jetbrains.annotations.NotNull RecyclerViewAdapter.UserViewHolder holder,
            int position)
    {
        holder.payloadChildLayoutBinding.setPayload(payloadList.get(position));
        holder.payloadChildLayoutBinding.executePendingBindings();
    }

    @Override
    public int getItemCount()
    {
        return payloadList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder
    {
        PayloadChildLayoutBinding payloadChildLayoutBinding;

        public UserViewHolder(PayloadChildLayoutBinding payloadChildLayoutBinding)
        {
            super(payloadChildLayoutBinding.getRoot());
            this.payloadChildLayoutBinding=payloadChildLayoutBinding;
        }
    }
}
