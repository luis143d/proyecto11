import java.util.Random;

public class ejercicio03 {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(31) + 20;
        }
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int numero : arreglo) {
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        System.out.print("Arreglo: ");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
}
