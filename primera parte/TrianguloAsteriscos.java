import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de filas
        System.out.print("Ingrese el número de filas para el triángulo: ");
        int filas = scanner.nextInt();

        // Bucle para imprimir el triángulo
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        scanner.close();
    }
}
