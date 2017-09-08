package com.example.android.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button auto = (Button) findViewById(R.id.auto);
        Button manual = (Button) findViewById(R.id.manual);

        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manualIntent = new Intent(MainActivity.this,ManualActivity.class);
                startActivity(manualIntent);
            }
        });
    }


}
