package com.example.wilder.monstermachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnSealion = (ImageButton) findViewById(R.id.imageSealion);
        ImageButton btnChocoBunny = (ImageButton) findViewById(R.id.imageChocoBunny);
        ImageButton btnPandaClaus = (ImageButton) findViewById(R.id.imagePandaClaus);
        ImageButton btnMetaselash = (ImageButton) findViewById(R.id.imageMetaselash);
        ImageButton btnMechamancer = (ImageButton) findViewById(R.id.imageMechamancer);
        ImageButton btnKomocat = (ImageButton) findViewById(R.id.imageKomocat);
        ImageButton btnFenix = (ImageButton) findViewById(R.id.imageFenix);
        ImageButton btnThunderEagle = (ImageButton) findViewById(R.id.imageThunderEagle);
        ImageButton btnPegasus = (ImageButton) findViewById(R.id.imagePegasus);
        ImageButton btnObsidia = (ImageButton) findViewById(R.id.imageObsidia);

        btnSealion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                startActivity(intent);
            }
        });

    }

}
