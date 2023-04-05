package metodos;
import java.util.Scanner;

public class Menu
{
    String opcionS="";
    static String espacio = "          ";
    public static void mostar_bienvenida()
    {
        String alinearIzquierda = "|  %-15s | %4-4d|%n";
        Ascii.bienvenida();
        System.out.format(espacio+espacio+espacio+"     +---------------------------+%n");
        System.out.format(espacio+espacio+espacio+"     | Creadores:                |%n");
        System.out.format(espacio+espacio+espacio+"     | Angie Paola Mazo          |%n");
        System.out.format(espacio+espacio+espacio+"     | Julian Rojas              |%n");
        System.out.format(espacio+espacio+espacio+"     | David Alvarez Tamayo      |%n");
        System.out.format(espacio+espacio+espacio+"     +---------------------------+%n");
    }
    public static void mostar_menu()
    {
        System.out.format(espacio+espacio+espacio+"     +---------------------------+%n");
        System.out.format(espacio+espacio+espacio+"     |            MENU           |%n");
        System.out.format(espacio+espacio+espacio+"     +---------------------------+%n");
        System.out.format(espacio+espacio+espacio+"     |   Opciones  |    Numero   |%n");
        System.out.format(espacio+espacio+espacio+"     +---------------------------+%n");
        System.out.format(espacio+espacio+espacio+"     |   Jugar     |      1      |%n");
        System.out.format(espacio+espacio+espacio+"     |   Canciones |      2      |%n");
        System.out.format(espacio+espacio+espacio+"     |   Letras    |      3      |%n");
        System.out.format(espacio+espacio+espacio+"     |   Ayuda     |      4      |%n");
        System.out.format(espacio+espacio+espacio+"     |   Salir     |      5      |%n");
        System.out.format(espacio+espacio+espacio+"     +---------------------------+%n");
    }
    public static void opcion_menu(byte i)
    {
        Scanner uInput = new Scanner(System.in);
        if (i <= 5)
        {
            switch(i)
            {
                case 1 : Audio.detener();
                        Juego.seleccionCancion();
                    break;
                case 2 : System.out.println(); 
                        Directorios.imprimirCarpetaCanciones();
                        System.out.println();
                        Directorios.imprimirNumeroCanciones();
                        System.out.print("     $ Ingrese el numero de la cancion: ");
                        int numeroCancion = uInput.nextByte();
                        System.out.println();
                        Directorios.reproducirCancion(numeroCancion);
                        Directorios.menuCanciones();
                        System.out.print("     $ ");
                        byte numero = uInput.nextByte();
                        Directorios.menuCanciones(numero);
                    break;
                case 3 : System.out.println();
                        LeerArchivo.imprimirListaCanciones();
                        System.out.print("     $ ");
                        int opcionLetraCancion = uInput.nextByte();
                        LeerArchivo.imprimirLetraCancion(opcionLetraCancion);
                    break;
                case 4 : System.out.println("Aqui se mostrara la ayuda requerida por el usuario.");
                    break;
                case 5 :
                    break;
            }
        }
        else{
            System.out.println(i + ": No es una opcion valida");
        }
    }
    public static void opcion_menu(String s)
    {
        if (s.equals("David"))
        {
            System.out.println("Secreto desbloqueado");
        }
        else{
            System.out.println("Solo se permiten numeros");
        }
    }
}
