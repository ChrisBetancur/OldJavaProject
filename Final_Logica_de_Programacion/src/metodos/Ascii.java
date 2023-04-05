package metodos;

public class Ascii
{
    String opcionS="";
    static String espacio = "     ";
    public static void bienvenida()
    {
        String alinearIzquierda = "|  %-15s | %4-4d|%n";
        System.out.format(espacio+espacio+espacio+"██████╗░██╗███████╗███╗░░██╗██╗░░░██╗███████╗███╗░░██╗██╗██████╗░░█████╗░░██████╗%n");
        System.out.format(espacio+espacio+espacio+"██╔══██╗██║██╔════╝████╗░██║██║░░░██║██╔════╝████╗░██║██║██╔══██╗██╔══██╗██╔════╝%n");
        System.out.format(espacio+espacio+espacio+"██████╦╝██║█████╗░░██╔██╗██║╚██╗░██╔╝█████╗░░██╔██╗██║██║██║░░██║██║░░██║╚█████╗░%n");
        System.out.format(espacio+espacio+espacio+"██╔══██╗██║██╔══╝░░██║╚████║░╚████╔╝░██╔══╝░░██║╚████║██║██║░░██║██║░░██║░╚═══██╗%n");
        System.out.format(espacio+espacio+espacio+"██████╦╝██║███████╗██║░╚███║░░╚██╔╝░░███████╗██║░╚███║██║██████╔╝╚█████╔╝██████╔╝%n");
        System.out.format(espacio+espacio+espacio+"╚═════╝░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚══╝╚═╝╚═════╝░░╚════╝░╚═════╝░%n");
        System.out.format(espacio+"                                                                                               %n");
        System.out.format(espacio+"     ░█████╗░           ██╗░░░██╗███████╗██████╗░███╗░░░███╗██╗░░░██╗████████╗███████╗███╗░░██╗%n");
        System.out.format(espacio+"     ██╔══██╗           ██║░░░██║██╔════╝██╔══██╗████╗░████║██║░░░██║╚══██╔══╝██╔════╝████╗░██║%n");
        System.out.format(espacio+"     ███████║           ╚██╗░██╔╝█████╗░░██████╔╝██╔████╔██║██║░░░██║░░░██║░░░█████╗░░██╔██╗██║%n");
        System.out.format(espacio+"     ██╔══██║           ░╚████╔╝░██╔══╝░░██╔══██╗██║╚██╔╝██║██║░░░██║░░░██║░░░██╔══╝░░██║╚████║%n");
        System.out.format(espacio+"     ██║░░██║           ░░╚██╔╝░░███████╗██║░░██║██║░╚═╝░██║╚██████╔╝░░░██║░░░███████╗██║░╚███║%n");
        System.out.format(espacio+"     ╚═╝░░╚═╝           ░░░╚═╝░░░╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝░╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝%n");

    }

    public static void menu()
    {
    System.out.println("                                         __________________________________" );
    System.out.println("                                         |    ____  ____  ____  ____      |");
    System.out.println("                                         |    ||M ||||E ||||N ||||U ||    |  ");
    System.out.println("                                         |    ||__||||__||||__||||__||    | ");
    System.out.println("                                         |    |/__\\||/__\\||/__\\||/__\\|    | ");
    System.out.println("                             ____________|                                |____________");
    System.out.println("	                                 |                                                           |");
    System.out.println("	                                 |                 INGRESE UNA OPCIÓN:           		         |");
    System.out.println("	                                 |                 1. Jugar                      	           |");
    System.out.println("	                                 |                 2. Puntajes           			               |");
    System.out.println("	                                 |                 3. Escuchar               			           |");
    System.out.println("	                                 |                 4. Canciones              		             |");
    System.out.println("	                                 |                 5. Letras  		                           |");
    System.out.println("	                                 |                 6. Ayuda					                         |");
    System.out.println("	                       |___________________________________________________________|");


    }
}
