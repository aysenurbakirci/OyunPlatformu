package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TahminActivity extends AppCompatActivity {

    Button tahminEt;
    Button yenidenOyna;
    EditText gelenSayi;
    public int rastgeleSayi;
    public int girilenSayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tahminEt = (Button) findViewById(R.id.tahminEt);
        yenidenOyna = (Button) findViewById(R.id.yenidenOyna);
        gelenSayi = (EditText) findViewById(R.id.yazi);

        rastgeleSayi = (int) (((Math.random()) * 100) + 1);

        tahminEt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)

            {
                girilenSayi = Integer.parseInt(gelenSayi.getText().toString());

                if (girilenSayi > rastgeleSayi) {
                    Toast.makeText(getApplicationContext(), "Daha Küçük Bir Sayı Gir", Toast.LENGTH_SHORT).show();
                } else if (girilenSayi < rastgeleSayi) {
                    Toast.makeText(getApplicationContext(), "Daha Büyük Bir Sayı Gir", Toast.LENGTH_SHORT).show();
                } else if (girilenSayi == rastgeleSayi) {
                    Toast.makeText(getApplicationContext(), "Tebrikler Sayıyı Buldun !  Sayı : " + rastgeleSayi, Toast.LENGTH_SHORT).show();

                }

            }
        });

        yenidenOyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rastgeleSayi = (int) (((Math.random()) * 100) + 1);

                Toast.makeText(getApplicationContext(), "Oyun Yeniden Başladı !", Toast.LENGTH_SHORT).show();

            }
        });
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