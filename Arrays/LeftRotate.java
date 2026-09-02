public class LeftRotate {
    public static void print(int [] arr1,int k){
    System.out.printf("Left Rotated Array by %d",k);
    System.out.println();
    for ( int in : arr1) {
     System.out.print(in+" ");   
    }
    System.out.println();
    }
    public static void leftRot1(int[] arr){
    int temp=arr[0];
    int i=0;
    while(i<arr.length-1){
        arr[i]=arr[i+1];
        i++;
    }
    arr[arr.length-1]=temp;
    System.out.println("Left Rotated Array by 1");
    for ( int in : arr) {
     System.out.print(in+" ");   
    }
    System.out.println();
    

    }
    public static void reverse(int[] arr,int low,int high){
     while(low<high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
        high--;
     }
    }

    public static void leftRot2(int[] arr ,int k){
        reverse(arr, 0, k-1);
        reverse(arr, k,arr.length-1);
        reverse(arr, 0, arr.length-1);
    }


    public static void main(String[] args) {
    int[] arr={1,32,44,56,87,93};
    System.out.println("Array before Rotation");
    for ( int in : arr) {
     System.out.print(in+" ");   
    }
    System.out.println();
    int arr1[]={1,2,3,4,5};
    int k=1;
    leftRot1(arr);
      
    leftRot2(arr1,k);   
    print(arr1,k); 
    }
}
