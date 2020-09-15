package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class KutuphaneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kutuphane);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnBul = findViewById(R.id.btnBul);

        final RadioButton roman = findViewById(R.id.roman);
        final RadioButton masal = findViewById(R.id.masal);
        final RadioButton siir = findViewById(R.id.siir);
        final RadioButton bilim = findViewById(R.id.bilim);
        final RadioButton aksiyon = findViewById(R.id.aksiyon);
        final RadioButton psikoloji = findViewById(R.id.psikoloji);
        final RadioButton dusunce = findViewById(R.id.dusunce);
        final RadioButton romantik = findViewById(R.id.romantik);
        final RadioButton cocuk = findViewById(R.id.cocuk);
        final RadioButton uzay = findViewById(R.id.uzay);

        btnBul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(aksiyon.isChecked() && roman.isChecked())
                    displayToast(getString(R.string.yas_16));
                    else if(psikoloji.isChecked() && roman.isChecked())
                        displayToast(getString(R.string.yas_17));
                    else if(dusunce.isChecked() && roman.isChecked())
                        displayToast(getString(R.string.yas_15));
                    else if (romantik.isChecked() && roman.isChecked())
                        displayToast(getString(R.string.yas_16));

                    else if(uzay.isChecked() && bilim.isChecked())
                        displayToast(getString(R.string.yas_12));
                    else if(psikoloji.isChecked() && bilim.isChecked())
                        displayToast(getString(R.string.yas_14));
                    else if(dusunce.isChecked() && bilim.isChecked())
                        displayToast(getString(R.string.yas_14));

                    else if(dusunce.isChecked() && siir.isChecked())
                        displayToast(getString(R.string.yas_16));
                    else if(romantik.isChecked() && siir.isChecked())
                        displayToast(getString(R.string.yas_16));

                else if(masal.isChecked() && cocuk.isChecked())
                    displayToast(getString(R.string.herkes));
            }
        });
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
