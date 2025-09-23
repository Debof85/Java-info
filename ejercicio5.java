public class ejercicio5 {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 5;
        int sumaNumero = numero1+numero2;
        System.out.println("La suma de los dos numeros es "+ sumaNumero);

        if (numero2 != 0) {
            if (numero1 % numero2 == 0) {
                System.out.println("El numero "+numero1 + " es divisible por "+ numero2);
            } else { System.out.println("El numero "+ numero1 + " no es divisible por "+ numero2);
            }
            
        } else { System.out.println("No se puede dividir por 0");
        }
    }
}
