package com.sermami.atlantis;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView preguntas;
    private TextView pregunta;

    private AppCompatButton respuesta1, respuesta2, respuesta3, respuesta4;

    private AppCompatButton siguiente;

    private Timer quizTimer;

    private int totalTimeInMins=1;
    private int seconds=0;

    private String strings[] = new String[0];

    private int currentQuestionPosition = 0;

    private  String selectedOptionByUser="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);

        final TextView reloj = findViewById(R.id.tvTiempo);


        preguntas = findViewById(R.id.tvTitle);
        pregunta = findViewById(R.id.pregunta);

        respuesta1 = findViewById(R.id.respuesta1);
        respuesta2 = findViewById(R.id.respuesta2);
        respuesta3 = findViewById(R.id.respuesta3);
        respuesta4 = findViewById(R.id.respuesta4);

        siguiente = findViewById(R.id.siguiente);

        //Aquí llamaríamos al método get de la clase que contenga las preguntas

        empezarTimer(reloj);

        preguntas.setText((currentQuestionPosition+1)+"/"+strings.length);
        //pregunta.setText(Aquí iría el array con las preguntas);
        //respuesta1.setText(Aquí iría el array con la posicion de las respuestas);
        //respuesta2.setText(Aquí iría el array con la posicion de las respuestas);
        //respuesta3.setText(Aquí iría el array con la posicion de las respuestas);
        //respuesta4.setText(Aquí iría el array con la posicion de las respuestas);

        respuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = respuesta1.getText().toString();

                    //respuesta1.setBackgroundResource(Llamamos al layout que indica que la respuesta es incorrecta);
                    respuesta1.setTextColor(Color.WHITE);

                    revealAnswer();

                    //questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        respuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = respuesta2.getText().toString();

                    //respuesta2.setBackgroundResource(Llamamos al layout que indica que la respuesta es incorrecta);
                    respuesta2.setTextColor(Color.WHITE);

                    revealAnswer();

                    //questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        respuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = respuesta3.getText().toString();

                    //respuesta3.setBackgroundResource(Llamamos al layout que indica que la respuesta es incorrecta);
                    respuesta3.setTextColor(Color.WHITE);

                    revealAnswer();

                    //questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        respuesta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = respuesta4.getText().toString();

                    //respuesta4.setBackgroundResource(Llamamos al layout que indica que la respuesta es incorrecta);
                    respuesta4.setTextColor(Color.WHITE);

                    revealAnswer();

                    //questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this,"Por favor, elige una respuesta",Toast.LENGTH_SHORT).show();
                }else{
                    changeNextQuestion();
                }
            }
        });
    }

    private void changeNextQuestion(){
        currentQuestionPosition++;

        if((currentQuestionPosition+1)== strings.length){
            siguiente.setText("Submit Quiz");
        }

        if(currentQuestionPosition< strings.length){

            selectedOptionByUser = "";

            respuesta1.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta1.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta2.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta2.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta3.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta3.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta4.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta4.setTextColor(Color.parseColor("#1F6BB8"));

            preguntas.setText((currentQuestionPosition+1)+"/"+strings.length);
            //pregunta.setText(Aquí iría el array con las preguntas);
            //respuesta1.setText(Aquí iría el array con la currentQuestionPosition de las respuestas);
            //respuesta2.setText(Aquí iría el array con la currentQuestionPosition de las respuestas);
            //respuesta3.setText(Aquí iría el array con la currentQuestionPosition de las respuestas);
            //respuesta4.setText(Aquí iría el array con la currentQuestionPosition de las respuestas);
        }
        else{

            Intent intent = new Intent(QuizActivity.this, QuizResults.class);
            intent.putExtra("correct",getCorrectAnswers());
            intent.putExtra("incorrect",getIncorrectAnswers());
            startActivity(intent);

            finish();
        }

    }

    private void empezarTimer(TextView tvTiempo){

        quizTimer = new Timer();

        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(seconds==0){
                    totalTimeInMins--;
                    seconds=59;
                }else if(seconds == 0 && totalTimeInMins ==0){
                    Toast.makeText(QuizActivity.this, "¡Se acabó el tiempo!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                    intent.putExtra("correctas", getCorrectAnswers());
                    intent.putExtra("incorrectas", getIncorrectAnswers());
                    startActivity(intent);

                    finish();
                }
                else{
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finalMinutes = String.valueOf(totalTimeInMins);
                        String finalSeconds = String.valueOf(seconds);

                        if(finalMinutes.length() ==1){
                            finalMinutes="0"+finalMinutes;
                        }

                        if(finalSeconds.length() == 1){
                            finalSeconds = "0"+finalSeconds;
                        }

                        tvTiempo.setText(finalMinutes+":"+finalSeconds);
                    }
                });
            }
        },1000, 1000);
    }

    private int getCorrectAnswers(){

        int correctAnswers = 0;

        for (int i = 0; i<strings.length;i++) {



        }
        return correctAnswers;
    }

    private int getIncorrectAnswers(){

        int correctAnswers = 0;

        for (int i = 0; i<strings.length;i++) {



        }
        return correctAnswers;
    }

    @Override
    public void onBackPressed(){
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    private void revealAnswer(){

    //final String getAnswer = Cogemos la posicion del array con la respuesta correcta
        /*if(respuesta1.getText().toString().equals(getAnswer)){
            respuesta1.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta1.setTextColor(Color.WHITE);
        }else if(respuesta2.getText().toString().equals(getAnswer)){
            respuesta2.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta2.setTextColor(Color.WHITE);
        }else if(respuesta3.getText().toString().equals(getAnswer)){
            respuesta3.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta3.setTextColor(Color.WHITE);
        }else if(respuesta4.getText().toString().equals(getAnswer)){
            respuesta4.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta4.setTextColor(Color.WHITE);
        }
        */
    }
}
