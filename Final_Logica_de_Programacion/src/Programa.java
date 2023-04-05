import metodos.Menu;
import metodos.LeerArchivo;
import java.util.Scanner;
import java.io.*;
import metodos.Audio;
import metodos.Juego;

public class Programa
{
    static String espacio = "          ";
    public static void main(String[] args)
    {
        Scanner uInput = new Scanner(System.in);
        String opcionS;
        byte opcionN = 0;
        Audio audio = new Audio();

        
        Menu.mostar_bienvenida();
        Menu.mostar_menu();
        
        System.out.print(espacio+espacio+espacio+"     $ ");
        opcionN = uInput.nextByte();
        if(opcionN != 127)
        {
            do 
            {
                Audio.detener();
                Menu.opcion_menu(opcionN);
                System.out.println("\n");
                Menu.mostar_menu();
                System.out.print(espacio+espacio+espacio+"     $ ");
                opcionN = uInput.nextByte();
            }while(opcionN != 5);
            
        }
        else{
            uInput.nextLine();
            opcionS = uInput.nextLine();
            Menu.opcion_menu(opcionS);
        }
        

        uInput.nextLine();
        uInput.nextLine();
    }
}