import java.util.*;

/**
 * Remove Duplicates
 * it removes duplicates from thee sorted arrays
 */
class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = { 1, 6, 2, 3, 7, 4, 68, 8, 6, 4, 52, 86, 2, 1 };
        int i, j, temp;
        // Applyinng bubble sort algorithm
        for (i = 0; i < arr.length; i++) {
            for (j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Printing the elements of the array
        for (int k : arr) {
            System.out.print(" " + k + " ");
        }
        System.out.println();

        // Rempoving the Duplicates after sorting the array
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;

                }
            }
        }
        // Printing the elements of the array
        for (int k : arr) {
            System.out.print(" " + k + " ");
        }
        System.out.println();

    }
}