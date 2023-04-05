public class Randoms {
    public static void main(String args[]) {
        String letra[] = {"a","s","d","f","g","h","j","k","l","ñ"};
        
        int prueba = 0;
        prueba = random_letra(letra);
        
    }
    
    public static int random_letra(String letra[]) {
        int random = 0;
        int mayor = 0;
        String respuesta = "";

        mayor = letra.length;
        random =(int)Math.floor(Math.random()*(mayor-0+1)+0);
        respuesta = letra[random];
        letra[random] = "???";
        
        return random;
    }
}