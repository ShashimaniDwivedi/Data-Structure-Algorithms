public class ArrayMax {
    public static int max(int[] arr) {
        int MAX = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }

        }

        return MAX;
    }

    public static int sec_max(int[] arr) {
        int MAX = arr[0], sec_max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                sec_max=MAX;
                MAX = arr[i];
            } else if (arr[i] > sec_max && arr[i] != MAX) {
                sec_max = arr[i];
            }
        }

        return sec_max;
    }

    public static int sec_max_Opt(int[] arr) {
        int MAX = arr[0], sec_max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                sec_max = MAX;
                MAX = arr[i];
            } else if (arr[i] < MAX && arr[i] > sec_max) {
                sec_max = arr[i];
            }
        }

        return sec_max;
    }

     public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } 
        }

        return min;
    }

    public static int sec_min(int[] arr) {
        int min = arr[0],sec_min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                sec_min = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < sec_min) {
                sec_min = arr[i]; 
            }
        }

        return sec_min;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 4, 6, 9, 6 };

        int res = max(arr);
        int s_res = sec_max(arr);
        int s_res1 = sec_max_Opt(arr);
        System.out.println(res + " " + s_res + " " + s_res1);
        int ans=min(arr);
        int ans1=sec_min(arr);
        System.out.println(ans+" "+ans1);
    }
}
