public class ReverseArray {
    public static void revArray(int[] arr){
    int start=0,end=arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    System.out.println("Reversed Array");
    for (int i : arr) {
        System.out.print(i+" ");
    }
    System.out.println();

    }
    public static void main(String[] args) {
    int[]arr={23,45,11,65,76};
    System.out.println("Orignal Array");
    for (int i : arr) {
        System.out.print(i+" ");
    }
    System.out.println();
    revArray(arr);
    }
}
