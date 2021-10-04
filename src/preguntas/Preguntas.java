
package preguntas;

public class Preguntas{
    
    public String [][] categoria = new String[5][5];
    
    public Preguntas() {
    }
    public void categoriaDeportes(){
        
        categoria[0][0] = "¿cuantos jugadores tiene un equipo de futbol?\n"
                + " 1: 9 \n 2: 10 \n 3: 11 \n 4: 12";    
        categoria[0][1] = "¿Que seleccion tiene mas mundiales?\n"
                + " 1: Colombia \n 2: Brasil \n 3: Alemania \n 4: Francia"; 
        categoria[0][2] = "¿Que jugador tiene mas balones de oro?\n"
                + " 1: Messi \n 2: Neymar \n 3: Mbappe \n 4: Cristiano Ronaldo";   
        categoria[0][3] = "¿cuantos periodos tiene un partido de baloncesto?\n"
                + " 1: 3 \n 2: 5 \n 3: 6 \n 4: 4";        
        categoria[0][4] = "¿Cómo se llama el deporte en el cual se levantan pesas?\n"
                + " 1: Pesas \n 2: Levantamiento de pesas \n 3: Halterofilia \n 4: Alzamiento"; 
        
       
    }
    public void categoriaMatematicas(){
        categoria[1][0] = "¿Cuanto es la suma de: 250 + 250 + 250?\n"
                + " 1: 750 \n 2: 600 \n 3: 650 \n 4: 700";        
        categoria[1][1] = "¿Resultado de la potencia al cuadrado de 8\n"
                + " 1: 16\n 2: 32 \n 3: 64 \n 4: 80"; 
        categoria[1][2] = "¿Cuanto es 10+10*(2*16)?\n"
                + " 1: 42 \n 2: 52 \n 3: 320 \n 4: 300";      
        categoria[1][3] = "¿Que es un triangulo Isoceles?\n"
                + " 1: Tiene todos los lados iguales \n 2: Tiene los 3 lados desiguales \n 3: Tiene dos lados iguales \n 4: Ninguna de las anteriores"; 
        categoria[1][4] = "¿A cuanto equivale 'PI'(π)\n"
                + " 1: 3.1416 \n 2: 3.1415 \n 3: 3.1417 \n 4: 3.1414";
     }
    public void categoriaCine(){
         categoria[2][0] = "¿De que estudio cinematografico es el Capitan America\n"
                + " 1: Marvel \n 2: DC \n 3: Universal \n 4: Pixar";
         categoria[2][1] = "¿Cual de estos personajes interpreta Robert Downey Junior ?\n"
                + " 1: Luke Skywalker \n 2: Tony Stark \n 3: Toretto \n 4: Bucky Barnes";
         categoria[2][2] = "¿En que año se estreno la primera pelicula de Star Wars?\n"
                + " 1: 1975 \n 2: 1976 \n 3: 1977 \n 4: 1978";
         categoria[2][3] = "¿De que película es la frase: The World Is Yours\n"
                + " 1: El padrino II \n 2: DOOM \n 3: Scarface \n 4: Rapidos Y Furiosos V";
         categoria[2][4] = "¿Cual de estos actores ha ganado al menos un Premio Oscar?\n"
                + " 1: Brad Pitt \n 2: Johnny Depp \n 3: Tom Cruise \n 4: Leonardo DiCaprio";
     }
    public void categoriaTecnologia(){
         categoria[3][0] = "¿Cual de estas no es una marca de celular?\n"
                + " 1: Samsung \n 2: Sony \n 3: Apple \n 4: Tigo";
         categoria[3][1] = "¿Cual de estas no es una plataforma de streaming?\n"
                + " 1: Netflix \n 2: Twich \n 3: AppleTV \n 4: Mozilla";
         categoria[3][2] = "¿Cual es la tecnologia que se esta desarrolando para aumentar la velocidad?\n"
                + " 1: 4G \n 2: 5G \n 3: 6G \n 4: 1GB de Conexion";
         categoria[3][3] = "¿Qué hace el ordenador si pulsas Ctrol + Z?\n"
                + " 1: Adelanta \n 2: Retrocede \n 3: Toma captura de pantalla \n 4: Pegar";
         categoria[3][4] = "¿Cuál es la red social más usada del mundo?\n"
                + " 1: Facebook \n 2: Instagram \n 3: Snaptchat \n 4: Twitter";
         
     }
    public void categoriaMusica(){
         categoria[4][0] = "¿En que pais nació Bob Marley?\n"
                + " 1: Jamaica \n 2: Puerto Rico \n 3: EEUU \n 4: Nueva Zelanda";
         categoria[4][1] = "¿Cuantas cuerdas tiene una guitarra?\n"
                + " 1: 4 \n 2: 7 \n 3: 6 \n 4: 5";
         categoria[4][2] = "¿Cuantas lineas tiene un pentagrama?\n"
                + " 1: 4 \n 2: 7 \n 3: 6 \n 4: 5";
         categoria[4][3] = "¿Cual es la cancion con mas reproducciones en Youtube?\n"
                + " 1: Gangman Style \n 2: Bailando \n 3: Despacito \n 4: Kill This Love";
         categoria[4][4] = "¿En que año fue asesinado John Lennon?\n"
                + " 1: 1977\n 2: 1978 \n 3: 1979 \n 4: 1980";
     }
    public void categorias(){
        System.out.println("*******************");
        System.out.println("1. Deportes");
        System.out.println("2. Matemáticas");
        System.out.println("3. Cine");
        System.out.println("4. Tecnología");
        System.out.println("5. Música");
        System.out.println("*******************");
     }
             
             
    public String[][] getCategoria() {
        return categoria;
    }
    public void setCategoria(String[][] categoria) {
        this.categoria = categoria;
       }
    
    
    

    
}
