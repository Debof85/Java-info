import java.util.Scanner;

public class nombreEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi edad es " + edad);

        scanner.close();
    }
}
