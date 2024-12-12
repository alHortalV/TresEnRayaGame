package com.juego.tresenraya;

/**
 *
 * @author alejandro
 */
public class Jugador extends Thread {
    private final String simbolo;
    private Tablero tablero;

    public Jugador(String simbolo, Tablero tablero) {
        this.simbolo = simbolo;
        this.tablero = tablero;
    }

    public String getSimbolo() {
        return simbolo;
    }

    @Override
    public void run() {
        while (!tablero.isPartidaTerminada()) {
        }
    }
}