package com.example.a5lesson3month;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import java.io.Serializable;

public class DescriptionActivity extends AppCompatActivity implements Serializable {

    Button save1;
    EditText title11;
    EditText description11;
    CheckBox isDone11;

    public DescriptionActivity(EditText title11, EditText description11, CheckBox isDone11) {
        this.title11 = title11;
        this.description11 = description11;
        this.isDone11 = isDone11;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        save1 = findViewById(R.id.save);
        title11 = findViewById(R.id.title1);
        description11 = findViewById(R.id.description);
        isDone11 = findViewById(R.id.done);
        save1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                MainActivity mainActivity = new MainActivity(title11.getText().toString(),
                        description11.getText().toString(),
                        isDone11.isChecked());
                intent.putExtra("test" , (Serializable) mainActivity);
                setResult(RESULT_OK , intent);
                finish();
            }
        });
    }
}
