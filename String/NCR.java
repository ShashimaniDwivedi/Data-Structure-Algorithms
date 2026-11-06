public class NCR {
    public static void main(String[] args) {

        int n = 5;
        int r = 2;

         /* int factN = 1;
        int factR = 1;
        int factNR = 1;

        for (int i = 1; i <= n; i++) {
            factN = factN * i;
        }

        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }

        for (int i = 1; i <= n - r; i++) {
            factNR = factNR * i;
        }

        int ncr = factN / (factR * factNR);

        System.out.println("NCR = " + ncr); */ 


        Long  res=1L;
        for (int i = 0; i < r; i++) {
            res=res*(n-i);
            res=res/(i+1);
            
        }
        System.out.println("NCR = " + res);

        


    }
}
