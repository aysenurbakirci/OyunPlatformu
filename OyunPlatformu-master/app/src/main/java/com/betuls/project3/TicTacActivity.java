package com.betuls.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TicTacActivity extends AppCompatActivity {

    boolean gameActive = true;
    int activePlayer = 0;
    int[] gameState = {2, 2 , 2, 2, 2, 2, 2, 2, 2};
    int[][] winPositions = {{0,1,2}, {3,4,5}, {6,7,8},
            {0,3,6}, {1,4,7}, {2,5,8},
            {0,4,8}, {2,4,6}};

    public void playerTap(View view){
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
        if(!gameActive){
            gameReset(view);
        }
        if(gameState[tappedImage] == 2) {
            gameState[tappedImage] = activePlayer;
            img.setTranslationY(-1000f);
            if (activePlayer == 0) {
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
                TextView status = findViewById(R.id.status);
                status.setText("O'nun Sırası - Oynamak İçin Tıkla");
            } else {
                img.setImageResource(R.drawable.o);
                activePlayer = 0;
                TextView status = findViewById(R.id.status);
                status.setText("X'in Sırası - Oynamak İçin Tıkla");
            }
            img.animate().translationYBy(1000f).setDuration(300);
        }

        for(int[] winPosition: winPositions){
            if(gameState[winPosition[0]] == gameState[winPosition[1]] &&
                    gameState[winPosition[1]] == gameState[winPosition[2]] &&
                    gameState[winPosition[0]]!=2){

                String winnerStr;
                gameActive = false;
                if(gameState[winPosition[0]] == 0){
                    winnerStr = "X Kazandı!";
                }
                else{
                    winnerStr = "O Kazandı!";
                }
                TextView status = findViewById(R.id.status);
                status.setText(winnerStr);
            }
        }
    }

    public void gameReset(View view) {
        gameActive = true;
        activePlayer = 0;
        for(int i=0; i<gameState.length; i++){
            gameState[i] = 2;
        }
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

        TextView status = findViewById(R.id.status);
        status.setText("X'in Sırası - Oynamak İçin Tıkla");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_tekrar_tic = findViewById(R.id.btn_tekrar_tic);

        btn_tekrar_tic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameActive = true;
                activePlayer = 0;
                for(int i=0; i<gameState.length; i++){
                    gameState[i] = 2;
                }
                ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

                TextView status = findViewById(R.id.status);
                status.setText("X'in Sırası - Oynamak İçin Tıkla");
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