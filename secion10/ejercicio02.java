import java.util.Arrays;
import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        try (
        Scanner scanner = new Scanner(System.in)) {
            double[] notas = new double[6];
            for (int i = 0; i < 6; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }
            Arrays.sort(notas);
            double[] mejoresNotas = Arrays.copyOfRange(notas, 2, 6);
            double suma = 0;
            for (double nota : mejoresNotas) {
                suma += nota;
            }
            int promedio = (int) (suma / 4);
            System.out.println("El promedio de las cuatro mejores notas es: " + promedio);
        }
    }
}
