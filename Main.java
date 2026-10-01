class Main {

    // Static variable
    static int a = 10;

    // Instance variable
    int b = 20;

    // Static block
    static {
        System.out.println("Static Block");
    }

    // Instance block
    {
        System.out.println("Instance Block");
    }

    // Constructor
    Main() {
        System.out.println("Constructor");
    }

    // Method
    void show() {
        int c = 30;   // Local variable
        System.out.println("Method");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        
        Main d = new Main();

        d.show();
    }
}