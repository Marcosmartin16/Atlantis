package com.sermami.atlantis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HistoriaActivity extends AppCompatActivity {

    private String selectedTopicName= "";
    Button btn_juego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        btn_juego = (Button) findViewById(R.id.btn_inijuego);

        btn_juego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "ajolote";
                Intent intent = new Intent(HistoriaActivity.this, QuizActivity.class);
                intent.putExtra("selectedTopic", selectedTopicName);
                startActivity(intent);
            }
        });

    }
}