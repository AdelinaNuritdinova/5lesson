package com.example.a5lesson3month;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    CheckBox isDone;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title0);
        isDone = itemView.findViewById(R.id.done0);
    }
    public void onBind(DescriptionActivity descriptionActivity) {
        title.setText(descriptionActivity.title);
        isDone.setChecked(descriptionActivity.isDone);

    }
}
