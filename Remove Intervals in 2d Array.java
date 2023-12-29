
// Remove_IntervalsInJava
import java.util.*;

class Remove_IntervalsInJava {
    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 },
        };
        int[][] arr = new int[4][2];
        for (int i = 0; i < 3; i++) {
            arr[i][0] = intervals[i][0];
            // for(int j=0;j<2;j++){
            if (intervals[i][1] > intervals[i + 1][0]) {
                arr[i][1] = intervals[i + 1][1];
                i = i + 1;
            }

            // }
        }
        for (int k = 0; k < arr.length; k++) { // this equals to the row in our matrix.
            for (int j = 0; j < arr[k].length; j++) { // this equals to the column in each row.
                System.out.print(arr[k][j] + " ");
            }
            System.out.println(); // change line on console as row comes to end in the matrix.
        }
    }
}