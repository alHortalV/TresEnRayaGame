package com.juego.tresenraya;

/**
 *
 * @author alejandro
 */
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import javax.swing.JOptionPane;

public class Tablero {
    private static final int VACIO = 0; // Huecos del tablero
    private static final int JUGADOR1 = 1; // X
    private static final int JUGADOR2 = 2; // O

    public static int getJugador1() {
        return JUGADOR1;
    }

    public static int getJugador2() {
        return JUGADOR2;
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    private AtomicReferenceArray<Integer> tablero; // Tablero de 3x3
    private int turnoActual; // Para ver a qué jugador le toca

    private boolean partidaTerminada; // Para comprobar si la partida ha terminado

    private final ReentrantLock lock; // Bloqueo para sincronización
    private final Condition esperaTurno; // Condición para esperar el turno

    // Constructor
    public Tablero() {
        // Inicializamos el tablero con el valor VACIO
        this.tablero = new AtomicReferenceArray<>(new Integer[9]); // 3x3
        for (int i = 0; i < 9; i++) {
            tablero.set(i, VACIO);
        }
        this.turnoActual = JUGADOR1; // Empieza el jugador 1
        this.partidaTerminada = false;
        this.lock = new ReentrantLock(); // Inicializamos el ReentrantLock
        this.esperaTurno = lock.newCondition(); // Creamos la condición de espera
    }

    public boolean cambiarJugada(int fila, int columna, int jugador) {
        lock.lock(); // Bloqueamos el acceso concurrente

        try {
            // Aseguramos que solo el jugador correspondiente haga su jugada
            while (turnoActual != jugador) {
                esperaTurno.await(); // Si no es su turno, el hilo se bloquea aquí
            }

            boolean jugadaValida = true;
            int index = fila * 3 + columna; // Convertir coordenadas 2D a 1D para comprobar si la partida ha terminado
            if (partidaTerminada || tablero.get(index) != VACIO) {
                jugadaValida = false; // En el caso de que la partida haya terminado o haya un hueco ocupado
            }

            // Actualizamos el tablero con el turno del jugador
            if (jugadaValida) {
                tablero.set(index, jugador); // Usamos AtomicReferenceArray para establecer el valor

                // Comprobamos si se ha terminado la partida
                if (comprobarVictoria(jugador)) {
                    JOptionPane.showMessageDialog(null, "Ha ganado el jugador " + jugador);
                    partidaTerminada = true;
                }

                if (comprobarEmpate()) {
                    JOptionPane.showMessageDialog(null, "EMPATE");
                    partidaTerminada = true;
                }

                // Cambiar de turno
                turnoActual = (turnoActual == JUGADOR1) ? JUGADOR2 : JUGADOR1;
                esperaTurno.signalAll(); // Despertamos al otro jugador (para que juegue)
            }

            return jugadaValida; // Devolvemos si la jugada ha sido válida o no
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaurar el estado de la interrupción
            return false;
        } finally {
            lock.unlock(); // Desbloqueamos para que otro hilo pueda acceder
        }
    }

    public boolean comprobarVictoria(int jugador) {
        boolean victoria = false;
        // Se hará un bucle para comprobar las posibles formas de ganar
        for (int i = 0; i < 3; i++) {
            // Filas
            if (tablero.get(i * 3) == jugador && tablero.get(i * 3 + 1) == jugador
                    && tablero.get(i * 3 + 2) == jugador) {
                victoria = true;
            }
            // Columnas
            if (tablero.get(0 + i) == jugador && tablero.get(3 + i) == jugador && tablero.get(6 + i) == jugador) {
                victoria = true;
            }
        }

        // Diagonales
        if (tablero.get(0) == jugador && tablero.get(4) == jugador && tablero.get(8) == jugador) {
            victoria = true;
        }
        if (tablero.get(2) == jugador && tablero.get(4) == jugador && tablero.get(6) == jugador) {
            victoria = true;
        }

        return victoria;
    }

    public boolean comprobarEmpate() {
        boolean empate = true;

        // Bucle creado para recorrer el tablero
        // Se comprobará que todos los huecos están ocupados y que no se ha ganado
        for (int i = 0; i < 9; i++) {
            if (tablero.get(i) == VACIO) {
                empate = false; // Si hay al menos un hueco vacío, no hay empate
                break; // No es necesario seguir buscando
            }
        }
        return empate && !partidaTerminada; // Debe ser empate y la partida no debe haber terminado
    }

    public boolean isPartidaTerminada() {
        return partidaTerminada;
    }
    
    public void reiniciarPartida() {
        // Reinicia el tablero
        for (int i = 0; i < 9; i++) {
            tablero.set(i, VACIO);
        }
        // Reinicia el turno
        turnoActual = JUGADOR1; // Empieza el jugador 1
        // Reinicia el estado de la partida
        partidaTerminada = false;
    }
}