class LargestElement {

    static int largest, secondLargest = -1, index;

    public static int largestElement(int[] arr) {

        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > temp) {
                temp = arr[i];
                index = i;
            }
        }

        System.out.printf("Largest Element in the array is %d", temp);
        System.out.println();

        return index;
    }

    public static void secondLargest(int[] arr) {

        index = largestElement(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            //skipping largest element
            if (arr[i] != arr[index]) {

                if (secondLargest == -1) {
                    secondLargest = i;
                }
                else if (arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }

        System.out.printf(
            "Second Largest Element in the array is %d",
            arr[secondLargest]
        );
    }

    public static void main(String[] args) {

        int[] arr = {23, 45, 32, 67,67, 98, 1, -1, -226, 0};

        largestElement(arr);
        secondLargest(arr);
    }
}