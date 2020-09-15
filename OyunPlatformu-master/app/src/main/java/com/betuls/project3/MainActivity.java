package com.betuls.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_titanic;
    Button btn_journey;
    Button btn_dice;
    Button btn_sayi_tahmin;
    Button btn_tic_tac;
    Button btn_sac_model;
    Button btn_kutuphane;
    Button btn_zombi;
    Button btn_sifreleme;
    Button btn_tavsan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_titanic = findViewById(R.id.btn_titanic);

        btn_titanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTitanic = new Intent(MainActivity.this,TitanicActivity.class);
                startActivity(intentTitanic);
                finish();
            }
        });

        btn_journey = findViewById(R.id.btn_journey);

        btn_journey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJourney = new Intent(MainActivity.this,JourneyActivity.class);
                startActivity(intentJourney);
                finish();
            }
        });

        btn_dice = findViewById(R.id.btn_dice);

        btn_dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDice = new Intent(MainActivity.this,DiceActivity.class);
                startActivity(intentDice);
                finish();
            }
        });

        btn_sayi_tahmin = findViewById(R.id.btn_sayi_tahmin);

        btn_sayi_tahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTahmin = new Intent(MainActivity.this,TahminActivity.class);
                startActivity(intentTahmin);
                finish();
            }
        });

        btn_tic_tac = findViewById(R.id.btn_tic_tac);

        btn_tic_tac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTicTac = new Intent(MainActivity.this,TicTacActivity.class);
                startActivity(intentTicTac);
                finish();
            }
        });

        btn_sac_model = findViewById(R.id.btn_sac_model);

        btn_sac_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSac = new Intent(MainActivity.this,SacActivity.class);
                startActivity(intentSac);
                finish();
            }
        });

        btn_kutuphane = findViewById(R.id.btn_kutuphane);

        btn_kutuphane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKutuphane = new Intent(MainActivity.this,KutuphaneActivity.class);
                startActivity(intentKutuphane);
                finish();
            }
        });

        btn_zombi = findViewById(R.id.btn_zombi);

        btn_zombi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentZombi = new Intent(MainActivity.this,ZombiActivity.class);
                startActivity(intentZombi);
                finish();
            }
        });

        btn_sifreleme = findViewById(R.id.btn_sifreleme);

        btn_sifreleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSifreleme = new Intent(MainActivity.this,SifrelemeActivity.class);
                startActivity(intentSifreleme);
                finish();
            }
        });

        btn_tavsan = findViewById(R.id.btn_tavsan);

        btn_tavsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTavsan = new Intent(MainActivity.this,TavsanActivity.class);
                startActivity(intentTavsan);
                finish();
            }
        });

    }
}
