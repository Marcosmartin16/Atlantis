package com.sermami.atlantis;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArrayListPreguntas {


    //Preguntas Sergio
    private static List<ListaPreguntas> ajolotePreguntas() {


        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stop eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;


    }

    private static List<ListaPreguntas> caballitoPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("How long do the seahorses live?", "Between 1 and 3 years", "Between 10 and 15 years", "Between 7 and 9 years", "Between 4 and 6 years", "Between 4 and 6 years", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("They are 3 times slower than what animal?", "Turtle", "Manatee", "Snail", "Starfish", "Snail", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Seahorses do not live between which of these options?", "Corals", "Lakes", "Macroalgae", "Seagrasses", "Lakes", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("What is the best seahorses defense?", "Teeths", "Camouflage", "Tail", "Head", "Camouflage", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("How many days does the male horse spend pregnant?", "45 days", "30 days", "50 days", "100 days", "45 days", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("How big is the smallest species of seahorse?", "30 centímeters", "15 centímeters", "15 milímeters", "30 milímeters", "15 milimeters", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Cuánto suelen vivir los caballitos de mar?", "Entre 10 y 15 años", "Entre 7 y 9 años", "Entre 1 y 3 años", "Entre 4 y 6 años", "Entre 4 y 6 años", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Son 3 veces más lentos que qué animal?", "Tortuga", "Manatí", "Caracol", "Estrella de mar", "Caracol", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Corales", "Lagos", "Macroalgas", "Fanerógramas marinas", "Lagos", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿Cuál es la mejor defensa de los caballitos?", "Dientes", "Camuflaje", "Cola", "Cabeza", "Camuflaje", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿Cuántos días pasa el caballito macho embarazado?", "45 días", "30 días", "50 días", "100 días", "45 días", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Cuánto mide la especie más pequeña de caballito de mar?", "30 centímetros", "15 centímetros", "15 milímetros", "30 milímetros", "15 milímetros", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    private static List<ListaPreguntas> langostaPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();
        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("How many legs do lobsters have?", "6", "8", "4", "10", "10", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Where do they live?", "Between the stones", "On land", "In the rivers", "In rocky bottoms", "In rocky bottoms", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Do lobsters shed their skin?", "Several times in his life", "Once in his life", "It never does it", "Once a day", "Several times in his life", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("What does he use to drives away his enemies?", "Tweezers", "Antennas", "Mouth", "They don't use anything", "Antennas", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("How much did the world's largest lobster weigh?", "30,14 kg", "20,14 kg", "10,14 kg", "40,14 kg", "20,14 kg", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("The rows they can form, what do they look like?", "Giant crab", "Shark", "Puffer fish", "Giant snake", "Giant snake", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Cuántas patas tienen las langostas?", "6", "8", "4", "10", "10", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Dónde viven?", "Entre las piedras", "Tierra", "Ríos", "Fondos rocosos", "Fondos rocosos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿La langosta muda su piel?", "Varias veces en su vida", "1 vez en la vida", "Nunca lo hace", "1 vez al día", "Varias veces en su vida", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿Qué utiliza para ahuyentar a sus enemigos?", "Pinzas", "Antenas", "Boca", "No utilizan nada", "Antenas", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿Cuánto pesaba la langosta más grande del mundo?", "30,14 kg", "20,14 kg", "10,14 kg", "40,14 kg", "20,14 kg", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("Las filas que pueden formar, ¿qué apariencia tienen?", "Cangrejo gigante", "Tiburón", "Pez globo", "Serpiente gigante", "Serpiente gigante", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    private static List<ListaPreguntas> loboPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("How big can male wolves be in total?", "3,50 meters", "2,50 meters", "1,50 meters", "4,50 meters", "3,50 meters", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("How big are puppies at birth?", "30 cm", "Just over 80 cm", "Just over 40 cm", "1,50 meters", "30 cm", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("What is your food exclusively composed of?", "Fishes", "Corals", "Crabs", "Starfishes", "Fishes", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("In spring, how long are they without going to the water?", "20 days", "2 months", "10 days", "5 weeks", "5 weeks", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Where do they spend most of their time?", "On land", "At mar", "In the mangroves", "In the rivers", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("Why do males fight?", "To see who has more food", "To see who is older", "To see who get more females", "To see who has more hair", "To see who get more females", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Cuánto pueden llegar a medir los lobos machos en total?", "3,50 metros", "2,50 metros", "1,50 metros", "4,50 metros", "3,50 metros", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Cuánto miden los cachorros al nacer?", "30 cm", "Poco más de 80 cm", "Poco más de 40 cm", "1,50 metros", "30 cm", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿De qué se compone exclusivamente su alimento?", "Peces", "Corales", "Cangrejos", "Estrellas de mar", "Peces", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("En primavera, ¿cuánto tiempo están sin ir al agua?", "20 días", "2 meses", "10 días", "5 semanas", "5 semanas", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿Dónde pasan casi todo el tiempo?", "En la tierra", "En el mar", "En los manglares", "En los ríos", "En el mar", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Por qué se pelean los machos?", "Por ver quién tiene más comida", "Por ver quién tiene más años", "Por ver quién consigue más hembras", "Por ver quién tiene más pelo", "Por ver quién tiene consigue más hembras", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    //Preguntas Marcos

    private static List<ListaPreguntas> coralPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    private static List<ListaPreguntas> anemonaPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    private static List<ListaPreguntas> pezPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    private static List<ListaPreguntas> focaPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }


    //Preguntas Miguel
    private static List<ListaPreguntas> tiburonPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();
        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    private static List<ListaPreguntas> tortugaPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    private static List<ListaPreguntas> ballenaPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }


    private static List<ListaPreguntas> narvalPreguntas() {

        final List<ListaPreguntas> listaPreguntas = new ArrayList<>();

        if (Locale.getDefault().getISO3Language().equals("eng")) {
            final ListaPreguntas pregunta1 = new ListaPreguntas("From which place is the axolotl?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Who is the main predator of the axolotl?", "Tilapia", "Carps", "Humans", "Beavers", "Humans", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Why has the axolotl been prized since the past?", "It gives good luck", "Good looking", "Nutritive properties and flavor", "It gets along well with other pets", "Nutritive properties and flavor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Of what animal retains the ancient characteristics?", "Frog", "Crab", "Toad", "Salamander", "Salamander", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the axolotl not feed on?", "Worms", "Mosquitoes", "Crustaceans", "Larvae", "Mosquitoes", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What must be done to prevent the axolotl extinction?", "Repopulate and not pollute their habitat", "Stop hunting them", "Stom eating them", "Search other habitats for it", "Repopulate and not pollute their habitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿De dónde es originario el ajolote?", "Lago de Xochimilco", "Lago de Yuriria", "Lagunas de Montebello", "Lago de Chapala", "Lago de Xochimilco", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Quién es el principal depredador del ajolote?", "Tilapias", "Carpas", "Humanos", "Castores", "Humanos", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Por qué ha sido apreciado el ajolote desde el pasado?", "Da buena suerte", "Bonita apariencia", "Propiedades nutritivas y sabor", "Se lleva bien con otras mascotas", "Propiedades nutritivas y sabor", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De qué animal conserva las características milenarias?", "Rana", "Cangrejo", "Sapo", "Salamandra", "Salamandra", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta el ajolote?", "Gusanos", "Mosquitos", "Crustáceos", "Larvas", "Mosquitos", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Qué hay que hacer para que no se extinga el ajolote?", "Repoblar y no contaminar su hábitat", "Dejar de cazarlos", "No comérselos", "Cambiarle de hábitat", "Repoblar y no contaminar su hábitat", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        }
        return listaPreguntas;
    }

    public static List<ListaPreguntas> getPreguntas(String temaElegido) {
        switch (temaElegido) {
            case "ajolote":
                return ajolotePreguntas();
            case "caballito":
                return caballitoPreguntas();
            case "tortuga":
                return tortugaPreguntas();
            case "ballena":
                return ballenaPreguntas();
            case "coral":
                return coralPreguntas();
            case "langosta":
                return langostaPreguntas();
            case "lobo":
                return loboPreguntas();
            case "pez":
                return pezPreguntas();
            case "narval":
                return narvalPreguntas();
            case "anemona":
                return anemonaPreguntas();
            case "tiburon":
                return tiburonPreguntas();
            case "foca":
                return focaPreguntas();
            default:
                return ajolotePreguntas();
        }
    }

}
