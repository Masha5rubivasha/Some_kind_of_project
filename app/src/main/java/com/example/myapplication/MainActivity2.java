package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViev = (TextView) findViewById(R.id. textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textViev.setText(name);
    }
    public void maps_back(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}