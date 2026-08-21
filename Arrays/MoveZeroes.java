public class MoveZeroes {
    
    public static void main(String[] args) {
        int[] arr={1,2,0,4,0,45,87,0,0,22,43,4};
        int index=0;
        for (int i=0;i<arr.length; i++) {
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
        arr[index]=0;
        index++;
        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }
}
