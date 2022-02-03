package com.sermami.atlantis;

public class QuestionsList {

    private String pregunta, respuest1, respuesta2, respuesta3, respuesta4, respuesta;
    private String userSelectedAnswer;

    public QuestionsList(String pregunta, String respuest1, String respuesta2, String respuesta3, String respuesta4, String respuesta, String userSelectedAnswer) {
        this.pregunta = pregunta;
        this.respuest1 = respuest1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuesta = respuesta;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuest1() {
        return respuest1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}
