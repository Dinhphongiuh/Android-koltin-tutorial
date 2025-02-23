package com.example.helloandroid

fun main() {
    var computerChoice = "";
    var playerChoice = "";
    println("Rock, Paper or Scissors");
    playerChoice = readln();

    val randomNumber = (1..3).random();

    when (randomNumber) {
        1 -> computerChoice = "Rock";
        2 -> computerChoice = "Paper";
        3 -> computerChoice = "Scissors";
        else -> "Invalid choice";
    }

    val winner = when {
        playerChoice == computerChoice -> "Tier"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    when (winner) {
        "Tier" -> println("It's a tie");
        "Player" -> println("Player wins");
        else -> println("Computer wins");
    }
}
