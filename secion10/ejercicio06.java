import java.util.Arrays;
import java.util.Random;

public class ejercicio06 {
    public static void main(String[] args) {
        int[][] matriz = generarMatriz(4, 3, 10, 30);
        int[] sumaColumnas = calcularSumaColumnas(matriz);

        System.out.println("Matriz:\n" + Arrays.deepToString(matriz));
        System.out.println("Suma de las columnas:\n" + Arrays.toString(sumaColumnas));
    }
    public static int[][] generarMatriz(int filas, int columnas, int min, int max) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matriz;
    }
    public static int[] calcularSumaColumnas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] sumaColumnas = new int[columnas];

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < filas; i++) {
                suma += matriz[i][j];
            }
            sumaColumnas[j] = suma;
        }

        return sumaColumnas;
    }
}
