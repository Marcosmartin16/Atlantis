package com.sermami.atlantis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadosQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_resultados);

        TextView respuestasCorrectas = findViewById(R.id.respuestasCorrectas);
        TextView respuestasIncorrectas = findViewById(R.id.respuestasIncorrectas);

        int getRespuestasCorrectas = getIntent().getIntExtra("correctas",0);
        int getRespuestasIncorrectas = getIntent().getIntExtra("incorrectas",0);

        respuestasCorrectas.setText(String.valueOf(getRespuestasCorrectas));
        respuestasIncorrectas.setText(String.valueOf(getRespuestasIncorrectas));

    }
}