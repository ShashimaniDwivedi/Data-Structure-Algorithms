// package Sorting;
public class SelectionSort {
   
    public static void main(String[] args) {
        int[] arr={11,3,-1,33,54,-23,22,0};
        System.out.println("Array Before Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        int min_element=0,temp=0;
        for(int i=0;i<arr.length;i++){
            min_element=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_element]){
                    min_element=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min_element];
            arr[min_element]=temp;
        }
        System.out.println("Array After Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
