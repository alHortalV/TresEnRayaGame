package com.juego.tresenraya;

public class Jugador extends Thread {
    private final String simbolo;
    private Tablero tablero;

    public Jugador(String simbolo) {
        this.simbolo = simbolo;
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