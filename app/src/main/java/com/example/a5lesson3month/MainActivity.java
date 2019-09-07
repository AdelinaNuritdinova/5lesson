package com.example.a5lesson3month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button add2;
    Adapter adapter;
    ViewHolder viewHolder;
    RecyclerView.LayoutManager layoutManager;

    public MainActivity(Object toString, Object toString1, boolean checked) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add2 = findViewById(R.id.add1);
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , DescriptionActivity.class);
                startActivityForResult(intent , 1);
            }
        });

    }
}
