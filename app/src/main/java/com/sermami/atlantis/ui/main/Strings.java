package com.sermami.atlantis.ui.main;

public class Strings {

    public String[] preguntas = {
            "Quien es mejor programador?",
            "Quien es mas guapo?",
            "En que año fue uno mas uno"
    };

    public String[][] respuestas = {
            {"Miguel","Marquitos","Tomeo","Wilson"},
            {"Mixi","Marcos el programador cosmic","MNDG Tomixy", "Wilsound"},
            {"No lo se", "Te quito la matricula", "Ricardito Edu Nsué","La respuesta es el fantastico Ralph"}
    };

    public String[] respuesta_correcta = {
            "Miguel",
            "Mixi",
            "Ricardito Edu Nsué"
    };

    public String getPregunta(int i){
        return preguntas[i];
    }

    public String getRespuesta1(int i){
        return respuestas[i][0];
    }

    public String getRespuesta2(int i){
        return respuestas[i][1];
    }

    public String getRespuesta3(int i){
        return respuestas[i][2];
    }

    public String getRespuesta4(int i){
        return respuestas[i][3];
    }

    public String getRespuestaCorrecta(int i){
        return respuesta_correcta[i];
    }
}
