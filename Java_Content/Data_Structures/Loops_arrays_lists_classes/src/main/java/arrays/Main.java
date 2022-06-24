package arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String item1 = "milk";
        String item2 = "bread";
        String item3 = "coffee";
        String item4 = "toothpaste";

        // ARRAYS
        // a data structure - tool to manipulate large amounts of data to store in a single variable
        // with arrays must specify it is a "new"
        // adding an int value to a string as below specifies the number of strings that can be contained in this array
        // index numbers are the things we are adding into our array
        //

        String[] shoppingList = new String[5];

        String[] alternativeList = {"milk", "bread", "eggs", "cheese"};

        // inserting String item1 into first position of array
        shoppingList[0] = "milk";

        // prints this msg
        //   System.out.println(shoppingList[0]);

        //will print out 'null' - keyword that indicates that the thing exists but doesn't have any value associated with it
        //  System.out.println(shoppingList[1]);

        shoppingList[4] = "biscuits";







        // ARRAYLIST
        // creating something with a "new"
        // data type more complex - ArrayList with strings inside of it


        ArrayList<String> betterShoppingList = new ArrayList();

        //  System.out.println(betterShoppingList);

        betterShoppingList.add("milk");
        betterShoppingList.add("bread");
        betterShoppingList.add("eggs");

        // searches for an item
        //  System.out.println(betterShoppingList.indexOf("milk"));

        // display item at specific index
        //   System.out.println(betterShoppingList.get(2));

        //counts items in an array list
        //   System.out.println(betterShoppingList.size());

        //remove item by index number
        betterShoppingList.remove(0);

        //checks if item is present
        //    System.out.println(betterShoppingList.contains("milk"));

        //empties out list completely and checks this with a boolean
        betterShoppingList.clear();
        //    System.out.println(betterShoppingList.isEmpty());

        // much more we can do with ArrayLists - not as strict as normal Arrays









        // certain scenarios where ordering doesn't matter at all, or where having a rigidly informed order coulod be harmful to what we're trying to achieve
        // if the ordering matters in a data structure, the order is going to be maintained when we try to manipulate this, which can be an issue
        // Map - HashMap - consists of "key-value pairs" - we use these to search and extract info from the map
        // Every Map will need to have a key-value pair

        //have to use Integer with HashMaps not 'int'
        // need to specify the keys (strings) and associated values (integers)

        HashMap<String, Integer> mappedShoppingList = new HashMap();

        // adding a value - more complex than an arraylist! ordering not being handled for us this time

        mappedShoppingList.put("milk", 3);                  // always need both bits of info! "milk", the string, and 3, the value
        mappedShoppingList.put("bread", 10);
        mappedShoppingList.put("eggs", 15);

        // accessing a value
        //with a key, the output will be returned with the associated value

        System.out.println(mappedShoppingList.get("milk"));

        //deleting a value - deletes its key AND its value
        mappedShoppingList.remove("eggs");

        //updates the value
        mappedShoppingList.replace("bread", 6);

        System.out.println(mappedShoppingList.get("bread"));

        // can update a key with the value null
        mappedShoppingList.replace("milk", null);

    }

}
