package com.example.khalisavirra.khalisavirra_1202154312_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText mmenu;
    private EditText mporsi;
    private Button eatbus;
    private Button abnormal;
    private TextView harga;

    public static final int TEXT_REQUEST = 1;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mmenu = (EditText)findViewById(R.id.text_menu);
        mporsi = (EditText)findViewById(R.id.text_porsi);
        eatbus= (Button)findViewById(R.id.button_eat);
        abnormal = (Button)findViewById(R.id.button_ab);
    }


    public void klik_eat(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        int uang = 65500;
        Log.d(LOG_TAG, "Button clicked!");
        String uang_osas = String.valueOf(uang);
        intent.putExtra("uang_osas", uang_osas);

        String tempat = "Eatbus";
        intent.putExtra("tempat", tempat);

        String menu = mmenu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = mporsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }

    public void klik_ab(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        int uang = 65500;
        String uang_osas = String.valueOf(uang);
        intent.putExtra("uang_osas", uang_osas);

        String tempat = "Abnormal";
        intent.putExtra("tempat", tempat);;

        String menu = mmenu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = mporsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }
}

