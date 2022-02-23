package com.sermami.atlantis;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sermami.atlantis.databinding.ActivityScrollingBinding;

public class HistoriaActivity extends AppCompatActivity {

    private ActivityScrollingBinding binding;
    String temaElegido;
    MainActivity ma;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ma = new MainActivity();

        binding = ActivityScrollingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.collapsingToolbar;
        toolBarLayout.setTitle(getTitle());

        toolBarLayout = findViewById(R.id.collapsing_toolbar);
        tv = (TextView) findViewById(R.id.tvHistoria);

        temaElegido = getIntent().getStringExtra("temaElegido");
/*        switch (temaElegido){
            case "ajolote":
                tv.setText(getString(R.string.historia_ajolote));
            case "caballito":
                tv.setText(getString(R.string.historia_caballito));
            case "langosta":
                tv.setText(getString(R.string.historia_langosta));
            case "lobo":
                tv.setText(getString(R.string.historia_lobo));
            case "coral":
                tv.setText(getString(R.string.historia_coral));
            case "anemona":
                tv.setText(getString(R.string.historia_anemona));
            case "pez":
                tv.setText(getString(R.string.historia_pez));
            case "foca":
                tv.setText(getString(R.string.historia_foca));
            case "tiburon":
                tv.setText(getString(R.string.historia_tiburon));
            case "tortuga":
                tv.setText(getString(R.string.historia_tortuga));
            case "ballena":
                tv.setText(getString(R.string.historia_ballena));
            case "narval":
                tv.setText(getString(R.string.historia_narval));
            default:
                tv.setText(getString(R.string.historia_narval));
        }

 */
        if(temaElegido.equals("tortuga")){
            tv.setText(getString(R.string.historia_tortuga));
            toolBarLayout.setTitle(getString(R.string.tortuga_marina));
            toolBarLayout.setBackgroundResource(R.drawable.tortuga_historia);
        }else if(temaElegido.equals("ajolote")){
            tv.setText(getString(R.string.historia_ajolote));
            toolBarLayout.setTitle(getString(R.string.ajolote));
            toolBarLayout.setBackgroundResource(R.drawable.ajolote_historia);
        }else if(temaElegido.equals("caballito")){
            tv.setText(getString(R.string.historia_caballito));
            toolBarLayout.setTitle(getString(R.string.caballito_de_mar));
            toolBarLayout.setBackgroundResource(R.drawable.caballito_historia);
        }else if(temaElegido.equals("langosta")){
            tv.setText(getString(R.string.historia_langosta));
            toolBarLayout.setTitle(getString(R.string.langosta));
            toolBarLayout.setBackgroundResource(R.drawable.langosta_historia);
        }else if(temaElegido.equals("coral")){
            tv.setText(getString(R.string.historia_coral));
            toolBarLayout.setTitle(getString(R.string.coral));
            toolBarLayout.setBackgroundResource(R.drawable.coral_historia);
        }else if(temaElegido.equals("lobo")){
            tv.setText(getString(R.string.historia_lobo));
            toolBarLayout.setTitle(getString(R.string.lobo_marino));
            toolBarLayout.setBackgroundResource(R.drawable.lobomarino_historia);
        }else if(temaElegido.equals("tiburon")){
            tv.setText(getString(R.string.historia_tiburon));
            toolBarLayout.setTitle(getString(R.string.tiburon_anguila));
            toolBarLayout.setBackgroundResource(R.drawable.tiburon_historia);
        }else if(temaElegido.equals("anemona")){
            tv.setText(getString(R.string.historia_anemona));
            toolBarLayout.setTitle(getString(R.string.anemona_de_mar));
            toolBarLayout.setBackgroundResource(R.drawable.anemona_historia);
        }else if(temaElegido.equals("narval")){
            tv.setText(getString(R.string.historia_narval));
            toolBarLayout.setTitle(getString(R.string.narval));
            toolBarLayout.setBackgroundResource(R.drawable.narval_historia);
        }else if(temaElegido.equals("ballena")){
            tv.setText(getString(R.string.historia_ballena));
            toolBarLayout.setTitle(getString(R.string.ballena_azul));
            toolBarLayout.setBackgroundResource(R.drawable.ballena_historia);
        }else if(temaElegido.equals("pez")){
            tv.setText(getString(R.string.historia_pez));
            toolBarLayout.setTitle(getString(R.string.pez_globo));
            toolBarLayout.setBackgroundResource(R.drawable.pezglobo_historia);
        }else if(temaElegido.equals("foca")){
            toolBarLayout.setTitle(getString(R.string.foca));
            tv.setText(getString(R.string.historia_foca));
            toolBarLayout.setBackgroundResource(R.drawable.foca_historia);
        }else{
            tv.setText(getString(R.string.historia_ajolote));
        }

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoriaActivity.this, QuizActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
            }
        });
    }
}