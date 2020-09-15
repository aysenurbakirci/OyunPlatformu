package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Objects;

public class JourneyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_sonuc_journey = findViewById(R.id.btn_sonuc_journey);

        final RadioButton yas5_radio = findViewById(R.id.yas5_radio);
        final RadioButton yas10_radio = findViewById(R.id.yas10_radio);
        final RadioButton uzaklik0_radio = findViewById(R.id.uzaklik0_radio);
        final RadioButton uzaklik1_radio = findViewById(R.id.uzaklik1_radio);
        final RadioButton arkadas0_radio = findViewById(R.id.arkadas0_radio);
        final RadioButton arkadas1_radio = findViewById(R.id.arkadas1_radio);

        btn_sonuc_journey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(yas5_radio.isChecked() && uzaklik1_radio.isChecked()){
                    displayToast(getString(R.string.araba));
                }
                else if(yas10_radio.isChecked() && uzaklik1_radio.isChecked()){
                    displayToast(getString(R.string.araba));
                }
                else if(yas10_radio.isChecked() && uzaklik0_radio.isChecked() && arkadas1_radio.isChecked()){
                    displayToast(getString(R.string.bisiklet));
                }
                else if(yas5_radio.isChecked() && uzaklik0_radio.isChecked() && arkadas0_radio.isChecked()){
                    displayToast(getString(R.string.bisiklet));
                }
                else if(yas10_radio.isChecked() && uzaklik0_radio.isChecked() && arkadas0_radio.isChecked()){
                    displayToast(getString(R.string.yürüme));
                }
                else if(yas5_radio.isChecked() && uzaklik0_radio.isChecked() && arkadas1_radio.isChecked()){
                    displayToast(getString(R.string.yürüme));
                }
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
