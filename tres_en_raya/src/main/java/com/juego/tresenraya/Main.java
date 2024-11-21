package com.juego.tresenraya;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        Jugador jugador1 = new Jugador("X");
        Jugador jugador2 = new Jugador("O");

        jugador1.start(); // Inicia el hilo del jugador 1
        jugador2.start(); // Inicia el hilo del jugador 2
    }
}
