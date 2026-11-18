class trappingRain {
    public static int trap(int[] arr) {
        int n = arr.length;
        int[] lmax = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++)
            lmax[i] = Math.max(lmax[i - 1], arr[i]);

        int[] rmax = new int[n];
        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rmax[i] = Math.max(rmax[i + 1], arr[i]);

        int ans = 0;
        for (int i = 0; i < n; i++)
            ans += Math.min(lmax[i], rmax[i]) - arr[i];

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(arr));
    }
}