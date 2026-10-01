// package Sorting;

public class MergeArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;  
        int j = 0;  
        int k = 0;  

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        // Print merged array
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }
}