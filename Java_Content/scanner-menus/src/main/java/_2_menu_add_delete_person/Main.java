package _2_menu_add_delete_person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menuSelection;
        do {
            displayMenu();

            menuSelection = scanner.nextInt();

            System.out.print(menuSelection + ") ");
            switch (menuSelection) {
                case 1 -> {
                    addAPerson(scanner);
                }
                case 2 -> {
                    deleteAPerson(scanner);
                }
                case 0 -> System.out.println("Good Bye!");
            }
        } while (menuSelection != 0);

    }


    private static void displayMenu() {
        System.out.println("");
        System.out.println("===================");
        System.out.println("People in database: " + FakeDB.people);
        System.out.println("Select an Option:");
        System.out.println("1) Add a person");
        System.out.println("2) Delete a person");
        System.out.println("0) Quit");
        System.out.println("===================");
    }


    private static void addAPerson(Scanner scanner) {

        System.out.print("Input name: \n");
        scanner.nextLine();
        String inputDataName = scanner.nextLine();
        System.out.print("Input lastName: \n");
        String inputDataLastName = scanner.nextLine();

        System.out.print("Input age \n");
        int inputDataAge;
        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid input\n", input);
            System.out.print("Please enter a number: ");
        }
        inputDataAge = scanner.nextInt();
        FakeDB.people.put(++FakeDB.counter, new Person(FakeDB.counter, inputDataName, inputDataLastName, inputDataAge));
    }

    private static void deleteAPerson(Scanner scanner) {

        System.out.print("Input id ");
        int inputDataId;
        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid input\n", input);
            System.out.print("Please enter a number: ");
        }
        inputDataId = scanner.nextInt();
        if(FakeDB.people.containsKey(inputDataId)) {
            FakeDB.people.remove(inputDataId);
        } else {
            System.out.println("Could not find a person with id: " + inputDataId);
        }
    }
}