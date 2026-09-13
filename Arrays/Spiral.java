public class Spiral {

    public static void main(String[] args) {

        // right -> bottom -> left -> top

        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        int left = 0;
        int top = 0;
        int right = arr[0].length - 1;
        int bottom = arr.length - 1;

        while (left <= right && top <= bottom) {

            // right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            System.out.println();
            // bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            System.out.println();
            // left
            //for single line check
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            System.out.println();
            // top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
            System.out.println();
        }
    }
}