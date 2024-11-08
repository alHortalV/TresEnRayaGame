package com.juego.tresenraya;

class Tablero {
    // Constantes que tendrán los jugadores
    private static final int VACIO = 0; // No está el hueco seleccionado
    private static final int JUGADOR1 = 1; // X
    private static final int JUGADOR2 = 2; // O

    // Tablero
    private int[][] tablero; // 3 filas y 3 columnas
    private int turnoActual; // Para ver a que jugador le toca
    private boolean partidaTerminada; // Para comprobar si la partida ha terminado

    public int getTurnoActual() {
        return turnoActual;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public synchronized boolean hacerJugada(int fila, int columna) {
        boolean jugadaValida = true;
        if (partidaTerminada || tablero[fila][columna] != VACIO) {
            jugadaValida = false; // En el caso de que la partida haya terminado o haya un hueco ocupado
        }

        // Actualizamos el tablero con el turno del jugador
        tablero[fila][columna] = turnoActual;

        // Comprobamos si se ha terminado la partida
        partidaTerminada = comprobarVictoria(turnoActual);

        // Cambiar de turno
        if (!(turnoActual == JUGADOR1))
            turnoActual = JUGADOR1;
        turnoActual = JUGADOR2;

        return jugadaValida; // Devolvemos si la jugada ha sido válida o no
    }

}