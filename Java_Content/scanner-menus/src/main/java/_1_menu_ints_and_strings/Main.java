package _1_menu_ints_and_strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberData;
        String line;

        int menuSelection = 0;

        do {
            displayMenu();

            menuSelection = scanner.nextInt();

            System.out.print(menuSelection + ") ");
            /*
            *
            * Choose path based on the selection
            * We are using here a newer version of switch ( notice ->): no need for break statement!
            *
            * */
            switch (menuSelection) {
                case 1 -> {
                    numberData = askForNumber(scanner);
                    System.out.println("===================");
                    System.out.printf("The input is: " + numberData);
                }
                case 2 -> {
                    line = askForLine(scanner);
                    System.out.println("===================");
                    System.out.printf("The input is: " +  line);
                }
                case 3 -> System.out.println("Good Bye!");
            }
        } while (menuSelection != 3);

    }


    private static void displayMenu() {
        System.out.println("");
        System.out.println("===================");
        System.out.println("Select an Option:");
        System.out.println("1) Ask for a number input, e.g. 123 -> (int) 123");
        System.out.println("2) Ask for a String, e.g.  John -> (String) John | John Doe -> (String) John Doe");
        System.out.println("3) Quit");
        System.out.println("===================");
    }


    private static int askForNumber(Scanner scanner) {
        int userInput;
        System.out.print("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid input\n", input);
            System.out.print("Please enter a number: ");
        }
        userInput = scanner.nextInt();
        return userInput;
    }

    private static String askForLine(Scanner scanner) {

        System.out.print("Enter a string data: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}