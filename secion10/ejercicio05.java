 import java.util.Arrays;
import java.util.Random;

public class ejercicio05{
    public static void main(String[] args) {
        int[] arreglo = generarArreglo(15, 20, 30);
        System.out.println("Arreglo: " + Arrays.toString(arreglo));

        int moda = encontrarModa(arreglo);
        System.out.println("Moda: " + moda);
    }
    public static int[] generarArreglo(int longitud, int min, int max) {
        Random random = new Random();
        return random.ints(longitud, min, max + 1).toArray();
    }
    public static int encontrarModa(int[] arreglo) {
        int[] conteo = new int[11];
        for (int numero : arreglo) {
            conteo[numero - 20]++;
        }
        int moda = 0;
        int maxFrecuencia = 0;
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > maxFrecuencia) {
                maxFrecuencia = conteo[i];
                moda = i + 20;
            }
        }
        return moda;
    }
}
