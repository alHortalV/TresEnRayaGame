# Tres en Raya

## Descripción del Proyecto
Este proyecto es una implementación gráfica del juego "Tres en Raya" utilizando Java Swing con estructuras concurrentes. El juego permite que dos jugadores compitan entre sí, teniendo un registro de sus victorias y proporcionando una interfaz simple para jugar.

## Estructura Concurrente Utilizada
El juego utiliza estructuras concurrentes para manejar el acceso al tablero de juego y garantizar que los jugadores no interfieran entre sí durante sus turnos. A continuación se presenta una tabla que describe los métodos utilizados, su propósito y las estructuras concurrentes empleadas.

| Método                                      | Descripción                                                                 | Estructura Concurrente         |
|---------------------------------------------|-----------------------------------------------------------------------------|--------------------------------|
| `cambiarJugada(int fila, int columna, int jugador)` | Permite a un jugador realizar una jugada en el tablero. Verifica si es su turno y si la jugada es válida. | `ReentrantLock`, `Condition`, `AtomicReferenceArray` |
| `comprobarVictoria(int jugador)`           | Comprueba si el jugador actual ha ganado la partida.                       | -                              |
| `comprobarEmpate()`                        | Verifica si la partida ha terminado en empate.                             | -                              |
| `isPartidaTerminada()`                     | Devuelve el estado de la partida (si ha terminado o no).                   | -                              |
| `reiniciarPartida(JButton[] botones)`      | Reinicia el tablero y el estado de la partida.                             | -                              |
| `incrementarVictoria(int jugador)`         | Incrementa el contador de victorias del jugador correspondiente.           | -                              |

## Uso
- Cuando la aplicación se inicie, se mostrará el tablero del juego.
- Los jugadores deberán de hacer clic en los espacios reservados para colocar sus símbolos (X o O).
- Se notificará el ganador de la partida o el empate de la misma.
- Los contadores de victorias para cada jugador se mostrarán y se guardarán en un archivo llamado `Victorias.txt` al cerrar la aplicación.
