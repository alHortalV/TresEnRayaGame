package com.juego.tresenraya;

import javax.swing.JOptionPane;

class Tablero {
    // Constantes que tendrán los jugadores
    private static final int VACIO = 0; // No está el hueco seleccionado
    private static final int JUGADOR1 = 1; // X
    private static final int JUGADOR2 = 2; // O

    // Tablero
    private int[][] tablero; // Consta de 3 filas y 3 columnas
    private int turnoActual; // Para ver a que jugador le toca
    private boolean partidaTerminada; // Para comprobar si la partida ha terminado

    public int getTurnoActual() {
        return turnoActual;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public synchronized boolean cambiarJugada(int fila, int columna) {
        boolean jugadaValida = true;
        if (partidaTerminada || tablero[fila][columna] != VACIO) {
            jugadaValida = false; // En el caso de que la partida haya terminado o haya un hueco ocupado
        }

        // Actualizamos el tablero con el turno del jugador
        tablero[fila][columna] = turnoActual;

        // Comprobamos si se ha terminado la partida
        if (comprobarVictoria(turnoActual)) {
            JOptionPane.showMessageDialog(null, "Ha ganado el jugador " + turnoActual);
            partidaTerminada = true;
        }
        if (comprobarEmpate()) {

            JOptionPane.showMessageDialog(null, "EMPATE");
            partidaTerminada = true;
        }
        // Cambiar de turno
        if (!(turnoActual == JUGADOR1))
            turnoActual = JUGADOR1;
        turnoActual = JUGADOR2;

        return jugadaValida; // Devolvemos si la jugada ha sido válida o no
    }

    public boolean comprobarVictoria(int jugador) {
        boolean victoria = false;
        // Se hará un bucle para comprobar las posibles formas de ganar
        for (int i = 0; i < 3; i++) {
            // Filas
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                victoria = true;
            }
            // Columnas
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                victoria = true;
            }
        }

        // Diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            victoria = true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            victoria = true;
        }

        return victoria;
    }

    public boolean comprobarEmpate() {
        boolean empate = true;

        // Bucle creado para recorrer el tablero
        // Se comprobará que todos los huecos están ocupados y que no se ha ganado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == VACIO)
                    empate = false;
            }
        }
        return empate;
    }

    public boolean isPartidaTerminada() {
        return partidaTerminada;
    }
}