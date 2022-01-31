package com.sermami.atlantis;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView preguntas;
    private TextView pregunta;

    private AppCompatButton respuesta1, respuesta2, respuesta3, respuesta4;

    private AppCompatButton siguiente;

    private Button volver;

    private Timer quizTimer;

    private int totalTimeInMins=1;
    private int seconds=0;

    private List<QuestionsList> questionsLists;

    private int currentQuestionPosition = 0;

    private  String selectedOptionByUser="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);

        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");

        final TextView reloj = findViewById(R.id.tvTiempo);


        preguntas = findViewById(R.id.tvTitle);
        pregunta = findViewById(R.id.pregunta);

        respuesta1 = findViewById(R.id.respuesta1);
        respuesta2 = findViewById(R.id.respuesta2);
        respuesta3 = findViewById(R.id.respuesta3);
        respuesta4 = findViewById(R.id.respuesta4);

        siguiente = findViewById(R.id.siguiente);

        //Aquí llamaríamos al método get de la clase que contenga las preguntas

        questionsLists = QuestionsBank.getQuestions(getSelectedTopicName);

        empezarTimer(reloj);

        preguntas.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
        pregunta.setText(questionsLists.get(0).getPregunta());
        respuesta1.setText(questionsLists.get(0).getRespuest1());
        respuesta2.setText(questionsLists.get(0).getRespuesta2());
        respuesta3.setText(questionsLists.get(0).getRespuesta3());
        respuesta4.setText(questionsLists.get(0).getRespuesta4());


        respuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = respuesta1.getText().toString();

                    //respuesta1.setBackgroundResource(Llamamos al layout que indica que la respuesta es incorrecta);
                    respuesta1.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
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

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
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

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
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

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
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

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizTimer.purge();
                quizTimer.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    private void changeNextQuestion(){

        currentQuestionPosition++;

        if((currentQuestionPosition+1)== questionsLists.size()){
            siguiente.setText("Submit Quiz");
        }

        if(currentQuestionPosition< questionsLists.size()){

            selectedOptionByUser = "";

            respuesta1.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta1.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta2.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta2.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta3.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta3.setTextColor(Color.parseColor("#1F6BB8"));

            respuesta4.setBackgroundResource(R.drawable.round_back_white_stroke2);
            respuesta4.setTextColor(Color.parseColor("#1F6BB8"));

            preguntas.setText((currentQuestionPosition+1)+"/"+ questionsLists.size());
            pregunta.setText(questionsLists.get(currentQuestionPosition).getPregunta());
            respuesta1.setText(questionsLists.get(currentQuestionPosition).getRespuest1());
            respuesta2.setText(questionsLists.get(currentQuestionPosition).getRespuesta2());
            respuesta3.setText(questionsLists.get(currentQuestionPosition).getRespuesta3());
            respuesta4.setText(questionsLists.get(currentQuestionPosition).getRespuesta4());
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

        for (int i = 0; i< questionsLists.size(); i++) {

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getRespuesta();

            if(getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }
        }
        return correctAnswers;
    }

    private int getIncorrectAnswers(){

        int incorrectAnswers = 0;

        for (int i = 0; i< questionsLists.size(); i++) {

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getRespuesta();

            if(!getUserSelectedAnswer.equals(getAnswer)){
                incorrectAnswers++;
            }


        }
        return incorrectAnswers;
    }

    @Override
    public void onBackPressed(){
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    private void revealAnswer(){

    final String getAnswer = questionsLists.get(currentQuestionPosition).getRespuesta();

    if(respuesta1.getText().toString().equals(getAnswer)){
            //respuesta1.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta1.setTextColor(Color.WHITE);
        }else if(respuesta2.getText().toString().equals(getAnswer)){
            //respuesta2.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta2.setTextColor(Color.WHITE);
        }else if(respuesta3.getText().toString().equals(getAnswer)){
            //respuesta3.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta3.setTextColor(Color.WHITE);
        }else if(respuesta4.getText().toString().equals(getAnswer)){
            //respuesta4.setBackgroundDrawable(R.drawable.respuestacorrecta);
            respuesta4.setTextColor(Color.WHITE);
        }

    }
}