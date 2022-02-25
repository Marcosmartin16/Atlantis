# Atlantis

## Proyecto hecho por Marcos Martín Ramírez, Miguel Martínez Oliaga y Sergio Tomeo Samuel.

## A continuación vamos a mostrar cómo fue hecho el proyecto, las clases y xml que tiene.

### Enlace al repositorio de GitHub: https://github.com/Marcosmartin16/Atlantis

## **Índice:**

1. [Demo](#demo)
2. [Splash Screen](#SS)
3. [Login](#L)
4. [SignUp](#S)
5. [Main Activity](#MA)
6. [Historias](#H)
7. [Quiz](#Q)
8. [Resultados](#R)

## Demo de cómo funciona la app diseñada para niños y hecha con Java y Firebase en castellano con modo oscuro y en inglés con modo claro:<a name="demo"></a>

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/DemoCastellano_tema_oscuro_Atlantis.gif)

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/DemoInglés_tema_claro_Atlantis.gif)

## 1.Splash Screen<a name="SS"></a>

Al iniciar la aplicación, aparecerá una pantalla en la que se muestra un ajolote (logo de esta app)
moviéndose entre un mar lleno de algas y con burbujas que le rodean.

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/SplashScreen.PNG)

Código fuente de Splash Screen:

### Java

[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/SplashScreen.java)

### XML

[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/splash_screen.xml)

## 2.Login<a name="L"></a>

Antes de explicar el login y el signup, cabe resaltar que ambos están conectados mediante el uso de
fragments.

Tras el Splash Screen, aparece un Login, el cual en la parte superior contiene el nombre de la
aplicación y que sirve para que el usuario (con los datos contenidos en la base de datos de
Firebase) inicie sesión con su correo electrónico y su contraseña:

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/CO_Login.PNG)
![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/IC_Login.PNG)

Código fuente del Login y sus fragments:

### Java

[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/SecondActivity.java)
[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/fragments/LoginFragment.java)

### XML

[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/login_fragment.xml)
[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/activity_second.xml)

## 3.SignUp<a name="S"></a>

Si no tiene una cuenta creada, el usuario debe hacer swipe hacia la izquierda donde podrá crear un
usuario eligiendo un nombre de usuario, una contraseña e introduciendo su cuenta de correo
electrónico.

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/CO_SignUp.PNG)
![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/IC_SignUp.PNG)

Código fuente del SignUp y sus fragments:

### Java

[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/SecondActivity.java)
[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/fragments/SignUpFragment.java)

### XML

[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/signup_fragment.xml)
[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/activity_second.xml)

## 4.Main Activity<a name="MA"></a>

Después de crear una cuenta o introducir sus datos (si ya disponía de una), aprecerá un Toast que
indicará que el login o registro ha sido satisfactorio y entonces se pasa la siguiente activity, la
cual consiste en CardViews que contienen el nombre del animal a la derecha del CardView y a su
izquierda una imagen del animal.

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/CO_ActivityMain.PNG)
![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/IC_ActivityMain.PNG)

Código fuente de Main Activity:

### Java

[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/MainActivity.java)

### XML

[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/activity_main.xml)

## 5.Historias<a name="H"></a>

Una vez el usuario elige el animal del que quiere saber más, se abrirá un Scrolling View que
contiene una imagen del animal seleccionado, el nombre de este y una historia que el usuario tendrá
que leer para poder responder a las preguntas que más adelante le harán.

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/CO_Historia.PNG)
![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/IC_Historia.PNG)

Código fuente de Historias:

### Java

[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/HistoriaActivity.java)

### XML

[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/activity_scrolling.xml)
[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/content_scrolling.xml)

## 6.Quiz<a name="Q"></a>

Al terminar de leer la historia, el usuario tendrá volver al principio de la historia y deberá
pulsar en el botón rojo que aparece en el lado derecho de la pantalla. Este botón te lleva al Quiz,
que contiene una serie de preguntas (contenidas en un ArrayList) relacionadas con lo que el usuario acaba de leer.

Consiste en 6 preguntas y 4 respuestas para cada una de estas, y para pasar a la siguiente pregunta,
es necesario pinchar sobre el botón que dice siguiente. Si el usuario acierta, la opción que ha
elegido se coloreará de verde. Por el contrario, si este falla, la opción que ha elegido se
coloreará de rojo y aparecerá la correcta en color verde. Hay un tiempo limitado de 1 minuto para
responder a estas preguntas.

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/CO_Quiz.PNG)
![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/IC_Quiz.PNG)

Código fuente del Quiz y las clases utilizadas para crear las preguntas, respuestas y mostrarlas:

### Java

[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/ArrayListPreguntas.java)
[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/ListaPreguntas.java)
[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/QuizActivity.java)

### XML

[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/activity_quiz.xml)

## 7.Resultados<a name="R"></a>

Una vez el usuario haya respondido a todas las preguntas del quiz, podrá ver en la siguiente
activity las respuestas que este ha acertado en color verde, y las que ha fallado en color naranja.

Si hace click sobre el botón volver a selección historias, volverá al Main Activity, donde podrá
elegir la nueva historia que quiera leer.

![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/CO_Resultados.PNG)
![imagenes](https://github.com/Marcosmartin16/Atlantis/blob/Sergio/imagenes/IC_Resultados.PNG)

Código fuente de Resultados:

### Java

[Java](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/java/com/sermami/atlantis/ResultadosQuiz.java)

### XML

[XML](https://github.com/Marcosmartin16/Atlantis/blob/master/app/src/main/res/layout/activity_quiz_resultados.xml)





