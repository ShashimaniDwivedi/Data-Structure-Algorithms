//best case O(n)
//worst case O(n^2)
class bubbleSort{
    public void swap(int []i,int []j){
        
    }
    public static void main(String[] args) {
        int[] arr={11,3,-1,33,54,-23,22,0};
        System.out.println("Array Before Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        boolean swapped=false;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
                }
            }
            if(swapped==false)break;
        }
        System.out.println("Array After Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}