package desafioPOO; 

public class Estudiante {
    private String nombre;
    private int[] notas = new int[5];

    public Estudiante(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        calcularNotasFaltantes();
    }

    public void calcularNotasFaltantes() {
        notas[3] = (notas[1] < 60) ? 100 : notas[1];
        notas[4] = (notas[0] + notas[2] > 150) ? 95 : 70;
    }

    public boolean todasAprobadas() {
        for (int nota : notas) {
            if (nota < 60) return false;
        }
        return true;
    }

    public boolean ningunaAprobada() {
        for (int nota : notas) {
            if (nota >= 60) return false;
        }
        return true;
    }

    public int cantidadAprobadas() {
        int count = 0;
        for (int nota : notas) {
            if (nota >= 60) count++;
        }
        return count;
    }

    public String mayorDiferencia() {
        int maxDif = 0;
        int index = 0;
        for (int i = 0; i < notas.length - 1; i++) {
            int dif = Math.abs(notas[i] - notas[i + 1]);
            if (dif > maxDif) {
                maxDif = dif;
                index = i;
            }
        }
        return "Mayor salto fue de " + maxDif + " puntos entre la prueba " + (index + 1) + " y la prueba " + (index + 2) + ".";
    }

    public boolean esProgresivo() {
        for (int i = 0; i < notas.length - 1; i++) {
            if (notas[i] >= notas[i + 1]) return false;
        }
        return true;
    }

    public int[] obtenerNotasOrdenadas() {
        int[] ordenadas = notas.clone();
        for (int i = 0; i < ordenadas.length - 1; i++) {
            for (int j = 0; j < ordenadas.length - i - 1; j++) {
                if (ordenadas[j] < ordenadas[j + 1]) {
                    int temp = ordenadas[j];
                    ordenadas[j] = ordenadas[j + 1];
                    ordenadas[j + 1] = temp;
                }
            }
        }
        return ordenadas;
    }

    public int total() {
        int suma = 0;
        for (int nota : notas) suma += nota;
        return suma;
    }

    public double promedio() {
        return total() / 5.0;
    }

    public String nivel() {
        int t = total();
        if (t < 250) return "Normie total ";
        if (t < 350) return "Soft Chad";
        if (t < 450) return "Chad";
        return "Stone Chad definitivo ";
    }

    public double desviacionNotas() {
        double prom = promedio();
        double suma = 0;
        for (int nota : notas) {
            suma += Math.abs(nota - prom);
        }
        return suma / notas.length;
    }

    public int getNota(int index) {
        return notas[index];
    }

    public String getNombre() {
        return nombre;
    }
}
