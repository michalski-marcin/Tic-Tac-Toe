# Tic-Tac-Toe Game in Java

## Introduction

This project is a simple console-based Tic-Tac-Toe game implemented in Java. The game allows two players to play against each other, taking turns to mark the spaces in a 3x3 grid. The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins the game.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Examples](#examples)
- [Roadmap](#roadmap)
- [License](#license)
- [Author](#author)


## Features

- **Player vs Player Mode**: Two players can play the game alternately.
- **Board Display**: The current state of the board is displayed after each turn.
- **Turn Management**: The game manages turns and checks for valid moves.
- **Game Restart**: Players can start a new game after finishing a current one.


## Project structure

- **Board.java**: Handles the board operations like setting and retrieving marks.
- **Game.java**: Manages the game logic, such as starting a new game and processing turns.
- **Main.java**: The main class that initializes and starts the game.
- **Player.java**: Defines player characteristics and actions during the game.
- **README.md**: Contains the project documentation.
- **LICENSE**: Contains the licensing information for the project.


## Installation

To set up this project locally, follow the steps below:

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/tic-tac-toe-java.git
   ```
3. **Navigate to the project directory**:
   ```bash
   cd tic-tac-toe-java
   ```
5. **Compile the Java Files**:
    ```bash
    javac Main.java Board.java Game.java Player.java
6. **Run the Application**:
    ```bash
    java Main


## Examples
```text
Welcome to Tic Tac Toe game!
Do you want to start new game? Y/N
Player's one name: Alice
Second player's name: Bob

   1   2   3 
A    |   |   
  ---|---|---
B    |   |   
  ---|---|---
C    |   |   

Alice's turn
Select field: (i.e. A2, c3 etc..)
A1
   1   2   3 
A  O |   |   
  ---|---|---
B    |   |   
  ---|---|---
C    |   |   

-----------------------------

Alice's turn
Select field: (i.e. A2, c3 etc..)
c3
   1   2   3
A  O | X | X
  ---|---|---
B    | O |
  ---|---|---
C    |   | O

Alice won the game!

Do you want to start new game? Y/N
```

## Roadmap

- **Player vs. CPU**: This option lets you choose your opponent, allowing you to either play against the computer or another player.
- **JavaFX**: Frontend created using JavaFX, to ensure a smooth and engaging user experience.


## License 

This project is licensed under the [MIT](https://github.com/michalski-marcin/Tic_Tac_toe/blob/master/LICENSE) License.


## Author

- [GitHub](https://www.github.com/michalski-marcin)
- [LinkedIn](https://www.linkedin.com/in/michalski-marcin)
- [Webpage](https://www.michalski.pro)

```
