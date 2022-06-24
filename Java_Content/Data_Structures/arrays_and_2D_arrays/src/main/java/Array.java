import java.util.Arrays;

public class Array {


    // what is an array?
    // a list of cells or bucket / list of buckets which is fixed in size
    // very fast for data retrievals
    // delete operation is really hard because it involves reshuffling items in the index

    public static void main(String[] args) {
        // square brackets tells it its an array
        // inside the square brackets we have to specify the fixed capacity of items it will hold
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";

        //just typing "colors" in sout will only print details of the array, not the items in the list
        // you need to access it with the command Arrays.toString(*arrayname in here*)

        System.out.println(Arrays.toString(colors));

        // BUT to access a specific index value you just type arrayname[indexnumber]
        System.out.println(colors[0]);

        // shorter way to define the array values...
        // you can just use curly brackets and add in the values in order of their position in the array

        int[] numbers = {100, 200};

        // in order of their index...
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        // in reverse order of their index...

        for (int i = colors.length - 1; i >= 0; i--){
            System.out.println(colors[i]);
        }

       // using an enhanced for loop
        // for (Datatype variable : array)
        // : means "in" essentially looping through the array with the specified data type ref

        for (String color : colors) {
            System.out.println(color);
        }

        // using a stream to do the same thing
        Arrays.stream(colors).forEach(System.out::println);



    }



}
