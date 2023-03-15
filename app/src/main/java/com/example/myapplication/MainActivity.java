package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    EditText name_account;
    Button save_button;
    TextView activ2;

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_account = findViewById(R.id.editTextTextPersonName2);//ввод имени
        Button save_button = findViewById(R.id.button_save);//кнопка сохранения
        ImageView wine_glass = findViewById(R.id.imageView);//картинка
        activ2 = findViewById(R.id.textView2);
        wine_glass.setImageResource(R.drawable.pngwing_com);

        TextView profile = findViewById(R.id.textView3);
        profile.setText(R.string.account);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i (TAG, "Данные о пользователе сохранены");
                Toast toast = Toast.makeText(MainActivity.this, "Сохранено", Toast.LENGTH_LONG);
                toast.show();
                info_password();
            }
        });

    }

    public void info_password (){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Хотите установить пароль?")
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Позже", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void view_maps(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", name_account.getText().toString());
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            if (data == null){
                return;
            }
            String name = data.getStringExtra("name");
            activ2.setText (name);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.w (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d (TAG, "Это мое сообщение для записи в журнале");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w (TAG, "Это мое сообщение для записи в журнале");
    }
}