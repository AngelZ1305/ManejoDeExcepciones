import java.util.Scanner;

public class Main {
    public static char caracterEn(String palabra, int posicion) throws Exception{
        int longitudPalabra = palabra.length();
        if (posicion >= 0 && posicion < longitudPalabra){
            return palabra.charAt(posicion);
        }
        else {
            throw new Exception("La posición esta fuera de los limites de la cadena");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");

        String lectTeclado = sc.nextLine();
        try {
            char caracter7 = caracterEn(lectTeclado, 7);
            System.out.println("El caracter 7 de la palabra " + lectTeclado + " es: "+caracter7);
        }catch (Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }

}
