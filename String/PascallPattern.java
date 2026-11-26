public class PascallPattern {
    public static Long ncr(int r, int c) {
        Long res = 1L;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);

        }
        return res;
    }

    public static void main(String[] args) {
        // Given Row and Column find pascal term at that place
        // formula r-1Cc-1
        int r1 = 6;
        int c1 = 2;
        int r = r1 - 1;
        int c = c1 - 1;
        /*
         * int factR=1;
         * int factC=1;
         * int factRC=1;
         * for(int i=1;i<=r;i++){
         * factR*=i;
         * }
         * for(int i=1;i<=c;i++){
         * factC*=i;
         * }
         * for(int i=1;i<=(r-c);i++){
         * factRC*=i;
         * }
         * int res=factR/(factC *factRC);
         * Long res=ncr(r,c);
         * System.out.printf("Pascal Triangle element at Row %d and Column %d is %d",r1,
         * c1,res);
         * System.out.println();
         * // Print nth row
         * for (int i = 0; i <=r; i++) {
         * System.out.print(ncr(r,i)+" ");
         * }
         */
        /*
         * int res=1;
         * System.out.print(res+" ");
         * for (int i = 1; i <r; i++) {
         * res*=(r-i);
         * res/=i;
         * System.out.print(res+" ");
         * }
         * System.out.println();
         */

        for (int i = 1; i <=r; i++) {
            int res = 1;
            System.out.print(res + " ");
            for (int j = 1; j < i; j++) {
                res *= (i - j);
                res /= j;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }

}
