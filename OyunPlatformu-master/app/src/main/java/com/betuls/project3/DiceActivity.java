package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Objects;
import java.util.Random;

public class DiceActivity extends AppCompatActivity {
    ImageView img_dice;
    Random rndm = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img_dice = findViewById(R.id.img_dice);
        img_dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    private void rollDice(){
        int randomNumber = rndm.nextInt(6) +1;

        final RadioButton zar1_radio = findViewById(R.id.zar1_radio);
        final RadioButton zar2_radio = findViewById(R.id.zar2_radio);
        final RadioButton zar3_radio = findViewById(R.id.zar3_radio);
        final RadioButton zar4_radio = findViewById(R.id.zar4_radio);
        final RadioButton zar5_radio = findViewById(R.id.zar5_radio);
        final RadioButton zar6_radio = findViewById(R.id.zar6_radio);

        switch (randomNumber){
            case 1:
                img_dice.setImageResource(R.drawable.dice1);
                if(zar1_radio.isChecked())
                    displayToast(getString(R.string.dogru_tahmin_zar));
                else
                    displayToast(getString(R.string.yanlis_tahmin_zar));
                break;
            case 2:
                img_dice.setImageResource(R.drawable.dice2);
                if(zar2_radio.isChecked())
                    displayToast(getString(R.string.dogru_tahmin_zar));
                else
                    displayToast(getString(R.string.yanlis_tahmin_zar));
                break;
            case 3:
                img_dice.setImageResource(R.drawable.dice3);
                if(zar3_radio.isChecked())
                    displayToast(getString(R.string.dogru_tahmin_zar));
                else
                    displayToast(getString(R.string.yanlis_tahmin_zar));
                break;
            case 4:
                img_dice.setImageResource(R.drawable.dice4);
                if(zar4_radio.isChecked())
                    displayToast(getString(R.string.dogru_tahmin_zar));
                else
                    displayToast(getString(R.string.yanlis_tahmin_zar));
                break;
            case 5:
                img_dice.setImageResource(R.drawable.dice5);
                if(zar5_radio.isChecked())
                    displayToast(getString(R.string.dogru_tahmin_zar));
                else
                    displayToast(getString(R.string.yanlis_tahmin_zar));
                break;
            case 6:
                img_dice.setImageResource(R.drawable.dice6);
                if(zar6_radio.isChecked())
                    displayToast(getString(R.string.dogru_tahmin_zar));
                else
                    displayToast(getString(R.string.yanlis_tahmin_zar));
                break;
        }
    }

    private void displayToast(String string) {
        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();
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

