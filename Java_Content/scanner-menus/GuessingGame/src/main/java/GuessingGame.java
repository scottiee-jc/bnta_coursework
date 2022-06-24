import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private Scanner scanner;
    private int secretNumber;
    private boolean guessedCorrectly;

    public GuessingGame(){
        this.scanner = new Scanner(System.in);
        this.secretNumber = new Random().nextInt(1, 101);
    }

    public void start(){
        System.out.println("Enter your name:");

        String userName = scanner.nextLine();

        System.out.println("Welcome to the game, " + userName + "!");

        this.guessedCorrectly = false;

        while (!guessedCorrectly){
            promptUser();
        }
    }

    private void promptUser(){
        System.out.println("Guess a number between 1 and 100:");

        int userGuess = scanner.nextInt();

        if (secretNumber == userGuess){
            System.out.println("Congratulations, you guessed correctly!");
            guessedCorrectly = true;
        } else if (secretNumber < userGuess){
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }

}