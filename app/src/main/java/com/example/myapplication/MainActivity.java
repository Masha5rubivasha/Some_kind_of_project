package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(MainActivity.this, "Какое-то сообщение", Toast.LENGTH_LONG);
        toast.show();
        Log.i (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(MainActivity.this, "Какое-то сообщение", Toast.LENGTH_LONG);
        toast.show();
        Log.d (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(MainActivity.this, "Какое-то сообщение", Toast.LENGTH_LONG);
        toast.show();
        Log.w (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(MainActivity.this, "Какое-то сообщение", Toast.LENGTH_LONG);
        toast.show();
        Log.i (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(MainActivity.this, "Какое-то сообщение", Toast.LENGTH_LONG);
        toast.show();
        Log.d (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(MainActivity.this, "Какое-то сообщение", Toast.LENGTH_LONG);
        toast.show();
        Log.w (TAG, "Это мое сообщение для записи в журнале");
    }
}