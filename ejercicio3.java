public class ejercicio3 {
    public static void main(String[] args) {
        int numero1 = 20 ;
        int numero2 = 2 ;
        int suma = numero1 + numero2;

    String paridad;
    if (suma % 2 == 0) {
        paridad = "par";
    } else { paridad = "impar";
    }
    System.out.println("El resultado es "+ suma +" y es "+ paridad);
    }
}
