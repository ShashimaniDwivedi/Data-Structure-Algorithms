class TwoSum{
    static public void twoSum(int[]arr,int n){
    for ( int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[i]+arr[j]==n && i!=j){
                System.out.println(i+" "+j);
                return;
            }
        }
    }
    }
   public static void main(String[] args){
    int[]arr={3,3};
    int target=6;
    twoSum(arr,target);

   }
}