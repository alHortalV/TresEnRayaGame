# Tres en Raya

Este proyecto es una implementación gráfica del clásico juego "Tres en Raya" utilizando **Java Swing** y gestión de concurrencia con hilos y estructuras concurrentes como **`ReentrantLock`**, **`Condition`** y **`AtomicReferenceArray`**.

## Componentes

El juego consta de los siguientes componentes principales:

- **Interfaz Gráfica (GUI)**: Utiliza Java Swing para mostrar el tablero de juego y permitir la interacción con los jugadores.
- **Lógica del Juego**: Contiene las clases que gestionan el estado del tablero, el turno de los jugadores, la detección de victorias y el manejo de empate.
- **Concurrencia**: Usamos hilos para gestionar los turnos de los jugadores, y estructuras como **`ReentrantLock`** y **`Condition`** para sincronizar el acceso a los recursos compartidos.

## Estructura Concurrente

El juego implementa varias estructuras concurrentes para gestionar los turnos y el acceso al tablero. A continuación se describen las principales estructuras:

### `ReentrantLock` y `Condition`

El juego utiliza **`ReentrantLock`** junto con **`Condition`** para garantizar que solo un jugador pueda realizar su jugada en el tablero en un momento determinado. Esto se utiliza en el método `cambiarJugada`, que verifica si es el turno del jugador antes de permitirle realizar una jugada. Si no es su turno, el hilo espera hasta que la condición se cumpla.

### `AtomicReferenceArray`

El **`AtomicReferenceArray`** se utiliza para manejar el estado del tablero de forma segura en un entorno multihilo. Cada casilla del tablero se representa como un elemento en este array, permitiendo que los jugadores accedan y actualicen las casillas sin interferir entre sí.

## Descripción de la Estructura

El proyecto está organizado en varias clases que interactúan entre sí para crear la experiencia completa del juego:

- **`GUI_tablero`**: Clase principal que maneja la interfaz gráfica. Contiene la creación de la ventana del juego y la actualización de la interfaz cuando los jugadores realizan una jugada.
- **`Tablero`**: Gestiona el estado del tablero, controla las jugadas y verifica si un jugador ha ganado o si hay empate.
- **`Jugador`**: Representa a un jugador en el juego, con su símbolo (X o O). Esta clase extiende `Thread` para permitir la ejecución concurrente de los jugadores.

## Introducción

Este proyecto es una implementación del clásico juego **Tres en Raya** con características adicionales que lo hacen más interesante y adecuado para ser jugado por dos jugadores de manera concurrente. Los jugadores pueden interactuar con la interfaz gráfica para realizar sus jugadas y ver en tiempo real los cambios en el tablero.

## Casos de Uso

1. **Juego de dos jugadores**: Los jugadores pueden alternarse para realizar sus jugadas en el tablero. Cada jugador selecciona un espacio vacío en el tablero para colocar su símbolo (X o O).
2. **Interfaz gráfica interactiva**: El tablero es visualmente atractivo, y los jugadores pueden ver en todo momento su turno y el estado del juego (victoria, empate, etc.).
3. **Sincronización de jugadas**: El uso de **`ReentrantLock`** y **`Condition`** asegura que los jugadores no interfieran con el turno del otro.

## Métodos de Interés

| Método                                      | Descripción                                                                 | Estructura Concurrente         |
|---------------------------------------------|-----------------------------------------------------------------------------|--------------------------------|
| `cambiarJugada(int fila, int columna, int jugador)` | Permite a un jugador realizar una jugada en el tablero. Verifica si es su turno y si la jugada es válida. | `ReentrantLock`, `Condition`, `AtomicReferenceArray` |
| `comprobarVictoria(int jugador)`           | Comprueba si el jugador actual ha ganado la partida.                       | -                              |
| `comprobarEmpate()`                        | Verifica si la partida ha terminado en empate.                             | -                              |
| `isPartidaTerminada()`                     | Devuelve el estado de la partida (si ha terminado o no).                   | -                              |
| `reiniciarPartida(JButton[] botones)`      | Reinicia el tablero y el estado de la partida.                             | -                              |
| `incrementarVictoria(int jugador)`         | Incrementa el contador de victorias del jugador correspondiente.           | -                              |

## Descripción de los Ficheros del Proyecto

- **`GUI_tablero.java`**: Esta clase contiene la interfaz gráfica del juego. Se inicializa con un tablero de 3x3 y botones que representan las casillas del tablero. Los jugadores interactúan con los botones para hacer sus jugadas. También se muestra el turno actual y el logo del IES Zaidín.
  
- **`Tablero.java`**: La clase que gestiona el estado del tablero y la lógica del juego. Almacena el estado de cada casilla utilizando un **`AtomicReferenceArray`** y gestiona las jugadas, las victorias, y el control del turno.
  
- **`Jugador.java`**: Representa a un jugador. Cada jugador tiene un símbolo (X o O) y ejecuta su lógica en un hilo separado para gestionar su turno de manera concurrente. La clase extiende **`Thread`** para permitir que cada jugador se ejecute en su propio hilo.

## Cómo Ejecutar el Proyecto

1. **Instalar JDK**: Asegúrate de tener instalada una versión de Java (JDK) 8 o superior.
2. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/alHortalV/TresEnRayaGame.git

