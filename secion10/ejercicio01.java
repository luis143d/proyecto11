import java.util.Random;
public class ejercicio01 {
    public static void main(String[] args) {
        int[] arreglo1 = generarArreglo(10);
        int[] arreglo2 = generarArreglo(10);
        System.out.println("Arreglo 1:");
        imprimirArreglo(arreglo1);
        System.out.println("Arreglo 2:");
        imprimirArreglo(arreglo2);
        int[] arregloSuma = sumarArreglos(arreglo1, arreglo2);
        System.out.println("Arreglo Suma:");
        imprimirArreglo(arregloSuma);
    }
    public static int[] generarArreglo(int longitud) {
        int[] arreglo = new int[longitud];
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = random.nextInt(100) + 1; 
        }
        return arreglo;
    }
    public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
        int longitud = arreglo1.length;
        int[] arregloSuma = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arregloSuma[i] = arreglo1[i] + arreglo2[i];
        }
        return arregloSuma;
    }
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
