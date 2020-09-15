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

public class TitanicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titanic);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_sonuc = findViewById(R.id.btn_sonuc);

        final RadioButton one = findViewById(R.id.one);
        final RadioButton two = findViewById(R.id.two);
        final RadioButton three = findViewById(R.id.three);
        final RadioButton kadin = findViewById(R.id.kadin);
        final RadioButton erkek = findViewById(R.id.erkek);
        final RadioButton cocukvar_esyok = findViewById(R.id.cocukvar_esyok);
        final RadioButton cocukvar_esvar = findViewById(R.id.cocukvar_esvar);
        final RadioButton cocukyok_esvar = findViewById(R.id.cocukyok_esvar);
        final RadioButton cocukyok_esyok = findViewById(R.id.cocukyok_esyok);
        final RadioButton ilk_aralik = findViewById(R.id.ilk_aralik);
        final RadioButton ikinci_aralik = findViewById(R.id.ikinci_aralik);
        final RadioButton ucuncu_aralik = findViewById(R.id.ucuncu_aralik);
        final RadioButton dorduncu_aralik = findViewById(R.id.dorduncu_aralik);
        final RadioButton odenen_ilk = findViewById(R.id.odenen_ilk);
        final RadioButton odenen_ikinci = findViewById(R.id.odenen_ikinci);

        btn_sonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(two.isChecked())
                    displayToast(getString(R.string.not_survive));
                if(three.isChecked())
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && kadin.isChecked())
                    displayToast(getString(R.string.survive));

                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && ilk_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && ilk_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && ikinci_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && ikinci_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && ucuncu_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && ucuncu_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && dorduncu_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esvar.isChecked() && dorduncu_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));

                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ilk_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ilk_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ikinci_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ikinci_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ucuncu_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ucuncu_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ikinci_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && ikinci_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && dorduncu_aralik.isChecked() && odenen_ikinci.isChecked() )
                    displayToast(getString(R.string.survive));
                if(one.isChecked() && erkek.isChecked() && cocukyok_esyok.isChecked() && dorduncu_aralik.isChecked() && odenen_ilk.isChecked() )
                    displayToast(getString(R.string.not_survive));

                if(one.isChecked() && erkek.isChecked() && cocukvar_esyok.isChecked())
                    displayToast(getString(R.string.not_survive));
                if(one.isChecked() && erkek.isChecked() && cocukvar_esvar.isChecked())
                    displayToast(getString(R.string.not_survive));
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
