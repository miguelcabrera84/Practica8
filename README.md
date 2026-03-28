# Videojuego - Sistema de Niveles con Polimorfismo

## Descripción del Proyecto

Este proyecto es una implementación en Java de un sistema de videojuego que demuestra los conceptos fundamentales de la Programación Orientada a Objetos (POO), especialmente el **polimorfismo**. El sistema permite gestionar niveles de juego con obstáculos, checkpoints, elementos dinámicos (personajes y utilerías) y un inventario de objetos.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases e interfaces:

### Interfaces
- **`Inventariable`** - Define elementos que pueden ser almacenados en el inventario
- **`Destruible`** - Define elementos que pueden ser destruidos
- **`ElementoDinamico`** - Define elementos que pueden moverse en el nivel

### Clases Concretas
- **`Arma`** - Implementa `Inventariable`, representa armas que puede usar el jugador
- **`Recompensa`** - Implementa `Inventariable`, representa recompensas obtenibles
- **`Obstáculo`** - Implementa `Destruible`, representa obstáculos en el nivel
- **`CheckPoint`** - Representa puntos de control para guardar progreso
- **`Personaje`** - Implementa `Destruible` y `ElementoDinamico`, representa al jugador
- **`Utileria`** - Implementa `ElementoDinamico`, representa objetos útiles
- **`Inventario`** - Gestiona la colección de objetos `Inventariable`
- **`Nivel`** - Contiene todos los elementos del juego (obstáculos, checkpoints, elementos dinámicos, inventario)
- **`Main`** - Clase principal que ejecuta el juego

## Diagrama de Clases
