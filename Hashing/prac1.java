/* import java.util.Scanner;

public class prac1 {
    public static int count(int[]arr,int target){
         int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr={5,6,5,4,6,9,6};
        int target;
        Scanner sc=new Scanner(System.in);
        int q;
        System.out.println("Enter Number of query");
        q=sc.nextInt();
        while(q>0){
            System.out.println("Enter number to find frequency");
            target=sc.nextInt();
            System.out.printf("%d appear %d times",target,count(arr,target));
            System.out.println();
            q--;
        }
        sc.close();
    }
    
} */

//Hashing
/* public class prac1 {

    public static int max(int[] arr) {
        int MAX = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
        }

        return MAX;
    }

    // hash largest size can be 10^7 for int and 10^8 for boolean
    public static void main(String[] args) {

        int[] arr = { 5, 6, 5, 4, 6, 9, 6 };

        int res = max(arr);

        // Hash array Largest number can be 10^6
        int[] Hash = new int[res + 1];

        for (int i = 0; i < arr.length; i++) {
            Hash[arr[i]]++;
        }

        for (int i = 0; i < Hash.length; i++) {
            if (Hash[i] > 0) {
                System.out.printf("%d appear %d Times%n", i, Hash[i]);
            }
        }
    }
} */

//Character Hashing

public class prac1{
    public static void main(String[] args) {
        char[]arr={'a','b','a','d','e','b','a','c'};
        int[]hash=new int[26]; //because Z{122} character are there
        //for all character upper and lower (256)
        for (int i = 0; i < arr.length; i++) {
            //reduced to 26
            hash[arr[i]-'a']++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.printf("%c appear %d Times%n", i+'a', hash[i]);
            }
        }
        System.out.println((int)0);
    }
}