package desafioPOO;

public class Main {
      public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", 85, 55, 75);
        Estudiante e2 = new Estudiante("María", 95, 90, 92);
        Estudiante e3 = new Estudiante("Lucas", 60, 45, 55);
        Estudiante e4 = new Estudiante("Ana", 100, 80, 100);

        Estudiante[] grupo = { e1, e2, e3, e4 };

        for (Estudiante e : grupo) {
            System.out.println("Estudiante: " + e.getNombre());
            System.out.println("Total: " + e.total() + " | Promedio: " + e.promedio());
            System.out.println(e.nivel());
            System.out.println(e.mayorDiferencia());
            System.out.println("¿Progresivo?: " + (e.esProgresivo() ? "Sí 📈" : "No"));
            System.out.println("Notas ordenadas:");
            for (int nota : e.obtenerNotasOrdenadas()) {
                System.out.print(nota + " ");
            }
            System.out.println("\n-------------------------");
        }

        CodeChadAcademia academia = new CodeChadAcademia(grupo);
        academia.mostrarRanking();
    }
}
    

