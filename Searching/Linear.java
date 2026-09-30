public class Linear {
    static public int search(int[]arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={12,33,45,67,23,89};
        System.out.printf("Element found at index %d",search(arr,23));
    }
}
