
package preguntas;

import historial.Historial;
import javax.swing.JOptionPane;
import usuario.Persona;


public class Niveles {

    Persona persona = new Persona();
    Historial h = new Historial();
    int continuar;
    double dinero = persona.getDinero();

    public void nivelUno() {
        Preguntas p = new Preguntas();
        int opcion;
        int respuesta;

        p.categoriaDeportes();
        p.categoriaCine();
        p.categoriaMatematicas();
        p.categoriaMusica();
        p.categoriaTecnologia();
        p.categorias();
        opcion = (int) (Math.random() * 5 + 1);

        switch (opcion) {
            case 1:
                System.out.println("*******************");
                System.out.println("Primera pregunta por: $100.000");
                System.out.println("*******************");
                System.out.println(p.categoria[0][0]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);

                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $100.000");
                    System.out.println("*******************");
                    persona.setDinero(100000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $200.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);

                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");

                    } else if (continuar == 2) {

                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);

                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 2:
                System.out.println("*******************");
                System.out.println("Primera pregunta por: $100.000");
                System.out.println("*******************");
                System.out.println(p.categoria[1][0]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 1) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $100.000");
                    System.out.println("*******************");
                    persona.setDinero(100000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $200.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);

                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 1");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;

            case 3:
                System.out.println("*******************");
                System.out.println("Primera pregunta por: $100.000");
                System.out.println("*******************");
                System.out.println(p.categoria[2][0]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 1) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $100.000");
                    System.out.println("*******************");
                    persona.setDinero(100000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $200.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);

                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 1");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            case 4:
                System.out.println("*******************");
                System.out.println("Primera pregunta por: $100.000");
                System.out.println("*******************");
                System.out.println(p.categoria[3][0]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 4) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $100.000");
                    System.out.println("*******************");
                    persona.setDinero(100000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $200.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 4");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 5:
                System.out.println("*******************");
                System.out.println("Primera pregunta por: $100.000");
                System.out.println("*******************");
                System.out.println(p.categoria[4][0]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 1) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $100.000");
                    System.out.println("*******************");
                    persona.setDinero(100000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $200.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);

                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 1");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            default:
                System.out.println("Ingrese Una Opcion del 1 al 4");
                break;

        }

    }

