package com.sermami.atlantis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rlAjolote;
    RelativeLayout rlLangosta;
    RelativeLayout rlLoboMarino;
    RelativeLayout rlNarval;
    RelativeLayout rlCoral;
    RelativeLayout rlAnemona;
    RelativeLayout rlCaballito;
    RelativeLayout rlPezGlobo;
    RelativeLayout rlFoca;
    RelativeLayout rlTiburon;
    RelativeLayout rlTortuga;
    RelativeLayout rlBallena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        rlAjolote = (RelativeLayout) findViewById(R.id.rlAjolote);
        rlLangosta = (RelativeLayout) findViewById(R.id.rlLangosta);
        rlLoboMarino = (RelativeLayout) findViewById(R.id.rlLoboMarino);
        rlNarval = (RelativeLayout) findViewById(R.id.rlNarval);
        rlCoral = (RelativeLayout) findViewById(R.id.rlCoral);
        rlAnemona = (RelativeLayout) findViewById(R.id.rlAnemona);
        rlCaballito = (RelativeLayout) findViewById(R.id.rlCaballito);
        rlPezGlobo = (RelativeLayout) findViewById(R.id.rlPezGlobo);
        rlFoca = (RelativeLayout) findViewById(R.id.rlFoca);
        rlTiburon = (RelativeLayout) findViewById(R.id.rlTiburon);
        rlTortuga = (RelativeLayout) findViewById(R.id.rlTortuga);
        rlBallena = (RelativeLayout) findViewById(R.id.rlBallena);

        rlAjolote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlLangosta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlLoboMarino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlCoral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlAnemona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlCaballito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlPezGlobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlFoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlTiburon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlTortuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlBallena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });

        rlNarval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                startActivity(intent);
            }
        });
    }

}