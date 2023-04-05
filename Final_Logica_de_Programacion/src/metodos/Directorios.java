package metodos;
import java.io.*;
import java.util.Scanner;

public class Directorios
{
    static File directorio = new File("./canciones");
    static String[] canciones = directorio.list();
    static String espacio = "     ";
    static Audio audio = new Audio();

    public static void imprimirCarpetaCanciones()
    {
        try
        {
            for(int i=0;i<canciones.length;i++)
            {
                System.out.println(espacio+"cancion "+i+" : "+canciones[i]);
                Thread.sleep(50);
            }
        }catch(Exception error){
            System.out.println("Error: "+error);
        }   
    }
    public static void imprimirNumeroCanciones()
    {
        System.out.println(espacio+"Numero de canciones : "+canciones.length);
    }

    public static void reproducirCancion(int i)
    {
        audio.seleccionarCancion("./canciones/"+canciones[i]);
        audio.reproducir();
    }

    public static void menuCanciones()
    {
        System.out.println(espacio+"Detener : 1");
        System.out.println(espacio+"Volver al menu : 2");
        System.out.println(espacio+"Reproducir otra cancion : 3");
    }

    public static void menuCanciones(byte i)
    {
        Scanner uInput = new Scanner(System.in);
        if(i <= 3)
        {
            switch(i)
            {
                case 1 : audio.detener();
                    break;
                case 2: 
                    break;
                case 3 : System.out.println();
                        imprimirCarpetaCanciones();
                        audio.detener();
                        System.out.print("     $ Ingrese el numero de la cancion: ");
                        byte numero = uInput.nextByte();
                        reproducirCancion(numero);
                        System.out.println();
                        menuCanciones();
                        System.out.print("     $ Ingrese el numero de la cancion: ");
                        byte numero2 = uInput.nextByte();
                        menuCanciones(numero2);
                    break;
            }
        }else{
            System.out.println(espacio+i+" No es una opcion valida");
        }
    }
}
