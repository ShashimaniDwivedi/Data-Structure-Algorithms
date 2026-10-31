
class Polynomial {
    int[] coefficients;

    // Varargs constructor
    Polynomial(int... coefficients) {
        this.coefficients = coefficients;
    }

    // Method to display polynomial
    void display() {
        int n = coefficients.length;

        for (int i = 0; i < n; i++) {
            int coeff = coefficients[i];
            int power = n - 1 - i;

            if (coeff == 0) {
                continue;
            }

            // Print sign
            if (coeff > 0 && i > 0) {
                System.out.print(" + ");
            } else if (coeff < 0) {
                System.out.print(i == 0 ? "-" : " - ");
            }

            int absCoeff = Math.abs(coeff);

            // Print coefficient
            if (power == 0 || absCoeff != 1) {
                System.out.print(absCoeff);
            }

            // Print variable and power
            if (power > 0) {
                System.out.print("x");
                if (power > 1) {
                    System.out.print("^" + power);
                }
            }
        }

        System.out.println();
    }
}

public class Main13 {
    public static void main(String[] args) {
        Polynomial p = new Polynomial(-3, 2, 1);
        p.display();
    }
}
