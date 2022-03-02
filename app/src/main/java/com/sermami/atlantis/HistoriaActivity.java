package com.sermami.atlantis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sermami.atlantis.databinding.ActivityScrollingBinding;

public class HistoriaActivity extends AppCompatActivity {
    private enum Animales {
        ajolote, caballito, langosta, lobo, coral, anemona, pez, foca, tiburon, tortuga, ballena, narval;
    }

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
        Animales animal = Animales.valueOf(temaElegido);
        switch (animal) {
            case ajolote:
                tv.setText(getString(R.string.historia_ajolote));
                toolBarLayout.setTitle(getString(R.string.ajolote));
                toolBarLayout.setBackgroundResource(R.drawable.ajolote_historia);
                break;
            case caballito:
                tv.setText(getString(R.string.historia_caballito));
                toolBarLayout.setTitle(getString(R.string.caballito_de_mar));
                toolBarLayout.setBackgroundResource(R.drawable.caballito_historia);
                break;
            case langosta:
                tv.setText(getString(R.string.historia_langosta));
                toolBarLayout.setTitle(getString(R.string.langosta));
                toolBarLayout.setBackgroundResource(R.drawable.langosta_historia);
                break;
            case lobo:
                tv.setText(getString(R.string.historia_lobo));
                toolBarLayout.setTitle(getString(R.string.lobo_marino));
                toolBarLayout.setBackgroundResource(R.drawable.lobomarino_historia);
                break;
            case coral:
                tv.setText(getString(R.string.historia_coral));
                toolBarLayout.setTitle(getString(R.string.coral));
                toolBarLayout.setBackgroundResource(R.drawable.coral_historia);
                break;
            case anemona:
                tv.setText(getString(R.string.historia_anemona));
                toolBarLayout.setTitle(getString(R.string.anemona_de_mar));
                toolBarLayout.setBackgroundResource(R.drawable.anemona_historia);
                break;
            case pez:
                tv.setText(getString(R.string.historia_pez));
                toolBarLayout.setTitle(getString(R.string.pez_globo));
                toolBarLayout.setBackgroundResource(R.drawable.pezglobo_historia);
                break;
            case foca:
                toolBarLayout.setTitle(getString(R.string.foca));
                tv.setText(getString(R.string.historia_foca));
                toolBarLayout.setBackgroundResource(R.drawable.foca_historia);
                break;
            case tiburon:
                tv.setText(getString(R.string.historia_tiburon));
                toolBarLayout.setTitle(getString(R.string.tiburon_anguila));
                toolBarLayout.setBackgroundResource(R.drawable.tiburon_historia);
                break;
            case tortuga:
                tv.setText(getString(R.string.historia_tortuga));
                toolBarLayout.setTitle(getString(R.string.tortuga_marina));
                toolBarLayout.setBackgroundResource(R.drawable.tortuga_historia);
                break;
            case ballena:
                tv.setText(getString(R.string.historia_ballena));
                toolBarLayout.setTitle(getString(R.string.ballena_azul));
                toolBarLayout.setBackgroundResource(R.drawable.ballena_historia);
                break;
            case narval:
                tv.setText(getString(R.string.historia_narval));
                toolBarLayout.setTitle(getString(R.string.narval));
                toolBarLayout.setBackgroundResource(R.drawable.narval_historia);
                break;
        }
        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HistoriaActivity.this, QuizActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
                finish();
            }
        });
    }
}