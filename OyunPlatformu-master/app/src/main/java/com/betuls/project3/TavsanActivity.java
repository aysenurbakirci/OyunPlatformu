package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class TavsanActivity extends AppCompatActivity {

    Button btn_niyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tavsan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_niyet = (Button) findViewById(R.id.btn_niyet);

        Random rand = new Random();
        final int randomSayi = rand.nextInt(21);

        btn_niyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                final int randomSayi = rand.nextInt(21);
                falCek(randomSayi);
            }
        });
    }

    public void falCek(int sayi){
        String fal = "";
        String falMetni = "";
        switch (sayi){
            case 1:
                fal = "Aşkın etmiş onu şair,Her gün yazar bir şiir,Sensin ilham perisi,Tüm satırlar sana dair.";
                break;
            case 2:
                fal = "Fazla şey beklemez senden,İster hayatında çekidüzen,Evliliktir bunun sonu,Seversen onu gönülden.";
                break;
            case 3:
                fal = "Boynunda var bir kolye,İki resim bağlı zincire,Biri o diğeri sen,Açar bakar her saniye.";
                break;
            case 4:
                fal = "Atmışsın ona bir bakış,Gözlerine tutulmuş kalmış,Kendini bulmuş o anda,Aşkın ona pek yaramış.";
                break;
            case 5:
                fal = "Senden bekler hareket,Edemez konuşmaya cesaret,Sen bir adım atsan ona,O on adım gelecek.";
                break;
            case 6:
                fal = "Bir görünüp bir kayboluyor,Onu yakalamak zor mu zor,Göremeyince üzülüyorsun,Senin de yüreğine düşmüş kor.";
                break;
            case 7:
                fal = "Duy şu çarpan kalbin sesini,Sanki söyler senin ismini,O hep böyle çarpacak,Sürecek aşkı ebedi.";
                break;
            case 8:
                fal = "Her gün bakar aynaya,Güzel görünmek için sana,Beğendirecek kendini,Gelirseniz yan yana.";
                break;
            case 9:
                fal = "Bir ev döşemiş zevki süper,Bazen pop bazen caz dinler,Hayvanlara sevgisinden,Okumuş olmuş veteriner.";
                break;
            case 10:
                fal = "Onunla tez geçiyor saat,Konuşmaya kalmıyor fırsat,Sana söyleyecekleri var,Bu kez zamanı sen ayır.";
                break;
            case 11:
                fal = "Sevdiğin biraz duygusal,Aşkınız güzel bir masal,Nazik davran aman ona,Kalbi sanki kristal.";
                break;
            case 12:
                fal = "Aranızda var bir resmiyet,Ama değişecek bu vaziyet,Çok uzun sürmeyecek,Oluşacak samimiyet.";
                break;
            case 13:
                fal = "Suya muhtaçtır her yonca,Anlarsın yalnız kalınca,Tatsızlıklar atlatılır,Bir taraf alttan alınca.";
                break;
            case 14:
                fal = "En önemli vasfı sabır,Dur durak bilmeden çalışır,Bir ikinci lig kulübünde,Futbol oynuyor beş yıldır.";
                break;
            case 15:
                fal = "Seni senden çok sever,İste dünyayı ayağına serer,Seni güzel yaşatacak,Vermeyecek hiç keder.";
                break;
            case 16:
                fal = "Aşkta olmaz gurur,O sana sen ona mecbur,Hatasını affettiğinde,Bulacaksınız birlikte huzur.";
                break;
            case 17:
                fal = "Sabrın sonu selamet,Bu işte var keramet,Hemen pes etmezsen,Kuracaksınız muhabbet.";
                break;
            case 18:
                fal = "Siz tanışalı üç gün olmuş,Kalbine bir sıcaklık dolmuş,Tekrar görüşür müyüz diye,Zavallım sararıp solmuş.";
                break;
            case 19:
                fal = "Dinliyor kalbinin sesini,Kapatıp güzel gözlerini,Düşünüyor saatlerce,Sensin en büyük hayali.";
                break;
            case 20:
                fal = "Aşk başlıyor yeni yeni,O tanımak istiyor seni,Size neler getirecek,Bu güzel aşk serüveni.";
                break;
        }
        falMetni = fal.replaceAll(",", "\n");

        alertFal(falMetni);
    }

    public void alertFal(String fal){

        AlertDialog.Builder b = new AlertDialog.Builder(TavsanActivity.this);
        b.setTitle("Falınız:");
        b.setMessage(fal);
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