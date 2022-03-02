package com.sermami.atlantis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    CardView rlAjolote;
    CardView rlLangosta;
    CardView rlLoboMarino;
    CardView rlNarval;
    CardView rlCoral;
    CardView rlAnemona;
    CardView rlCaballito;
    CardView rlPezGlobo;
    CardView rlFoca;
    CardView rlTiburon;
    CardView rlTortuga;
    CardView rlBallena;

    private String temaElegido = "";


    public MainActivity() {
        this.temaElegido = temaElegido;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rlAjolote = (CardView) findViewById(R.id.cvAjolote);
        rlLangosta = (CardView) findViewById(R.id.cvLangosta);
        rlLoboMarino = (CardView) findViewById(R.id.cvLoboMarino);
        rlNarval = (CardView) findViewById(R.id.cvNarval);
        rlCoral = (CardView) findViewById(R.id.cvCoral);
        rlAnemona = (CardView) findViewById(R.id.cvAnemona);
        rlCaballito = (CardView) findViewById(R.id.cvCaballito);
        rlPezGlobo = (CardView) findViewById(R.id.cvPezGlobo);
        rlFoca = (CardView) findViewById(R.id.cvFoca);
        rlTiburon = (CardView) findViewById(R.id.cvTiburon);
        rlTortuga = (CardView) findViewById(R.id.cvTortuga);
        rlBallena = (CardView) findViewById(R.id.cvBallena);


        rlAjolote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "ajolote";
                setTemaElegido("ajolote");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlLangosta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "langosta";
                setTemaElegido("langosta");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlLoboMarino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTemaElegido("lobo");
                temaElegido = "lobo";
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlCoral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "coral";
                setTemaElegido("coral");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlAnemona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "anemona";
                setTemaElegido("anemona");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlCaballito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTemaElegido("caballito");
                temaElegido = "caballito";
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlPezGlobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "pez";
                setTemaElegido("pez");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlFoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "foca";
                setTemaElegido("foca");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlTiburon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "tiburon";
                setTemaElegido("tiburon");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlTortuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "tortuga";
                setTemaElegido("tortuga");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlBallena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "ballena";
                setTemaElegido("ballena");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });

        rlNarval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temaElegido = "narval";
                setTemaElegido("narval");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });


    }


    public void setTemaElegido(String temaElegido) {
        this.temaElegido = temaElegido;
    }

}