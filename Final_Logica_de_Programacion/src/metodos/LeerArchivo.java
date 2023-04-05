package metodos;
import java.io.*;
import java.util.*;

public class LeerArchivo
{   
    static File directorio = new File("./canciones");
    static String[] canciones = directorio.list();

    static String strLetra = crearLetraCancion();
    static String[] arrLetra = crearArrayLetra(strLetra);
    static String espacio = "     ";
    static Scanner uInput = new Scanner(System.in);

    public static String crearLetraCancion()
    {
        String letraArchivo="";
        try
        {
            File file = new File("./recursos/letras.csv");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                letraArchivo += scanner.nextLine();
            }

        }catch(Exception error){
            System.out.println("Error: "+error);
        }
        return letraArchivo;
    }

    public static String[] crearArrayLetra(String letraArchivo)
    {
        String[] letraArray = new String[canciones.length];
        letraArray = letraArchivo.trim().split("\\s*##;\\s*");
        return letraArray;
    }


    public static String[] letraCancion(String[] letra, int position)
    {
        String cancion = letra[position];
        String[] cancionArr = new String[letra[position].length()];

        cancionArr = cancion.split(";");
        return cancionArr;
    }

    public static void imprimirListaCanciones()
    {
        String temp ="";
        String temp0="";
        int count=0;
        for(int i=0;i<arrLetra.length;i++)
        {
            String[] arrTemp = new String[arrLetra[i].length()];

            temp = arrLetra[i];
            arrTemp = temp.split(";");
            for(int j=0;j<1;j++)
            {
                System.out.println(espacio+"Opcion "+count+"  : "+arrTemp[0]);
                count++;
                try
                {
                    Thread.sleep(50);
                }catch(Exception error){
                    System.out.println("Error: "+error);
                }
            }
        }
    }

    public static void imprimirLetraCancion(int opcionCancion)
    {
        String[] cancion = new String[arrLetra[opcionCancion].length()];

        cancion = letraCancion(arrLetra,opcionCancion);
        for(int i=0;i<cancion.length-5;i++)
        {
            try
            {
                if(i<5)
                {
                    System.out.println(espacio+cancion[i]);
                }else{
                    System.out.print(espacio+cancion[i]+" ");
                    i++;
                    Thread.sleep(100);
                    System.out.print(cancion[i]+" ");
                    i++;
                    Thread.sleep(100);
                    System.out.print(cancion[i]+" ");
                    i++;
                    Thread.sleep(100);
                    System.out.print(cancion[i]+" ");
                    i++;
                    Thread.sleep(100);
                    System.out.print(cancion[i]+" ");
                    System.out.println();
                }
            }catch(Exception error){
                System.out.println("Error: "+error);
            }
        }
    }

     public static void imprimirLetraCancion(int opcionCancion,int tempo)
    {
        String[] cancion = new String[arrLetra[opcionCancion].length()];
        String opcionLetraJuego="";

        cancion = letraCancion(arrLetra,opcionCancion);
        int i=-1;
        int decicion=0;
        long position = 0;
        do
        {   
            try
            {
                if(i<5)
                {
                    i++;
                    System.out.println(espacio+cancion[i]);
                }else{
                    decicion = Juego.random(1,5);
                    switch(decicion)
                    {
                        case 1 : i++;
                                System.out.print(espacio+cancion[i]+" ");
                                i++;
                                System.out.print(cancion[i]+" ");
                                i++;
                                System.out.print(espacio+"[missing]");
                                opcionLetraJuego = cancion[i];
                                i++;
                                System.out.print(espacio+cancion[i]+" ");
                                i++;
                                System.out.print(cancion[i]+" ");
                                System.out.println();
                                position = Audio.pausar();
                                Juego.jugar(opcionLetraJuego);
                                Audio.continuar(position);
                            break;
                        case 2,3,4,5 : i++;
                                System.out.print(espacio+cancion[i]+" ");
                                i++;
                                Thread.sleep(100);
                                System.out.print(cancion[i]+" ");
                                i++;
                                Thread.sleep(100);
                                System.out.print(cancion[i]+" ");
                                i++;
                                Thread.sleep(100);
                                System.out.print(cancion[i]+" ");
                                i++;
                                Thread.sleep(100);
                                System.out.print(cancion[i]+" ");
                                System.out.println();
                            break;
                    }
                }
                Thread.sleep(tempo);
            }catch(Exception error){
                System.out.println("Error: "+error);
            }
        }while(i<cancion.length-5 && Audio.sequencer.isRunning());
    }
}