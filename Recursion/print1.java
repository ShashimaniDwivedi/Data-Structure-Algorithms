class print1{
    public static void print(int n){
        //tail recursive because function do nothing after recursive call
        //take less time because they are optimized my modern compiler 
        //so always prefer tail recursive over simple one
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
    }
    public static int naturalNoSum(int n){
        int temp=0;
        if(n==0)return 0;
        temp=n+naturalNoSum(n-1);
        return temp;
    }
    public static int fact(int n){
        if(n==0||n==1)return 1;
        return n*fact(n-1);
    }
    public static int digitSum(int n){
        if(n==0)return 0;
        return n%10 + digitSum(n/10);
    }
    public static int fibonacci(int n){
        
        if(n==0||n==1)return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void printfibonacci(int n){
        int n1=0;
        int n2=1;
        int i=0;
        int temp=0;
        while(i<n){
          System.out.print(n1+" ");
          temp=n1+n2;
          n1=n2;
          n2=temp;
          i++;
        }
    }
    public static void main(String[] args) {
        print(5);
        System.out.println();
        System.out.println("Natural no sum");
        System.out.println(naturalNoSum(5));
        System.out.println("Factorial");
        System.out.println(fact(5));
        System.out.println("Digit sum");
        System.out.println(digitSum(123));
        System.out.println("Nthe Fibonacci Number");
        System.out.println(fibonacci(5));
        System.out.println("Fibonacci Number Series");
        printfibonacci(5);
    }
}