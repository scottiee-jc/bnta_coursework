package _slackz_2;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stackWithStrings = new Stack<>();

        stackWithStrings.push("One");
        stackWithStrings.push("Two");
        stackWithStrings.push("Three");
        stackWithStrings.push("Four");
        stackWithStrings.push("Five");

        System.out.println("Stack with Strings:" + stackWithStrings);
        System.out.println();

        String existingElement = "One";
        String noExistingElement = "Bla bla ";
        int positionOfAnExistingElement= stackWithStrings.search(existingElement);
        int positionOfNonExistingElement = stackWithStrings.search(noExistingElement);


        System.out.println("Element " + existingElement + " position: " + positionOfAnExistingElement);
        System.out.println("Element " + noExistingElement + " position: " + positionOfNonExistingElement);
        System.out.println("The Stack after search() " + stackWithStrings);
        System.out.println();

        stackWithStrings.push("A new element added with push() method");
        System.out.println("The Stack after push() " + stackWithStrings);
        System.out.println();

        String anElementFromStack_pop = stackWithStrings.pop();
        System.out.println("En element retrieved using pop(): " + anElementFromStack_pop);
        System.out.println("The Stack after pop() " + stackWithStrings);
        System.out.println();

        String anElementFromStack_peek = stackWithStrings.peek();
        System.out.println("En element retrieved using peek(): " + anElementFromStack_peek);
        System.out.println("The Stack after peek() " + stackWithStrings);
        System.out.println();

        System.out.println("Is stack empty?  " + stackWithStrings.isEmpty());
        System.out.println("Call pop() five times" );
        stackWithStrings.pop();
        stackWithStrings.pop();
        stackWithStrings.pop();
        stackWithStrings.pop();
        stackWithStrings.pop();
        System.out.println("Is stack empty?  " + stackWithStrings.isEmpty());
    }
}
