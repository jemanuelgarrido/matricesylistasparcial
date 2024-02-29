package org.example;



        import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrices miMatriz = new Matrices(matriz);

        int fila = 1;
        int columna = 1;

        List<int[]> posicionesAdyacentes = miMatriz.encontrarPosicionesAdyacentes(fila, columna);
        System.out.println("Posiciones adyacentes a (" + fila + "," + columna + "):");
        for (int[] posicion : posicionesAdyacentes) {
            System.out.println("(" + posicion[0] + "," + posicion[1] + ")");
        }
    }
}
