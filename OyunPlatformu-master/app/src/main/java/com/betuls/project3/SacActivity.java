package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sac);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_tahmin_sac = findViewById(R.id.btn_tahmin_sac);

        final RadioButton yuz_oval_radio = findViewById(R.id.yuz_oval_radio);
        final RadioButton yuz_ucgen_radio = findViewById(R.id.yuz_ucgen_radio);
        final RadioButton yuz_kare_radio = findViewById(R.id.yuz_kare_radio);
        final RadioButton koseli_kas_radio = findViewById(R.id.koseli_kas_radio);
        final RadioButton duz_kas_radio = findViewById(R.id.duz_kas_radio);
        final RadioButton kavisli_kas_radio  = findViewById(R.id.kavisli_kas_radio);

        btn_tahmin_sac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(yuz_oval_radio.isChecked() && koseli_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setMessage("Örgülü Topuz Modeli");
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setIcon(R.drawable.orgu_topuz);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_oval_radio.isChecked() && duz_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Katlı Kesimli Model");
                    builder.setIcon(R.drawable.kisa_katli);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_oval_radio.isChecked() && kavisli_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Perçemli Kısa Model");
                    builder.setIcon(R.drawable.kisa_sari);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_ucgen_radio.isChecked() && koseli_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Kabarık Kıvırcık Model");
                    builder.setIcon(R.drawable.kivircik);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_ucgen_radio.isChecked() && duz_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Lüleli Uzun Model");
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setIcon(R.drawable.uzun_lule);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_ucgen_radio.isChecked() && kavisli_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Uzun Model");
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setIcon(R.drawable.uzun);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_kare_radio.isChecked() && koseli_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Yarım Toplu Model");
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setIcon(R.drawable.onden_toplu);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_kare_radio.isChecked() && duz_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Kahküllü Kısa Model");
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setIcon(R.drawable.kisa_kahkullu);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
                else if(yuz_kare_radio.isChecked() && kavisli_kas_radio.isChecked()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(SacActivity.this);
                    builder.setTitle("<— Sizin İçin Seçtiğim Saç Modeli");
                    builder.setMessage("Kısa Model");
                    builder.setCancelable(false);
                    builder.setInverseBackgroundForced(true);
                    builder.setIcon(R.drawable.kisa_duz);
                    builder.setNegativeButton("Uygulamaya Dön", null);
                    builder.show();
                }
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
