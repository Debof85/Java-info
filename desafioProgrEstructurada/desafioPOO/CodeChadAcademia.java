package desafioPOO;

public class CodeChadAcademia {
 private Estudiante[] estudiantes;

    public CodeChadAcademia(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String mejorPromedio() {
        double max = -1;
        String nombre = "";
        for (Estudiante e : estudiantes) {
            if (e.promedio() > max) {
                max = e.promedio();
                nombre = e.getNombre();
            }
        }
        return "🎓 Mejor promedio: " + nombre + " (" + max + ")";
    }

    public String masRegular() {
        double minDesv = Double.MAX_VALUE;
        String nombre = "";
        for (Estudiante e : estudiantes) {
            double desv = e.desviacionNotas();
            if (desv < minDesv) {
                minDesv = desv;
                nombre = e.getNombre();
            }
        }
        return " Más regular: " + nombre + " (desviación: " + String.format("%.2f", minDesv) + ")";
    }

    public String peorNota3() {
        int min = 101;
        String nombre = "";
        for (Estudiante e : estudiantes) {
            if (e.getNota(2) < min) {
                min = e.getNota(2);
                nombre = e.getNombre();
            }
        }
        return " Peor nota en la prueba 3: " + nombre + " (" + min + ")";
    }

    public void mostrarRanking() {
        System.out.println("===== RANKING FINAL =====");
        System.out.println(mejorPromedio());
        System.out.println(masRegular());
        System.out.println(peorNota3());
    }
}
