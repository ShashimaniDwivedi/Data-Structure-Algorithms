class Pattern4{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                char ch = 'A';
                System.out.printf("%c ", ch + j);
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
         for(int i=n;i>=1;i--){
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                char ch = 'A';
                System.out.printf("%c ", ch + j);
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}