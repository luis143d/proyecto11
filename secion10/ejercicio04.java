import java.util.Arrays;
import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        int[] numeros = new int[6];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
        }

        double media = Arrays.stream(numeros).average().orElse(0);
        double mediana = calcularMediana(numeros);

        System.out.println("La media es: " + media);
        System.out.println("La mediana es: " + mediana);
    }

    public static double calcularMediana(int[] numeros) {
        Arrays.sort(numeros);
        int n = numeros.length;
        return (n % 2 == 0) ? (numeros[n / 2 - 1] + numeros[n / 2]) / 2.0 : numeros[n / 2];
    }
}
