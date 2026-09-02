
import java.util.Arrays;

public class prac1 {

    public static void main(String[] args) {

        int[] arr = { 40, 10, 30, 20, 50 };

        // 1. toString()
        // Array ko print karne ke liye
        System.out.println("toString: " + Arrays.toString(arr));

        // 2. sort()
        // Array ko ascending order me sort karta hai
        Arrays.sort(arr);
        System.out.println("sort: " + Arrays.toString(arr));

        // 3. binarySearch()
        // Sorted array me element search karta hai
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("binarySearch(30): " + index);

        // 4. fill()
        // Pore array ko same value se fill karta hai
        int[] arr2 = new int[5];

        Arrays.fill(arr2, 10);
        System.out.println("fill: " + Arrays.toString(arr2));

        // 5. fill() with range
        // start inclusive, end exclusive
        int[] arr3 = { 1, 2, 3, 4, 5, 6 };

        Arrays.fill(arr3, 1, 4, 100);
        System.out.println("fill range: " + Arrays.toString(arr3));

        // 6. copyOf()
        // Array ki copy banata hai
        int[] arr4 = { 10, 20, 30, 40, 50 };

        int[] copy = Arrays.copyOf(arr4, 3);
        System.out.println("copyOf: " + Arrays.toString(copy));

        // 7. copyOf() - larger size
        // Extra positions default value se fill hoti hain
        int[] copy2 = Arrays.copyOf(arr4, 7);
        System.out.println("copyOf larger: " + Arrays.toString(copy2));

        // 8. copyOfRange()
        // Given range ki copy banata hai
        int[] copy3 = Arrays.copyOfRange(arr4, 1, 4);
        System.out.println("copyOfRange: " + Arrays.toString(copy3));

        // 9. equals()
        // Do arrays ke elements compare karta hai
        int[] a = { 10, 20, 30 };
        int[] b = { 10, 20, 30 };
        int[] c = { 10, 20, 40 };

        System.out.println("equals(a,b): " + Arrays.equals(a, b));
        System.out.println("equals(a,c): " + Arrays.equals(a, c));

        // 10. mismatch()
        // First different index batata hai
        int[] x = { 10, 20, 30, 40 };
        int[] y = { 10, 20, 99, 40 };

        int mismatchIndex = Arrays.mismatch(x, y);

        System.out.println("mismatch index: " + mismatchIndex);

        // 11. compare()
        // Do arrays ko lexicographically compare karta hai
        int[] p = { 1, 2, 3 };
        int[] q = { 1, 2, 4 };

        System.out.println("compare: " + Arrays.compare(p, q));

        // 12. deepToString()
        // 2D / nested array print karne ke liye
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println("deepToString: " + Arrays.deepToString(matrix));

        // 13. deepEquals()
        // Nested arrays compare karne ke liye
        int[][] m1 = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] m2 = {
                { 1, 2 },
                { 3, 4 }
        };

        System.out.println("deepEquals: " + Arrays.deepEquals(m1, m2));

        // 14. asList()
        // Array ko List me convert karne ke liye
        String[] names = { "Aman", "Rahul", "Ravi" };

        System.out.println("asList: " + Arrays.asList(names));
    }
}