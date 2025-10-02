package desafioProgrEstructurada;

public class ChadQuestRPG {
    public static void main(String[] args) {
    int[] puntosPorMision = new int[5];//5 misiones 
    int total = 0;
    // 3 misiones y su puntaje
    puntosPorMision[0] = 50;
    puntosPorMision[1] = 80;
    puntosPorMision[2] = 60;

    for (int i = 0; i < 3; i++) {
        total += puntosPorMision[i];
    }

    System.out.println("Puntos acumulados hasta ahora: " + total);

    puntosPorMision[3] = 10;
    puntosPorMision[4] = 90;

    for (int i = 3; i < 5; i++) {
        total += puntosPorMision[i];
    }

    System.out.println("Puntos acumulados en total mision 4 y 5 : " + total);

    for (int i = 1; i < 5; i++) {
        total += puntosPorMision[i];
    }
    System.out.println("Puntos acumulados en total : " + total);

    String mensajeChad = ( total > 300 ) ?"¡Felicidades! Sos un verdadero Chad del RPG" : "Te falta entrenamiento, joven aprendiz...";
    System.out.println(mensajeChad);


    int puntajeMayor = puntosPorMision [0];
    int posicionMision = 0;

    for (int i = 0; i < puntosPorMision.length; i++) {
      
        if (puntosPorMision[i] > puntajeMayor) {
            puntajeMayor = puntosPorMision[i];
            posicionMision = i;
            }
        }

    posicionMision = posicionMision +1;
    System.out.println("Tu mejor desempeño fue en la mision " + posicionMision + " con " + puntajeMayor + " puntos.");

    boolean misionFallida = false;
    int i = 0;

    while (i < puntosPorMision.length && !misionFallida) {
        if (puntosPorMision[i] == 0) {
        misionFallida = true;
    }
    i++;
}
    if (misionFallida) {
    System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
}
     
int puntajeMinimo = puntosPorMision[0];
int puntajeMaximo = puntosPorMision[0];

int j = 1;
while (j < puntosPorMision.length) {
    if (puntosPorMision[j] < puntajeMinimo) {
        puntajeMinimo = puntosPorMision[j];
    }
    if (puntosPorMision[j] > puntajeMaximo) {
        puntajeMaximo = puntosPorMision[j];
    }
    j++;
}

int diferencia = puntajeMaximo - puntajeMinimo;

if (diferencia < 20) {
    System.out.println("¡Ejecución constante! Sos el sueño de un arquitecto de software.");
}
int misionesAltas = 0;
int k = 0;

while (k < puntosPorMision.length) {
    if (puntosPorMision[k] > 75) {
        misionesAltas++;
    }
    k++;
}

if (misionesAltas >= 3) {
    System.out.println("Nivel desbloqueado: Mini Stone Chad");
}
System.out.println("\n===== Tabla de Puntuación Final =====");
System.out.printf("%-10s %-10s %-20s\n", "Misión", "Puntaje", "Puntaje Acumulado");

int acumulado = 0;
int m = 0;

while (m < puntosPorMision.length) {
    acumulado += puntosPorMision[m];
    System.out.printf("%-10s %-10d %-20d\n", "Misión " + (m + 1), puntosPorMision[m], acumulado);
    m++;
}

System.out.println("-----------------------------------------");
System.out.println("Total Final: " + acumulado + " puntos");

    
    }
    
}
