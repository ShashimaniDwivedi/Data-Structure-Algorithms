//Hollow Star
/* public class Pattern1 {
    public static void main(String[] args) {
       
        int n=6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if(i==0 || j==0 ||i==n-1||j==n-1){
                     System.out.print("* ");
                }
                else System.out.print("  ");
                   
            }
            System.out.println();
        }
    }
    
} */

//Number Increasing Pyramid
/* public class Pattern1 {
    public static void main(String[] args) {
        
        int n=6;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
            
             System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
} */
// Number Increasing reverse Pyramid
/* public class Pattern1 {
    public static void main(String[] args) {
        
        int n=5;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j < i; j++) {
            
             System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
} */

// Number Changing Pyramid
/* public class Pattern1 {
    public static void main(String[] args) {

        int n = 4;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
} */

// Hollow Diamond Pattern
/* public class Pattern1 {
    public static void main(String[] args) {

        int n = 7;
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(i+j==(n-1)/2||j-i==(n-1)/2||i-j==(n-1)/2||i+j==(n-1)+(n-1)/2){
                System.out.print("*");
                }
                else System.out.print(" ");
            }

            System.out.println();
        }
    }
} */
//Filled Diamod Pattern
/* public class Pattern1 {
    public static void main(String[] args) {

        int n = 7;
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(i+j>=(n-1)/2 && j-i<=(n-1)/2&& i-j<=(n-1)/2&&i+j<=(n-1)+(n-1)/2){
                System.out.print("* ");
                }
                else System.out.print("  ");
            }

            System.out.println();
        }
    }
} */

//Hollow Triangle Pattern
//break for even input
/* public class Pattern1 {
    public static void main(String[] args) {

        int n = 12;
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i+j==(n-1)/2||j-i==(n-1)/2||i==(n-1)/2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
} */
//Hollow Triangle Pattern Reversed
//break for even input
  /*   public class Pattern1 {
    public static void main(String[] args) {

        int n = 11;
        
        for (int i = 0; i <=n/2; i++) {

            for (int j = 0; j < n; j++) {
                if (i==0||(i-j)==0 ||i+j==(n-1)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
} */

//ButterFly Star Pattern

/* public class Pattern1 {
    public static void main(String[] args) {

        int n = 11;
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j==0||j==n-1||i==j||i+j==(n-1)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
} */

//Right half pyramid
/* public class Pattern1 {
    public static void main(String[] args) {

        int n = 11;
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                    System.out.print("* ");
                
            }

            System.out.println();
        }
    }
} */
//Reverse right half pyramid
 /*    public class Pattern1 {
    public static void main(String[] args) {

        int n = 11;
        
        for (int i = n; i>=0; i--) {

            for (int j = 0; j < i; j++) {

                    System.out.print("* ");
                
            }

            System.out.println();
        }
    }
} */

    //Left half Pyramid
  /*   public class Pattern1 {
    public static void main(String[] args) {

        int n = 10;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1||j==n-1||i==n-1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                
            }

            System.out.println();
        }
    }
} */

    //Left Reversed half Pyramid
/*    public class Pattern1 { 
    public static void main(String[] args) { 

        int n = 7; 
         
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                
                if (j >= i)
                    System.out.print("* "); 
                else  
                    System.out.print("  "); 
            } 

            System.out.println(); 
        } 
    } 
} */

public class Pattern1 { 
    public static void main(String[] args) { 

        int n = 7; 
         
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j <= i; j++) { 
                
                if ((i+j)%2==1)
                    System.out.print("0 "); 
                else  
                    System.out.print("1 "); 
            } 

            System.out.println(); 
        } 
    } 
}