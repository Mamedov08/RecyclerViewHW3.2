package com.example.recyclerviewhw32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfessionViewHolder extends RecyclerView.ViewHolder {
    private TextView tvProfession;

    public ProfessionViewHolder(@NonNull View itemView) {
        super(itemView);

        tvProfession = itemView.findViewById(R.id.tv_mountains);

    }
    public void bind(String mountains) {
        tvProfession.setText(mountains);
    }
}
