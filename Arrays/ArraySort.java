public class ArraySort {
    public static void main(String[] args) {
        //  int[] arr={23,45,32,67,98,1,-1,-226,0};
         int[] arr={1,2,3,4,5};
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
             flag=false;
            }
        }
        if(flag)System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
