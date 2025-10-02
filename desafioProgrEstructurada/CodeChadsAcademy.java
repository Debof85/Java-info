package desafioProgrEstructurada;

import java.util.Arrays;
import java.util.Random;

public class CodeChadsAcademy {

    public static void main(String[] args) {
        Random random = new Random();
        int[] examenes = new int[5];

        // 1era Parte: Generar notas
        examenes[0] = random.nextInt(101);
        examenes[1] = random.nextInt(101);
        examenes[2] = random.nextInt(101);
        examenes[3] = (examenes[1] < 60) ? 100 : examenes[1];
        examenes[4] = (examenes[0] + examenes[2] > 150) ? 95 : 70;

        System.out.println("Notas: " + Arrays.toString(examenes));

        // 2.1 Verificar aprobación
        int aprobadas = 0;
        for (int nota : examenes) if (nota >= 60) aprobadas++;

        if (aprobadas == 5) {
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (aprobadas == 0) {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        }

        // 2.2 Mayor salto entre pruebas
        int mayorSalto = 0, pos = 0;
        for (int i = 0; i < examenes.length - 1; i++) {
            int salto = Math.abs(examenes[i] - examenes[i + 1]);
            if (salto > mayorSalto) {
                mayorSalto = salto;
                pos = i;
            }
        }
        System.out.println("Mayor salto fue de " + mayorSalto + " puntos entre la prueba " + (pos + 1) + " y la prueba " + (pos + 2));

        // 2.3 Bonus por progreso
        boolean progresivo = true;
        for (int i = 0; i < examenes.length - 1; i++) {
            if (examenes[i] >= examenes[i + 1]) {
                progresivo = false;
                break;
            }
        }
        if (progresivo) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
        }

        // 2.4 Ordenar sin sort
        int[] ordenadas = Arrays.copyOf(examenes, examenes.length);
        for (int i = 0; i < ordenadas.length; i++) {
            for (int j = 0; j < ordenadas.length - 1; j++) {
                if (ordenadas[j] < ordenadas[j + 1]) {
                    int temp = ordenadas[j];
                    ordenadas[j] = ordenadas[j + 1];
                    ordenadas[j + 1] = temp;
                }
            }
        }
        System.out.println("Notas ordenadas de mayor a menor: " + Arrays.toString(ordenadas));

        // 2.5 Evaluación final
        int total = Arrays.stream(examenes).sum();
        System.out.print("Rango final: ");
        if (total < 250) System.out.println("Normie total 😢");
        else if (total < 350) System.out.println("Soft Chad");
        else if (total < 450) System.out.println("Chad");
        else System.out.println("Stone Chad definitivo 💪");

        // 2.6 Ranking entre 4 alumnos
        int[][] alumnos = new int[4][5];
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < 5; j++) {
                alumnos[i][j] = random.nextInt(101);
            }
        }

        int mejorAlumno = 0;
        double mejorPromedio = 0;
        int alumnoRegular = 0;
        int menorDesviacion = Integer.MAX_VALUE;
        int peorAlumno3 = 0;
        int peorNota3 = 101;

        for (int i = 0; i < alumnos.length; i++) {
            int suma = 0, max = alumnos[i][0], min = alumnos[i][0];
            for (int j = 0; j < 5; j++) {
                int nota = alumnos[i][j];
                suma += nota;
                if (nota > max) max = nota;
                if (nota < min) min = nota;
            }
            double promedio = suma / 5.0;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = i + 1;
            }
            int desviacion = max - min;
            if (desviacion < menorDesviacion) {
                menorDesviacion = desviacion;
                alumnoRegular = i + 1;
            }
            if (alumnos[i][2] < peorNota3) {
                peorNota3 = alumnos[i][2];
                peorAlumno3 = i + 1;
            }
        }

        System.out.println("Mejor promedio: Alumno " + mejorAlumno);
        System.out.println("Más regular: Alumno " + alumnoRegular);
        System.out.println("Peor en prueba 3: Alumno " + peorAlumno3 + " con " + peorNota3 + " puntos");
    }
}