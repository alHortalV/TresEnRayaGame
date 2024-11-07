# Juego Tres en Raya

## Introducción
Este proyecto es una implementación del clásico juego "Tres en Raya" utilizando el componente `Exchanger` para gestionar la comunicación entre los jugadores. El juego permite a dos jugadores alternar turnos para colocar sus marcas en un tablero de 3x3, y el uso de `Exchanger` facilita la sincronización de los movimientos.

## Componentes
El sistema está compuesto por los siguientes hilos:

1. **Hilo del Jugador 1**: Controla las acciones del primer jugador.
2. **Hilo del Jugador 2**: Controla las acciones del segundo jugador.
3. **Hilo del Tablero**: Gestiona el estado del tablero y verifica las condiciones de victoria.

## Estructura Concurrente
El juego utiliza una estructura de hilos donde cada jugador actúa en su propio hilo. La comunicación entre los hilos se realiza a través de la clase `Exchanger`, que permite a los jugadores intercambiar información sobre sus movimientos y el estado del juego.

## Descripción de la Estructura
La estructura del sistema está diseñada para permitir que los jugadores realicen sus movimientos de manera alternada. Cada vez que un jugador realiza un movimiento, se utiliza `Exchanger` para notificar al otro jugador y actualizar el estado del tablero. Esto asegura que el juego se desarrolle de manera fluida y sin conflictos.

## Casos de Uso
- **Juego de Dos Jugadores**: Permite a dos jugadores competir entre sí en un entorno controlado.
- **Verificación de Ganador**: Comprueba si hay un ganador después de cada movimiento.
- **Reinicio del Juego**: Permite reiniciar el juego una vez que se ha completado.

## Tabla con los Métodos de Interés

| Método                  | Descripción                                                  |
|------------------------|--------------------------------------------------------------|
| `exchange()`           | Intercambia información sobre el movimiento entre los jugadores. |
| `makeMove()`           | Realiza un movimiento en el tablero.                        |
| `checkWinner()`        | Verifica si hay un ganador después de cada movimiento.      |
| `resetGame()`          | Reinicia el estado del juego para una nueva partida.        |

## Descripción de los Ficheros del Proyecto

- **Main.java**: Clase principal que inicia el juego y gestiona los hilos de los jugadores.
- **Player.java**: Clase que representa a un jugador, con métodos para realizar movimientos y comunicarse con el otro jugador.
- **Board.java**: Clase que gestiona el estado del tablero y verifica las condiciones de victoria.
- **README.md**: Este archivo que describe el proyecto y su funcionamiento.

## Requisitos
- Java 8 o superior.
- Biblioteca para la gestión de hilos y sincronización.

## Cómo Ejecutar el Proyecto
1. Clona el repositorio.
2. Compila el proyecto usando `javac Main.java`.
3. Ejecuta el juego con `java Main`.

## Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, por favor abre un issue o envía un pull request.

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
