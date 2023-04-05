package metodos;

import java.util.Scanner;

public class preguntas {
    public static void main(String args[]) {
    
    }
    public static int puntos (String letra[]) {
        int i = 0;
        int correctas = 0;
        String respuestaU = "";
        Scanner entrada = new Scanner (System.in);
        respuestaU = Escaner.nextLine ();
        
        for (i = 0;i<=letra.length;i++) {
            Randoms.random_letra(letra);
            System.out.print(letra);
            entrada.nextLine();
            respuestaU = entrada.nextLine();
            if (Randoms.respuesta==respuestaU){
                correctas++;
            }
        }
        
        return correctas;
    }
}