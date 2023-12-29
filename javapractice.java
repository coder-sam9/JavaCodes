import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {9, 7, 8, 5, 3, 4, 6, 1, 2};
        int left = 0, right = arr.length - 1;
        MergeSortBreaking(arr, left, right);
        for (int l : arr) {
            System.out.print(l + " ,");
        }
        System.out.println();
    }

    public static void MergeSortBreaking(int[] arr, int left, int right) {
        System.out.println("Breaking Function called from " + left + " and ends at " + right);

        if (left >= right) {
            return;
        }
        
        int mid = left + (right - left) / 2;
        MergeSortBreaking(arr, left, mid);
        MergeSortBreaking(arr, mid + 1, right);
        Merge(arr, left, mid, right);
    }

    public static void Merge(int[] arr, int left, int mid, int right) {
        int b[] = new int[arr.length];
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            b[k++] = arr[i++];
        }

        while (j <= right) {
            b[k++] = arr[j++];
        }

        for (k = left; k <= right; k++) {
            arr[k] = b[k];
        }
    }
}
