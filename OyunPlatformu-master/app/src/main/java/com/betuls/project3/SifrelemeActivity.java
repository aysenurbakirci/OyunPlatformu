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

public class SifrelemeActivity extends AppCompatActivity {

    EditText sifreleGiris;
    EditText sifreCozGiris;
    Button sifreleBtn;
    Button sifreCozBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifreleme);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sifreleGiris = findViewById(R.id.sifreleGiris);
        sifreCozGiris = findViewById(R.id.sifreCozGiris);
        sifreleBtn = findViewById(R.id.btnSifrele);
        sifreCozBtn = findViewById(R.id.btnSifreCoz);

        sifreleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sifrele(sifreleGiris.getText().toString());
            }
        });

        sifreCozBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sifreCoz(sifreCozGiris.getText().toString());
            }
        });
    }

    public void sifrele(String kelime){
        String sifrelenmisMesaj = "";
        char [] harfler = kelime.toCharArray();

        for(int i=0; i<harfler.length; i++)
            sifrelenmisMesaj += Character.toString((char) ((harfler[i] + 3) + harfler.length));

        alertMesaj(sifrelenmisMesaj);
    }

    public void sifreCoz(String kelime){
        String sifresiCozulmusMesaj = "";
        char [] harfler = kelime.toCharArray();

        for(int i=0; i<harfler.length; i++)
            sifresiCozulmusMesaj += Character.toString((char) ((harfler[i] - 3) - harfler.length));

        alertMesaj(sifresiCozulmusMesaj);
    }

    public void alertMesaj(String mesaj){
        AlertDialog.Builder b = new AlertDialog.Builder(SifrelemeActivity.this);
        b.setTitle("Mesajınız:");
        b.setMessage(mesaj);
        b.setNeutralButton("Tamam", null);
        b.show();
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
