//Best case O(n)
//Worst case O(n^2)

//Take an Element and Place to its Correct Position
public class InsertionSort {
    public static void insertionSort(int[] arr) {

    for (int i = 1; i < arr.length; i++) {

        int j = i ;

        // Shift bigger elements to the right
        while (j > 0 && arr[j] <arr[j-1]) {
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }

    }
    
}
public static void print(int[]arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={200,10,-1,0,23,45};
        insertionSort(arr);
        print(arr);
    }
}
