class Sol {
    public static void main(String[] args) {
        int[] coin = { 10, 10, 8, 10, 10 };
        int a = coin[0];
        for (int i = 0; i < coin.length; i++) {
            if (a < coin[i]) {
                System.out.println("CounterFiet Coin " + coin[i] + " Found at index " + i);
                break;
            }
        }

    }
}