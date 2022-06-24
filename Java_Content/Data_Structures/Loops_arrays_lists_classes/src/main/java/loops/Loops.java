package loops;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {

        // int i = 0;
        //shortcut - increase the value of i by 1
        // i++;
        // i--; is to decrease the value of i by 1

        //LOOPS
        //Many processes that are going to be repetitive
        //what if you want to print the values from 1 to 10

        // a time consuming mechanism...
        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);

        //OR use a "for" loop to tell java to keep doing a thang
        // Below is a program that tells java to...
        // 1: initial value of i is stored as an int to declare it as a data type
        // 2: the termination of the condition (i <= 10) - so long as this is true, it will keep running
        // 3: the increment - how much should the numbers go up by? this drives the numbers up by the stated value increment
        // 4: when you go to print the value of i, it will follow these 3 steps

        // for (int i = 1; i <= 10; i++) {
        //   System.out.println(i);
        // }

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("apples");
        shoppingList.add("crisps");
        shoppingList.add("bread");
        shoppingList.add("eggs");


        // // initial value = 0 because the array list index starts at 0
        // stop condition: length of array list
        // increment = 1
        //      for (int i = 0; i < shoppingList.size(); i++) {
        //print "i am buying <thing>
        //     System.out.println("i am buying " + shoppingList.get(i));

        // this REVERSES the list of the shopping list as ordered above
        //     for (int i = shoppingList.size() - 1; i >= 0; i--) {
        //        if (shoppingList.get(i).equals("crisps")) {                  // .equals is the important "equals" sign for comparing/checking strings
        //              System.out.println("yuuuuusssss el crisps");
        //              break;                                                   // break means to abandon loop and print only UP TO that point -  the condition stops there
        //         } else {
        //              System.out.println("i am buying " + shoppingList.get(i));
        //        }


        // we know we will be looping through an array
        // this skips straight to the process of multiple iterations as specified by the shoppingList ArrayList
        // : symbol means =
        // item is a temporary variable

//       for (String item : shoppingList) {
//           System.out.println("i am buying " + item);
//            }

        // = is not to CHECK it is equal (like == does), rather to delcare the value of something
        for (int i = 0; i < shoppingList.size(); i++){
            shoppingList.remove(i);
        }

        System.out.println(shoppingList);
    }

}