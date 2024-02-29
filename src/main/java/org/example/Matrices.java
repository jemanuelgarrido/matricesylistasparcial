package org.example;



import java.util.ArrayList;
import java.util.List;

    public class Matrices {

        private int[][] matriz;

        public Matrices(int[][] matriz) {
            this.matriz = matriz;
        }

        public List<int[]> encontrarPosicionesAdyacentes(int fila, int columna) {
            List<int[]> posicionesAdyacentes = new ArrayList<>();

            // Verificar posición arriba
            if (fila - 1 >= 0) {
                posicionesAdyacentes.add(new int[]{fila - 1, columna});
            }
            // Verificar posición abajo
            if (fila + 1 < matriz.length) {
                posicionesAdyacentes.add(new int[]{fila + 1, columna});
            }
            // Verificar posición izquierda
            if (columna - 1 >= 0) {
                posicionesAdyacentes.add(new int[]{fila, columna - 1});
            }
            // Verificar posición derecha
            if (columna + 1 < matriz[0].length) {
                posicionesAdyacentes.add(new int[]{fila, columna + 1});
            }

            return posicionesAdyacentes;
        }
    }


