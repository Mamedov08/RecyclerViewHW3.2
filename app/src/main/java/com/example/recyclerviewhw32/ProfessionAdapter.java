package com.example.recyclerviewhw32;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfessionAdapter extends RecyclerView.Adapter <ProfessionViewHolder>{

    private ArrayList<String>  professionList;

    public ProfessionAdapter(ArrayList<String> mountainsList) {
        this.professionList = mountainsList;
    }

    @NonNull
    @Override
    public ProfessionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProfessionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profession, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ProfessionViewHolder holder, int position) {
        holder.bind(professionList.get(position));
    }

    @Override
    public int getItemCount() {
        return professionList.size();
    }
}
