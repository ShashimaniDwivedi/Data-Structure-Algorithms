public class MaxOne {

    public static void main(String[] args) {

        // Maximum Consecutive One

        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };

        int counter = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                counter++;

                if (counter > max)
                    max = counter;

            } else {
                counter = 0;
            }
        }

        System.out.println("Maximum consecutive one are " + max);
    }
}