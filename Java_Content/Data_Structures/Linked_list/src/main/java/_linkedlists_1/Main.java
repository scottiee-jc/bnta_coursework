package _linkedlists_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //assigning the object LinkedList to either...
        // a reference variable that accessess ALL methods through LinkedList<String>
        // a reference variable that points to ONLY List<String> methods
        // a reference variable that points to ONLY Queue<String> methods

        LinkedList <String> allMethodsAvailable = new LinkedList<>();

        List<String> listMethodsOnly = allMethodsAvailable;

        // this only narrows down the choices - LinkedList or List methods

        Queue<String> queueMethodsOnly = allMethodsAvailable;

        // narrows down to Queue and LinkedList methods

                // creating another reference variable pointing to LinkedList<>() object

        allMethodsAvailable.add(("First"));
        allMethodsAvailable.add(("Second"));
        allMethodsAvailable.add(("Third"));

        System.out.println(allMethodsAvailable);

        String peek = allMethodsAvailable.peek();
        System.out.println(peek);

        // peek method: "Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty."
        //

        String poll = allMethodsAvailable.poll();
        System.out.println(poll);
        System.out.println(allMethodsAvailable);

        // Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
    }
}
