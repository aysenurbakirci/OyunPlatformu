package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.Random;

public class ZombiActivity extends AppCompatActivity {

    RadioButton isikYok;
    RadioButton floresan;
    RadioButton losIsik;
    RadioButton kuru;
    RadioButton azNemli;
    RadioButton nemli;
    RadioButton hali;
    RadioButton tas;
    EditText sicaklik;
    EditText pencereSayisi;
    EditText gurultuMiktari;
    Button sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zombi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        isikYok = findViewById(R.id.isikYok);
        floresan = findViewById(R.id.floresan);
        losIsik = findViewById(R.id.losisik);
        kuru = findViewById(R.id.kuru);
        azNemli = findViewById(R.id.azNemli);
        nemli = findViewById(R.id.nemli);
        hali = findViewById(R.id.hali);
        tas = findViewById(R.id.tas);
        sicaklik = findViewById(R.id.sicaklik);
        pencereSayisi = findViewById(R.id.pencereSayisi);
        gurultuMiktari = findViewById(R.id.gurultuDerecesi);
        sec = findViewById(R.id.btnSec);
        alertBaslangic();


        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isikPuan = 0;
                if(isikYok.isChecked())
                    isikPuan = 1;
                if(losIsik.isChecked())
                    isikPuan = 2;
                if(floresan.isChecked())
                    isikPuan = 0;

                int nemPuan = 0;
                if(kuru.isChecked())
                    nemPuan = 0;
                if(azNemli.isChecked())
                    nemPuan = 1;
                if (nemli.isChecked())
                    nemPuan = 2;

                int zeminPuan = 0;
                if(hali.isChecked())
                    zeminPuan = 0;
                if(tas.isChecked())
                    zeminPuan = 1;

                int sicaklikPuan = 0;
                int s;
                s =Integer.parseInt(sicaklik.getText().toString());
                if(s>25 && s<30)
                    sicaklikPuan = 1;

                int pencerePuan = 0;
                int p;
                p = Integer.parseInt(pencereSayisi.getText().toString());
                if(p>4)
                    pencerePuan = 1;

                int gurultuPuan = 0;
                int g;
                g = Integer.parseInt(gurultuMiktari.getText().toString());
                if(g>6)
                    gurultuPuan = 1;


                int toplam = 0;

                toplam = isikPuan + nemPuan + zeminPuan + sicaklikPuan + pencerePuan + gurultuPuan;

                if(toplam > 4)
                    alertBitis("YAKALANDINIZ.");
                else
                    alertBitis("TEBRİKLER! KURTULDUNUZ!");

            }
        });

    }

    public void alertBaslangic(){
        String mesajBaslik = getApplicationContext().getString(R.string.zombie_tanitim_baslik);
        String mesaj = getApplicationContext().getString(R.string.zombie_tanitim);
        AlertDialog.Builder builder = new AlertDialog.Builder(ZombiActivity.this);
        builder.setTitle(mesajBaslik);
        builder.setMessage(mesaj);
        builder.setPositiveButton("Başla!", null);
        builder.show();
    }

    public void alertBitis(String mesaj){
        AlertDialog.Builder builder = new AlertDialog.Builder(ZombiActivity.this);
        builder.setTitle(mesaj);
        builder.setNeutralButton("Tamam", null);
        builder.show();
    }

    public int isikPuan(){
        int isikPuan = 0;
        if(isikYok.isChecked())
            isikPuan = 1;
        if(losIsik.isChecked())
            isikPuan = 2;
        if(floresan.isChecked())
            isikPuan = 0;

        return isikPuan;
    }

    public int nemPuan(){
        int nemPuan = 0;
        if(kuru.isChecked())
            nemPuan = 0;
        if(azNemli.isChecked())
            nemPuan = 1;
        if (nemli.isChecked())
            nemPuan = 2;

        return nemPuan;
    }

    public int sicaklikPuan(){
        int sicaklikPuan = 0;
        int s;
        s =Integer.parseInt(sicaklik.getText().toString());
        if(s>25 && s<30)
            sicaklikPuan = 1;

        return sicaklikPuan;
    }

    public int zeminPuan(){
        int zeminPuan = 0;
        if(hali.isChecked())
            zeminPuan = 0;
        if(tas.isChecked())
            zeminPuan = 1;
        return zeminPuan;
    }

    public int pencerePuan(){
        int pencerePuan = 0;
        int p;
        p = Integer.parseInt(pencereSayisi.getText().toString());
        if(p>4)
            pencerePuan = 1;

        return pencerePuan;
    }

    public int gurultuPuan(){
        int gurultuPuan = 0;
        int g;
        g = Integer.parseInt(gurultuMiktari.getText().toString());
        if(g>6)
            gurultuPuan = 1;

        return gurultuPuan;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    }
