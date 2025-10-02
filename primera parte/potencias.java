import java.util.Scanner;

public class potencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        
        int cuadrado = (int) Math.pow(numero, 2);
        int cubo = (int) Math.pow(numero, 3);

        
        System.out.println("El número es: " + numero);
        System.out.println("Su potencia al cuadrado es: " + cuadrado);
        System.out.println("Su potencia al cubo es: " + cubo);

        scanner.close();
    }
}

    

