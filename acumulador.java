import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        double acumulador = 0;

        
        for (int i = 1; i <= 15; i++) {
            acumulador += (double)(numero1 * numero2) / i;
        }

       
        System.out.println("El resultado de la acumulación es: " + acumulador);
    }
}
