package metodos;

import java.util.*;

public class Juego
{  
    static Scanner uInput = new Scanner(System.in);
    static String espacio = "     ";

    public static void jugar(String cancion)
    {
        String[] opcionesRespuestas = new String[] {"Amor","tu","Camino","Eligeme","Egg","Nai","Peticion","Que","Vamos","Logica"};
        String op1 = opcionesRespuestas[random(0,8)];
        String op2 = opcionesRespuestas[random(0,8)];
        int lugar = random(1,3);
        System.out.println();
        switch(lugar)
        {
            case 1 : System.out.format("     |   "+cancion+"  -->     1     %n");
                    System.out.format("     |   "+op1+"  -->     2     %n");
                    System.out.format("     |   "+op2+"  -->     3     %n");
                    System.out.println();
                    System.out.print(espacio+"$ ");
                    int opcionJuego1 = uInput.nextByte();
                    respuestas1(opcionJuego1,cancion,op1,op2);
                break;
            case 2 : System.out.format("     |   "+op1+"  -->     1     %n");
                    System.out.format("     |   "+cancion+"  -->     2     %n");
                    System.out.format("     |   "+op2+"  -->     3     %n");
                    System.out.println();
                    System.out.print(espacio+"$ ");
                    int opcionJuego2 = uInput.nextByte();
                    respuestas2(opcionJuego2,cancion,op1,op2);
                break;
            case 3 : System.out.format("     |   "+op2+"  -->     1     %n");
                    System.out.format("     |   "+op1+"  -->     2     %n");
                    System.out.format("     |   "+cancion+"  -->     3     %n");
                    System.out.println();
                    System.out.print(espacio+"$ ");
                    int opcionJuego3 = uInput.nextByte();
                    respuestas3(opcionJuego3,cancion,op1,op2);
                break;
        }
    }

    public static void seleccionCancion()
    {
        LeerArchivo.imprimirListaCanciones();
        System.out.println(espacio+"Salir : 19");
        System.out.println();
        System.out.print("     $ ");
        int opcionLetraCancion = uInput.nextByte();
        switch(opcionLetraCancion)
        {
            case 0 : Directorios.reproducirCancion(17);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 1 : Directorios.reproducirCancion(2);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 2 : Directorios.reproducirCancion(5);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 3 : Directorios.reproducirCancion(1);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 4 : Directorios.reproducirCancion(13);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 5 : Directorios.reproducirCancion(12);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 6 : Directorios.reproducirCancion(3);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 7 : Directorios.reproducirCancion(7);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 8 : Directorios.reproducirCancion(19);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 9 : Directorios.reproducirCancion(16);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 10 : Directorios.reproducirCancion(9);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 11 : Directorios.reproducirCancion(6);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 12 : Directorios.reproducirCancion(8);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 13 : Directorios.reproducirCancion(15);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 14 : Directorios.reproducirCancion(4);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 15 : Directorios.reproducirCancion(10);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 16 : Directorios.reproducirCancion(0);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 17 : Directorios.reproducirCancion(14);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 18 : Directorios.reproducirCancion(11);
                    do
                    {
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion,1000);
                    }while(Audio.sequencer.isRunning());
                    Audio.detener();
                break;
            case 19 :
                break;
        }
        
    }

    public static int random(int inicio,int fin)
	{
		Random r = new Random();
		return r.nextInt(fin-inicio+1) + inicio;
	}

    public static void respuestas1(int i,String s1,String s2, String s3)
    { 
        switch(i)
        {
            case 1 : System.out.format("     +---------------------------+%n");
                    System.out.println(espacio+"["+s1+"]"+" Correcto! +1");
                    System.out.format("     +---------------------------+%n");
                break;
            case 2 : System.out.println(espacio+s2+" : Es incorrecta");
                break;
            case 3 : System.out.println(espacio+s3+" : Es incorrecta"); 
                break;
        }
        System.out.println();
    }

    public static void respuestas2(int i,String s1,String s2, String s3)
    {
         switch(i)
        {
            case 1 : System.out.println(espacio+s2+" : Es incorrecta");
                break;
            case 2 : System.out.format("     +---------------------------+%n");
                    System.out.println(espacio+"["+s1+"]"+" Correcto! +1");
                    System.out.format("     +---------------------------+%n");
                break;
            case 3 : System.out.println(espacio+s3+" : Es incorrecta");  
                break;
        }
        System.out.println();
    }

    public static void respuestas3(int i,String s1,String s2, String s3)
    {
         switch(i)
        {
            case 1 : System.out.println(espacio+s3+" : Es incorrecta");
                break;
            case 2 : System.out.println(espacio+s2+" : Es incorrecta");
                break;
            case 3 : 
                    System.out.format("     +---------------------------+%n");
                    System.out.println(espacio+"["+s1+"]"+" Correcto! +1");
                    System.out.format("     +---------------------------+%n");
                break;
        }
        System.out.println();
    }
}