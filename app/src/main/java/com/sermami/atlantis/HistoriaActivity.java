package com.sermami.atlantis;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.sermami.atlantis.databinding.ActivityScrollingBinding;

public class HistoriaActivity extends AppCompatActivity {

    private ActivityScrollingBinding binding;
    String temaElegido;
    MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ma = new MainActivity();

        binding = ActivityScrollingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setNavigationBarColor(getResources().getColor(R.color.azul_oscuro));

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.collapsingToolbar;
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temaElegido = ma.getTemaElegido();
                temaElegido = getIntent().getStringExtra("temaElegido");
                Intent intent = new Intent(HistoriaActivity.this, QuizActivity.class);
                intent.putExtra("temaElegido", temaElegido);
                startActivity(intent);
            }
        });
    }
}