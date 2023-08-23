import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje){
        super(mensaje);
    }
}
public class NumeroNegativoExcepcion{
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa un valor númerico:");
            double numero = sc.nextDouble();

            if (numero >= 0) {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raiz cuadra del número es: " + raizCuadrada);
            } else {
                throw new NumeroNegativoException("Introduciste un número negativo");
            }
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());

        }
    }
}
