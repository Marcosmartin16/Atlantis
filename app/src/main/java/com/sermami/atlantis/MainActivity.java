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

    private String temaElegido = "";

    public MainActivity(){
        this.temaElegido = temaElegido;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
                temaElegido = "ajolote";
                setTemaElegido("ajolote");
                Intent intent = new Intent(getApplicationContext(), HistoriaActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
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
            }
        });
    }

    public String getTemaElegido() {
        return temaElegido;
    }

    public void setTemaElegido(String temaElegido) {
        this.temaElegido = temaElegido;
    }

}