    public void nivelDos() {
        Preguntas p = new Preguntas();
        int opcion;
        int respuesta;
        p.categoriaDeportes();
        p.categoriaCine();
        p.categoriaMatematicas();
        p.categoriaMusica();
        p.categoriaTecnologia();
        p.categorias();
        opcion = (int) (Math.random() * 5 + 1);
        switch (opcion) {
            case 1:
                System.out.println("*******************");
                System.out.println("Segunda pregunta por: $200.000");
                System.out.println("*******************");
                System.out.println(p.categoria[0][1]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 2) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $200.000");
                    System.out.println("*******************");
                    persona.setDinero(200000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $500.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 2");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 2:
                System.out.println("*******************");
                System.out.println("Segunda pregunta por: $200.000");
                System.out.println("*******************");
                System.out.println(p.categoria[1][1]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $200.000");
                    System.out.println("*******************");
                    persona.setDinero(200000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $500.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;

            case 3:
                System.out.println("*******************");
                System.out.println("Segunda pregunta por: $200.000");
                System.out.println("*******************");
                System.out.println(p.categoria[2][1]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 2) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $200.000");
                    System.out.println("*******************");
                    persona.setDinero(200000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $500.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 2");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            case 4:
                System.out.println("*******************");
                System.out.println("Segunda pregunta por: $200.000");
                System.out.println("*******************");
                System.out.println(p.categoria[3][1]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 4) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $200.000");
                    System.out.println("*******************");
                    persona.setDinero(200000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $500.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 4");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 5:
                System.out.println("*******************");
                System.out.println("Segunda pregunta por: $200.000");
                System.out.println("*******************");
                System.out.println(p.categoria[4][1]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $200.000");
                    System.out.println("*******************");
                    persona.setDinero(200000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $500.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Ingrese Una Opcion del 1 al 4");
                break;
        }
    }

    public void nivelTres() {
        Preguntas p = new Preguntas();
        int opcion;
        int respuesta;
        p.categoriaDeportes();
        p.categoriaCine();
        p.categoriaMatematicas();
        p.categoriaMusica();
        p.categoriaTecnologia();
        p.categorias();
        opcion = (int) (Math.random() * 5 + 1);
        switch (opcion) {
            case 1:
                System.out.println("*******************");
                System.out.println("Tercera pregunta por $500.000");
                System.out.println("*******************");
                System.out.println(p.categoria[0][2]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 1) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $200.000");
                    System.out.println("*******************");
                    persona.setDinero(500000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $1.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 1");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 2:
                System.out.println("*******************");
                System.out.println("Tercera pregunta por $500.000");
                System.out.println("*******************");
                System.out.println(p.categoria[1][2]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $500.000");
                    System.out.println("*******************");
                    persona.setDinero(500000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $1.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;

            case 3:
                System.out.println("*******************");
                System.out.println("Tercera pregunta por $500.000");
                System.out.println("*******************");
                System.out.println(p.categoria[2][2]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $500.000");
                    System.out.println("*******************");
                    persona.setDinero(500000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $1.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            case 4:
                System.out.println("*******************");
                System.out.println("Tercera pregunta por $500.000");
                System.out.println("*******************");
                System.out.println(p.categoria[3][2]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 2) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $500.000");
                    System.out.println("*******************");
                    persona.setDinero(500000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $1.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 2");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 5:
                System.out.println("*******************");
                System.out.println("Tercera pregunta por $500.000");
                System.out.println("*******************");
                System.out.println(p.categoria[4][2]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 4) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $500.000");
                    System.out.println("*******************");
                    persona.setDinero(500000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $1.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 4");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            default:
                System.out.println("Ingrese Una Opcion del 1 al 4");
                break;
        }
    }

    public void nivelCuatro() {
        Preguntas p = new Preguntas();
        int opcion;
        int respuesta;
        p.categoriaDeportes();
        p.categoriaCine();
        p.categoriaMatematicas();
        p.categoriaMusica();
        p.categoriaTecnologia();
        p.categorias();
        opcion = (int) (Math.random() * 5 + 1);
        switch (opcion) {
            case 1:
                System.out.println("*******************");
                System.out.println("Cuarta pregunta por $1.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[0][3]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 4) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $1.000.000");
                    System.out.println("*******************");
                    persona.setDinero(1000000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $5.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 4");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 2:
                System.out.println("*******************");
                System.out.println("Cuarta pregunta por $1.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[1][3]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $1.000.000");
                    System.out.println("*******************");
                    persona.setDinero(1000000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $5.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;

            case 3:
                System.out.println("*******************");
                System.out.println("Cuarta pregunta por $1.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[2][3]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $1.000.000");
                    System.out.println("*******************");
                    persona.setDinero(1000000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $5.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            case 4:
                System.out.println("*******************");
                System.out.println("Cuarta pregunta por $1.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[3][3]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 2) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $1.000.000");
                    System.out.println("*******************");
                    persona.setDinero(1000000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $5.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 2");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 5:
                System.out.println("*******************");
                System.out.println("Cuarta pregunta por $1.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[4][3]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {

                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $1.000.000");
                    System.out.println("*******************");
                    persona.setDinero(1000000);
                    System.out.println("En este momento tiene $" + persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("La siguiente pregunta será por $5.000.000");
                    System.out.println("*******************");
                    System.out.println(" Si desea continuar presione 1 \n Por el contrario si se desea retirar con " + persona.getDinero() + " Presione 2");
                    System.out.println("*******************");
                    do {
                        continuar = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (continuar > 2 || continuar < 1);
                    if (continuar == 1) {
                        System.out.println("*******************");
                        System.out.println("SIGUIENTE PREGUNTA");
                        System.out.println("*******************");
                    } else if (continuar == 2) {
                        System.out.println("MUCHAS GRACIAS POR PARTICIPAR");
                        System.out.println("USTED HA GANADO: " + persona.getDinero());
                        h.escribirRegistro(persona.getDinero());
                        System.out.println("REGISTRO DE PARTICIPANTES");
                        h.leerArchivo();
                        System.exit(0);
                    }
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            default:
                System.out.println("Ingrese Una Opcion del 1 al 4");
                break;
        }
    }

    public void nivelCinco() {
        Preguntas p = new Preguntas();
        int opcion;
        int respuesta;
        p.categoriaDeportes();
        p.categoriaCine();
        p.categoriaMatematicas();
        p.categoriaMusica();
        p.categoriaTecnologia();
        p.categorias();
        opcion = (int) (Math.random() * 5 + 1);
        switch (opcion) {
            case 1:
                System.out.println("*******************");
                System.out.println("Ultima pregunta por $5.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[0][4]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 3) {
                    persona.setDinero(5000000);
                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES, HAS RESPONDIDO TODAS LAS PREGUNTAS CORRECTAMENTE");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $5.000.000");
                    System.out.println("*******************");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    JOptionPane.showMessageDialog(null, "¡¡FELICIDADESSS!!");

                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 3");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 2:
                System.out.println("*******************");
                System.out.println("Ultima pregunta por $5.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[1][4]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 1) {
                    persona.setDinero(5000000);
                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES, HAS RESPONDIDO TODAS LAS PREGUNTAS CORRECTAMENTE");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $5.000.000");
                    System.out.println("*******************");
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    JOptionPane.showMessageDialog(null, "¡¡FELICIDADESSS!!");
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 1");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    System.exit(0);

                }

                break;

            case 3:
                System.out.println("*******************");
                System.out.println("Ultima pregunta por $5.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[2][4]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 4) {
                    persona.setDinero(5000000);
                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES, HAS RESPONDIDO TODAS LAS PREGUNTAS CORRECTAMENTE");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $5.000.000");
                    System.out.println("*******************");
                    JOptionPane.showMessageDialog(null, "¡¡FELICIDADESSS!!");
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 4");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            case 4:
                System.out.println("*******************");
                System.out.println("Ultima pregunta por $5.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[3][4]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 1) {
                    persona.setDinero(5000000);
                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES, HAS RESPONDIDO TODAS LAS PREGUNTAS CORRECTAMENTE");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $5.000.000");
                    System.out.println("*******************");
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    JOptionPane.showMessageDialog(null, "¡¡FELICIDADESSS!!");
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 1");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }
                break;
            case 5:
                System.out.println("*******************");
                System.out.println("Ultima pregunta por $5.000.000");
                System.out.println("*******************");
                System.out.println(p.categoria[4][4]);
                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (respuesta >= 5 || respuesta <= 0);
                if (respuesta == 4) {
                    persona.setDinero(5000000);
                    System.out.println("*******************");
                    System.out.println("RESPUESTA CORRECTA");
                    System.out.println("*******************");
                    System.out.println("FELICIDADES, HAS RESPONDIDO TODAS LAS PREGUNTAS CORRECTAMENTE");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("*******************");
                    System.out.println("FELICIDADES ACABA DE GANAR $5.000.000");
                    System.out.println("*******************");
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    JOptionPane.showMessageDialog(null, "¡¡FELICIDADESSS!!");
                } else {
                    System.out.println("*******************");
                    System.out.println("La respuesta correcta es la Opcion 4");
                    System.out.println("*******************");
                    System.out.println("Respuesta Erronea");
                    System.out.println("Se ha terminado el juego");
                    h.escribirRegistro(persona.getDinero());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    h.leerArchivo();
                    System.exit(0);

                }

                break;
            default:
                System.out.println("Ingrese Una Opcion del 1 al 4");
                break;
        }
    }
}
