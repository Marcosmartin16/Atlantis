package com.sermami.atlantis;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPreguntas {

    private static List<ListaPreguntas> ajolotePreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        final ListaPreguntas pregunta1 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta2 = new ListaPreguntas("En qué año fue 2 + 2", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta3 = new ListaPreguntas("En qué año fue 3 + 3", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta4 = new ListaPreguntas("En qué año fue 4 + 4", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta5 = new ListaPreguntas("En qué año fue 5 + 5", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta6 = new ListaPreguntas("En qué año fue 6 + 6", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");

        listaPreguntas.add(pregunta1);
        listaPreguntas.add(pregunta2);
        listaPreguntas.add(pregunta3);
        listaPreguntas.add(pregunta4);
        listaPreguntas.add(pregunta5);
        listaPreguntas.add(pregunta6);

        return listaPreguntas;


    }

    private static List<ListaPreguntas> animal2Preguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        final ListaPreguntas pregunta1 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta2 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta3 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta4 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta5 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta6 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");

        listaPreguntas.add(pregunta1);
        listaPreguntas.add(pregunta2);
        listaPreguntas.add(pregunta3);
        listaPreguntas.add(pregunta4);
        listaPreguntas.add(pregunta5);
        listaPreguntas.add(pregunta6);

        return listaPreguntas;


    }

    private static List<ListaPreguntas> animal3Preguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        final ListaPreguntas pregunta1 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta2 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta3 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta4 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta5 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");
        final ListaPreguntas pregunta6 = new ListaPreguntas("En qué año fue 1 + 1", "Marcos", "Enrique Windows 11", "El Barrio", "Blvck mvmbv", "Blavck mvmbv","");

        listaPreguntas.add(pregunta1);
        listaPreguntas.add(pregunta2);
        listaPreguntas.add(pregunta3);
        listaPreguntas.add(pregunta4);
        listaPreguntas.add(pregunta5);
        listaPreguntas.add(pregunta6);

        return listaPreguntas;


    }

   public static List<ListaPreguntas> getPreguntas(String temaElegido){
        switch (temaElegido){
            case "ajolote":
                return ajolotePreguntas();
            case "medusa":
                return animal2Preguntas();
            default:
                return animal3Preguntas();
        }
    }

}
