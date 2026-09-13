public class findMissing {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 4, 5 };
          int flag=0;
           for(int i=1;i<=n;i++){
            flag=0;
            for(int j=0;j<n-1;j++){
               if(arr[j]==i){
                flag=1;
                break;
               }
            }
            if(flag==0){
                System.out.println(i);
            }
           }
   

/*         int sum = (n * (n + 1) / 2);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        System.out.println(sum - res); */
    }
}
