package com.example.babybuy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.babybuy.R;

public class StartingActivity extends AppCompatActivity {
    Button btn_get_started_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        //btn_get_started_now-> define new object to call btn_getStarted
        btn_get_started_now = findViewById(R.id.btn_getStarted);

        //btn_getStarted-> it had been define on #activity_main.xml file (line 64)
        btn_get_started_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartingActivity.this, LoginActivity.class));
            }
        });
    }
}