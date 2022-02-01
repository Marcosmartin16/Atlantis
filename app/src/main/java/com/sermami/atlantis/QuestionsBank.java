package com.sermami.atlantis;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> animal1Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList pregunta1 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta2 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta3 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta4 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta5 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta6 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");

        questionsLists.add(pregunta1);
        questionsLists.add(pregunta2);
        questionsLists.add(pregunta3);
        questionsLists.add(pregunta4);
        questionsLists.add(pregunta5);
        questionsLists.add(pregunta6);

        return questionsLists;


    }

    private static List<QuestionsList> animal2Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList pregunta1 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta2 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta3 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta4 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta5 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta6 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");

        questionsLists.add(pregunta1);
        questionsLists.add(pregunta2);
        questionsLists.add(pregunta3);
        questionsLists.add(pregunta4);
        questionsLists.add(pregunta5);
        questionsLists.add(pregunta6);

        return questionsLists;


    }

    private static List<QuestionsList> animal3Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList pregunta1 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta2 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta3 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta4 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta5 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final QuestionsList pregunta6 = new QuestionsList("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");

        questionsLists.add(pregunta1);
        questionsLists.add(pregunta2);
        questionsLists.add(pregunta3);
        questionsLists.add(pregunta4);
        questionsLists.add(pregunta5);
        questionsLists.add(pregunta6);

        return questionsLists;


    }

   public static List<QuestionsList> getQuestions(String selectedAnimal){
        switch (selectedAnimal){
            case "ajolote":
                return animal1Questions();
            case "medusa":
                return animal2Questions();
            default:
                return animal3Questions();
        }
    }

}
