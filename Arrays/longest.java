class longest {
    // work only for positive
    //Sliding window
    // O(2n)
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println(maxLen);
    }
}