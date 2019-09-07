package com.example.a5lesson3month;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder>{
    ArrayList<DescriptionActivity> descriptionActivities;
    public Adapter(){
        descriptionActivities = new ArrayList<>();
        descriptionActivities.add(new DescriptionActivity("Some title" ,
                "Some description" , true));
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(descriptionActivities.get(position));
    }

    @Override
    public int getItemCount() {
        return descriptionActivities.size();
    }
}
