import java.util.Arrays;

public class WorkingWith2DArrays {

    public static void main(String[] args) {
        // array is of 3, 3 size
        char[][] board = new char[3][3];
        for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                board[i][j] = '-';
                // filling the array with dashes using a nested loop
                // i goes one way, j goes the other - imagine a grid!
            }
        }

        // the same output
        char[][] board2 = new char[][]{
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'}
        };

        // we can change what we want in a specific index by assigning a new value like so
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        System.out.println(Arrays.deepToString(board));
        // creates a two-dimensional array with three rows/three columns
    }
}
