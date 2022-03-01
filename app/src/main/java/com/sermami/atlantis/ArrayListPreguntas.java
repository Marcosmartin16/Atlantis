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
            final ListaPreguntas pregunta5 = new ListaPreguntas("Where do they spend most of their time?", "On land", "At sea", "In the mangroves", "In the rivers", "At sea", "");
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
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Por qué se pelean los machos?", "Por ver quién tiene más comida", "Por ver quién tiene más años", "Por ver quién consigue más hembras", "Por ver quién tiene más pelo", "Por ver quién consigue más hembras", "");

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
            final ListaPreguntas pregunta1 = new ListaPreguntas("At what depth do corals grow?", "More than 60 meters", "Less than 60 meters", "More than 70 meters", "on the surface", "Less than 60 meters", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("What is a reef made of?", "Little animals", "Corals", "Sea stars", "All are correct", "All are correct", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("What color do they get when they suffer stress?", "Blue", "Red", "White","Multicolored", "White", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("What is the largest reef?", "The Australian Great Barrier Reef", "The Belize Barrier Reef", "Raja Ampat Reef","Palancar Reef", "The Australian Great Barrier Reef", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("How do photosynthetic corals get food?", "Of plankton", "Of small animals", "With the sunlight", "Remains in the background", "With the sunlight", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("Coral dangers?", "Climate change", "Ocean pollution", "Water acidification", "All are correct", "All are correct", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿En que profundidad crecen los corales?", "Mas de 60 metros", "Menos de 60 metros", "Mas de 70 metros", "En la superficie", "Menos de 60 metros", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿De que esta formado un arrecife?", "Pequeños animales", "Corales", "Estrellas de mar", "Todas son correctas", "Todas son correctas", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿De que color se ponen cuando sufen estres?", "Azul", "Rojo", "Blanco", "Multicolor", "Blanco", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿Cual es el arrecife de mayor tamaño?", "La gran barrera de coral Australiana", "La barrera de coral de Belice", "Arrecife de Raja Ampat", "Arrecife Palancar", "La gran barrera de coral Australiana", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿Como consiguen los corales fotosinteticos el alimento?", "Del plancton", "De pequeños animales", "Con la luz del sol", "Restos en el fondo", "Con la luz del sol", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Peligros de los corales?", "Cambio climatico", "Contaminacion de los oceanos", "Acidificacion del agua", "Todas son correctas", "Todas son correctas", "");

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
            final ListaPreguntas pregunta1 = new ListaPreguntas("Anemones are?", "Vertebrates", "Invertebrates","Mammals","None is correct", "Invertebrates", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("How long can their tentacles be?", "50 cm", "30 cm", "50 m", "20 cm", "50 cm", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("At what minimum depth are they found?", "2 m", "4 m", "5 m", "20 m", "5m", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Where are they usually found?","Seas", "Bays", "Beaches", "All are correct", "Bays", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("What danger causes anemones?", "Severe hives", "Death","Swelling","Neither", "Severe hives", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("Color of anemones?", "Red", "Blue", "Yellow", "Pink", "Pink", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Las anemonas son?", "Vertebrados", "Invertebrados", "Mamiferos", "Ninguna es correcta", "Invertebrados", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Cuanto pueden llegar a medir sus tentaculos?", "50 cm", "30 cm", "50 m", "20 cm", "50 cm", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿A que profundidad minima se encuentran?", "2 m", "4 m", "5 m", "20 m", "5 m", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿Donde se suelen encontrar?", "Mares", "Bahias", "Playas", "Todas son correctas", "Bahias", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿Que peligro causa las anemonas?", "Graves urticarias", "Muerte", "Hinchazon", "Ninguno", "Graves urticarias", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Color de las anemonas?", "Rojo", "Azul", "Amarillo", "Rosa", "Rosa", "");

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
            final ListaPreguntas pregunta1 = new ListaPreguntas("Blowfish skill?", "Spit toxins","Inflate", "Swim fast", "Camouflage", "Inflate", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Why does it inflate?", "To defend","Because they are hungry","Due to the large amount of stored toxins","Seem harmless","To defend", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("What foods do puffer fish eat?", "Algae and vertebrate animals","All kinds of animals", "Algae and invertebrate animals","plankton", "Algae and invertebrate animals", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Where are they?", "Cold areas", "Tropical and subtropical waters", "Rivers","None is correct", "Tropical and subtropical waters", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("What are they inflated with?", "Water", "Air", "Sand", "Toxins", "Water", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("How big can a dwarf puffer fish be?", "50 cm", "2,5 cm", "70,5 cm", "1 m", "2,5 cm", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Habilidad pez globo?", "Escupir toxinas", "Inflarse", "Nadar rapido", "Camuflarse", "Inflarse", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Porque se infla?", "Para defenderse", "Debido a que tiene hambre", "Debido a la gran cantidad de toxinas almacenadas", "Parecer inofensivo", "Para defenderse", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Que alimentos come el pez globo?", "Algas y animales vertebrados", "Todo tipo de animales", "Algas y animales invertebrados", "Plancton", "Algas y animales invertebrados", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿Donde se encuentran?", "Zonas frias", "Aguas tropicales y subtropicales", "Rios", "Ninguna es correcta", "Aguas tropicales y subtropicales", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De que se inflan?", "Agua", "Aire", "Arena", "Toxinas", "Aire", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Cuanto puede medir un pez globo enano?", "50 cm", "2,5 cm", "70,5 cm", "1 m", "2,5 cm", "");

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
            final ListaPreguntas pregunta1 = new ListaPreguntas("Where DONT'T the phocas live?", "Atlantic Ocean", "Russian Coast", "Tropical waters", "Artic", "Tropical waters", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("How do de phocas organize?", "Pairs", "Small tribes", "One male and several females", "All the answers above", "All the answers above", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("How much do the marine elephants weight?", "A tone", "4500 Kg", "500 Kg", "10 tones", "4500 Kg", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Which is the only phoca that lives in sweet water?", "Marine Lion" , "Baikal Phoca", "Marine Elephant", "Emperor Phoca", "Baikal Phoca", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Why do the phocas don't suffer from cold?", "The use coat", "The make a campfire", "Due to theirs hair", "Due to theirs fat", "Due to theirs fat", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("How much height can the Weddel phoca submerge?", "1 Km", "600 m", "2 Km", "100 m", "600 m", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Donde NO habitan las focas?", "Oceano Atlántico", "Costa de Rusia", "Aguas tropicales", "Ártico", "Aguas tropicales", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Como se organizan las focas?", "Parejas", "Pequeñas tribus", "Un macho y muchas hembras", "Todas las anteriores", "Todas las anteriores", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Cuanto pesan los elefantes marinos?", "Una tonelada", "4500 Kg", "500 Kg", "10 tones", "4500 Kg", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿Cual es la unica foca que vive en agua dulce?", "Leon Marino", "Foca del Baikal", "Elefante Marino", "Foca emperador", "Foca del Baikal", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿Como hacen las focas para no pasar frio?", "Se ponen abrigo", "Hacen una hoguera", "Gracias al pelaje", "Gracias a su grasa", "Gracias a su grasa", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Hasta que profundidad pueden sumergirse la foca de Wedell?", "1 Km", "600 m", "2 Km", "100 m", "600 m", "");

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
            final ListaPreguntas pregunta1 = new ListaPreguntas("What kind of animal is the turtle?", "Mammal", "Reptile", "Bird", "Rotifer", "Reptile", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Turtles are?", "Omnivores", "Carnivores", "Herbivores", "None is correct", "Omnivores", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("Turtle dangers?", "The fishing nets", "The dirt", "Climate change", "All are correct", "All are correct", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Where do turtles live?", "Rivers", "Cold seas", "Warm seas", "Swimming pools", "Warm seas", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("Which of these animals does the turtle not feed on?", "Corals", "Algae", "Fish", "Plankton", "Plankton", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("What does he use his shell for?", "To defend against predators", "To store food", "For sleeping", "To procreate", "To defend against predators", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Que clase de animal es la tortuga?", "Mamifero", "Reptil", "Ave", "Rotífero", "Reptil", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Las tortugas son?", "Omnívoras", "Carnívoras", "Herbívoras", "Ninguna es correcta", "Omnívoras", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Peligros de las tortugas?", "Las redes de pesca", "La suciedad", "El cambio climático", "Todas son correctas", "Todas son correctas", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿Donde habitan las  tortugas?", "Rios", "Mares frios", "Mares calidos", "Piscinas", "Mares calidos", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿De cuáles de estos animales no se alimenta la tortuga?", "Corales", "Algas", "Peces", "Plancton", "Plancton", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Para que usa su caparazón?", "Para defenderse de depredadores", "Para almacenar comida", "Para dormir", "Para procrear", "Para defenderse de depredadores", "");

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
            final ListaPreguntas pregunta1 = new ListaPreguntas("How much does a blue whale weight?", "Between 100 and 120 tons", "10000 Kg, more or less", "Between 50 and 60 tons", "Almost 200 tons", "Between 100 and 120 tons", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("Which is the biggest animal in The Earth history?", "Megalodon", "Diplodocus", "Blue whale", "Tiranosaurus Rex", "Blue whale", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("The former number of blue whales in the Antartic was around 239000. Which is their number now after the hunt?", "2000", "5000", "100", "300000", "2000", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("Which animal mostly composes blue whales' diet?", "Krill", "Crabs", "Salmon", "Squids", "Krill", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("How much food can a blue whale consume in a whole day?", "40 Kg", "400 Kg", "4000 Kg", "40000 Kg", "40000 Kg", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("Which is the blue whale barbs function?", "For courtship", "For filtering the water when it eats", "For warm itself on the cold waters of Artic Sea", "For protecting itself from its predators", "For filtering the water when it eats", "");

            listaPreguntas.add(pregunta1);
            listaPreguntas.add(pregunta2);
            listaPreguntas.add(pregunta3);
            listaPreguntas.add(pregunta4);
            listaPreguntas.add(pregunta5);
            listaPreguntas.add(pregunta6);
        } else {
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Cuanto pesa aproximadamente una ballena adulta?", "Entre 100 y 120 toneladas", "10000 Kg, más o menos", "Entre 50 y 60 toneladas", " Aproximadamente 200 toneladas", "Entre 100 y 120 toneladas", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Cual es el animal mas grande de la historia de la Tierra?", "El megalodón", "Diplodocus", "Ballena azul", "Tiranosaurus Rex", "Ballena azul", "");
            final ListaPreguntas pregunta3 = new ListaPreguntas("¿Antiguamente la población más numerosa era la de la Antártida, con alrededor de 239 000 ejemplares. ¿Cual es su numero actual tras la caza?", "2000", "5000", "100", "300000", "2000", "");
            final ListaPreguntas pregunta4 = new ListaPreguntas("¿De que se alimentan mayoritariamente las ballenas azules?", "Krill", "Cangrejos", "Salmones", "Calamares", "Krill", "");
            final ListaPreguntas pregunta5 = new ListaPreguntas("¿Cuanta comida puede consumir una ballena en un día?", "40 Kg", "400 Kg", "4000 Kg", "40000 Kg", "40000 Kg", "");
            final ListaPreguntas pregunta6 = new ListaPreguntas("¿Para que sirve la barba de la ballena azul?", "Para ligar", "Para filtrar el agua a la hora de comer", "Para abrigarse en las aguas Árticas", "Para defenderse de sus depredadores", "Para filtrar el agua a la hora de comer", "");


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
            final ListaPreguntas pregunta1 = new ListaPreguntas("¿Dónde habitan los narvales?", "Mar Mediterraneo", "Mar Índico", "Lago Victoria", "Norte del océano Atlántico", "Norte del océano Atlántico", "");
            final ListaPreguntas pregunta2 = new ListaPreguntas("¿Que narvales tienen cuerno?", "Machos", "Hembras", "Niños", "Adultos", "Machos", "");
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
