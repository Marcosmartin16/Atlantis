package com.sermami.atlantis;

import static com.sermami.atlantis.R.string.*;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView preguntas;
    private TextView pregunta;

    private AppCompatButton respuesta1, respuesta2, respuesta3, respuesta4;

    Animation boton_up, boton_down;

    private AppCompatButton siguiente;

    private Timer tiempoPreguntas;

    private ImageView volver;

    private int tiempoEnMins = 1;
    private int segundos = 0;

    private List<ListaPreguntas> listaPreguntas;

    private int posActualPregunta = 0;

    private String respuestaUsuario = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final TextView reloj = findViewById(R.id.tvTiempo);
        final TextView temaElegido = findViewById(R.id.tvTitulo);

        volver = findViewById(R.id.back_btn);

        preguntas = findViewById(R.id.tvTitulo);
        pregunta = findViewById(R.id.pregunta);

        respuesta1 = findViewById(R.id.respuesta1);
        respuesta2 = findViewById(R.id.respuesta2);
        respuesta3 = findViewById(R.id.respuesta3);
        respuesta4 = findViewById(R.id.respuesta4);

        boton_up = AnimationUtils.loadAnimation(this, R.anim.boton_up);
        boton_down = AnimationUtils.loadAnimation(this, R.anim.boton_down);

        siguiente = findViewById(R.id.siguiente);


        final String getTemaElegido = getIntent().getStringExtra("temaElegido");

        temaElegido.setText(getTemaElegido);

        listaPreguntas = ArrayListPreguntas.getPreguntas(getTemaElegido);

        empezarCrono(reloj);

        preguntas.setText((posActualPregunta + 1) + "/" + listaPreguntas.size());
        pregunta.setText(listaPreguntas.get(0).getPregunta());
        respuesta1.setText(listaPreguntas.get(0).getRespuesta1());
        respuesta2.setText(listaPreguntas.get(0).getRespuesta2());
        respuesta3.setText(listaPreguntas.get(0).getRespuesta3());
        respuesta4.setText(listaPreguntas.get(0).getRespuesta4());


        respuesta1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    respuesta1.startAnimation(boton_up);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    respuesta1.startAnimation(boton_down);
                }
                if (respuestaUsuario.isEmpty()) {
                    respuestaUsuario = respuesta1.getText().toString();

                    respuesta1.setBackgroundResource(R.drawable.round_back_red_stroke);
                    respuesta1.setTextColor(Color.WHITE);

                    mostrarRespuesta();

                    listaPreguntas.get(posActualPregunta).setRespuestaUsuario(respuestaUsuario);
                }
                return true;
            }
        });

        respuesta2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    respuesta2.startAnimation(boton_up);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    respuesta2.startAnimation(boton_down);
                }
                if (respuestaUsuario.isEmpty()) {
                    respuestaUsuario = respuesta2.getText().toString();

                    respuesta2.setBackgroundResource(R.drawable.round_back_red_stroke);
                    respuesta2.setTextColor(Color.WHITE);

                    mostrarRespuesta();

                    listaPreguntas.get(posActualPregunta).setRespuestaUsuario(respuestaUsuario);
                }
                return true;
            }
        });

        respuesta3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    respuesta3.startAnimation(boton_up);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    respuesta3.startAnimation(boton_down);
                }
                if (respuestaUsuario.isEmpty()) {
                    respuestaUsuario = respuesta3.getText().toString();

                    respuesta3.setBackgroundResource(R.drawable.round_back_red_stroke);
                    respuesta3.setTextColor(Color.WHITE);

                    mostrarRespuesta();

                    listaPreguntas.get(posActualPregunta).setRespuestaUsuario(respuestaUsuario);
                }
                return true;
            }
        });

        respuesta4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    respuesta4.startAnimation(boton_up);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    respuesta4.startAnimation(boton_down);
                }
                if (respuestaUsuario.isEmpty()) {
                    respuestaUsuario = respuesta4.getText().toString();

                    respuesta4.setBackgroundResource(R.drawable.round_back_red_stroke);
                    respuesta4.setTextColor(Color.WHITE);

                    mostrarRespuesta();

                    listaPreguntas.get(posActualPregunta).setRespuestaUsuario(respuestaUsuario);
                }
                return true;
            }
        });

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestaUsuario.isEmpty()) {
                    Toast.makeText(QuizActivity.this, getString(elige_respuesta), Toast.LENGTH_SHORT).show();
                } else {
                    mostrarSiguientePregunta();
                }
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempoPreguntas.purge();
                tiempoPreguntas.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });


    }

    private void mostrarSiguientePregunta() {

        posActualPregunta++;

        if ((posActualPregunta + 1) == listaPreguntas.size()) {
            siguiente.setText(R.string.quiz_terminado);
        }

        if (posActualPregunta < listaPreguntas.size()) {

            respuestaUsuario = "";

            respuesta1.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta1.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta2.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta2.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta3.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta3.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta4.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta4.setTextColor(Color.parseColor("#1F6BB8"));

            preguntas.setText((posActualPregunta + 1) + "/" + listaPreguntas.size());
            pregunta.setText(listaPreguntas.get(posActualPregunta).getPregunta());
            respuesta1.setText(listaPreguntas.get(posActualPregunta).getRespuesta1());
            respuesta2.setText(listaPreguntas.get(posActualPregunta).getRespuesta2());
            respuesta3.setText(listaPreguntas.get(posActualPregunta).getRespuesta3());
            respuesta4.setText(listaPreguntas.get(posActualPregunta).getRespuesta4());
        } else {

            Intent intent = new Intent(QuizActivity.this, ResultadosQuiz.class);
            intent.putExtra("correctas", getRespuestasCorrectas());
            intent.putExtra("incorrectas", getRespuestasIncorrectas());
            startActivity(intent);

            finish();
        }

    }

    private void empezarCrono(TextView tvTiempo) {

        tiempoPreguntas = new Timer();

        tiempoPreguntas.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (segundos == 0) {
                    tiempoEnMins--;
                    segundos = 59;
                } else if (segundos == 0 && tiempoEnMins == 0) {

                    tiempoPreguntas.purge();
                    tiempoPreguntas.cancel();

                    Toast.makeText(QuizActivity.this, tiempo, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, ResultadosQuiz.class);
                    intent.putExtra("correctas", getRespuestasCorrectas());
                    intent.putExtra("incorrectas", getRespuestasIncorrectas());
                    startActivity(intent);

                    finish();
                } else {
                    segundos--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String minutosFinales = String.valueOf(tiempoEnMins);
                        String segundosFinales = String.valueOf(segundos);

                        if (minutosFinales.length() == 1) {
                            minutosFinales = "0" + minutosFinales;
                        }

                        if (segundosFinales.length() == 1) {
                            segundosFinales = "0" + segundosFinales;
                        }

                        tvTiempo.setText(minutosFinales + ":" + segundosFinales);
                    }
                });
            }
        }, 1000, 1000);
    }

    private int getRespuestasCorrectas() {

        int respuestasCorrectas = 0;

        for (int i = 0; i < listaPreguntas.size(); i++) {

            final String getRespuestaUsuario = listaPreguntas.get(i).getRespuestaUsuario();
            final String getRespuesta = listaPreguntas.get(i).getRespuesta();

            if (getRespuestaUsuario.equals(getRespuesta)) {
                respuestasCorrectas++;
            }
        }
        return respuestasCorrectas;
    }

    private int getRespuestasIncorrectas() {

        int respuestasIncorrectas = 0;

        for (int i = 0; i < listaPreguntas.size(); i++) {

            final String getRespuestaUsuario = listaPreguntas.get(i).getRespuestaUsuario();
            final String getRespuesta = listaPreguntas.get(i).getRespuesta();

            if (!getRespuestaUsuario.equals(getRespuesta)) {
                respuestasIncorrectas++;
            }


        }
        return respuestasIncorrectas;
    }


    private void mostrarRespuesta() {

        final String getRespuesta = listaPreguntas.get(posActualPregunta).getRespuesta();

        if (respuesta1.getText().toString().equals(getRespuesta)) {
            respuesta1.setBackgroundResource(R.drawable.round_back_green_stroke2);
            respuesta1.setTextColor(Color.WHITE);
        } else if (respuesta2.getText().toString().equals(getRespuesta)) {
            respuesta2.setBackgroundResource(R.drawable.round_back_green_stroke2);
            respuesta2.setTextColor(Color.WHITE);
        } else if (respuesta3.getText().toString().equals(getRespuesta)) {
            respuesta3.setBackgroundResource(R.drawable.round_back_green_stroke2);
            respuesta3.setTextColor(Color.WHITE);
        } else if (respuesta4.getText().toString().equals(getRespuesta)) {
            respuesta4.setBackgroundResource(R.drawable.round_back_green_stroke2);
            respuesta4.setTextColor(Color.WHITE);
        }

    }
}
