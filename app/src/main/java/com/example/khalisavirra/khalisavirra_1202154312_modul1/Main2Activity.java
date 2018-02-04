package com.example.khalisavirra.khalisavirra_1202154312_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
            String menu = intent.getStringExtra("menu");
            TextView textView = (TextView)findViewById(R.id.text4);
            textView.setText(menu);
        Intent intent2 = getIntent();
            String porsi = intent2.getStringExtra("porsi");
            TextView textView2 = (TextView)findViewById(R.id.text6);
            textView2.setText(porsi);
        Intent intent3 = getIntent();
        String tempat = intent3.getStringExtra("tempat");
        int totalPorsi = Integer.parseInt(porsi);
        Intent intent4 = getIntent();
        String uang_osas = intent4.getStringExtra("uang_osas");
        int uang = Integer.parseInt(uang_osas);

        if (tempat.contains("Eatbus")) {
            int harga = 50000;
            int totalHarga = harga * totalPorsi;

            if (uang >= totalHarga) {
                TextView tempatMakan = findViewById(R.id.text2);
                tempatMakan.setText(tempat);

                TextView menuMakan = findViewById(R.id.text4);
                menuMakan.setText(menu);

                TextView porsiMakan = findViewById(R.id.text6);
                porsiMakan.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView total = findViewById(R.id.text8);
                total.setText(hasil);

                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
            } else {
                TextView tempatMakan = findViewById(R.id.text2);
                tempatMakan.setText(tempat);

                TextView menuMakan = findViewById(R.id.text4);
                menuMakan.setText(menu);

                TextView porsiMakan = findViewById(R.id.text6);
                porsiMakan.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView total = findViewById(R.id.text8);

                total.setText(hasil);

                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            }

        } else {
            int harga = 30000;
            int totalHarga = harga * totalPorsi;
            if (uang >= totalHarga) {
                TextView tempatMakan = findViewById(R.id.text2);
                tempatMakan.setText(tempat);

                TextView menuMakan = findViewById(R.id.text4);
                menuMakan.setText(menu);

                TextView porsiMakan = findViewById(R.id.text6);
                porsiMakan.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView total = findViewById(R.id.text8);
                total.setText(hasil);

                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
            } else {
                TextView tempatMakan = findViewById(R.id.text2);
                tempatMakan.setText(tempat);

                TextView menuMakan = findViewById(R.id.text4);
                menuMakan.setText(menu);

                TextView porsiMakan = findViewById(R.id.text6);
                porsiMakan.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView total = findViewById(R.id.text8);

                total.setText(hasil);

                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            }
        }
    }
}

