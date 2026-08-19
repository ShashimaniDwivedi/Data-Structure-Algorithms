import java.util.InputMismatchException;
import java.util.Scanner;


// Parent class
class ArrayMethod {
}


// ==================== TRAVERSAL ====================

class ArrayTraverse extends ArrayMethod {

    public void traverse(int[] arr, int size) {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Traversed Array:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}


// ==================== INSERTION ====================

class ArrayInsert extends ArrayMethod {

    public int Insert(int[] arr, int size, int capacity, Scanner sc) {

        System.out.println("\n1. Insert At Beginning");
        System.out.println("2. Insert In Between");
        System.out.println("3. Insert At Ending");
        System.out.print("Enter option: ");

        int inp = ArrayOperation.getInt(sc);

        switch (inp) {

            case 1:
                size = insertAtBeg(arr, size, capacity, sc);
                break;

            case 2:
                size = insertInBet(arr, size, capacity, sc);
                break;

            case 3:
                size = insertAtEnd(arr, size, capacity, sc);
                break;

            default:
                System.out.println("Invalid Input.");
        }

        return size;
    }


    // Insert at beginning
    public int insertAtBeg(int[] arr, int size, int capacity, Scanner sc) {

        if (size == capacity) {
            System.out.println("Array is full. Cannot insert.");
            return size;
        }

        System.out.print("Enter Element to Insert: ");
        int element = ArrayOperation.getInt(sc);

        // Shift elements to right
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element at index 0
        arr[0] = element;

        size++;

        System.out.println("Element inserted successfully.");

        return size;
    }


    // Insert in between
    public int insertInBet(int[] arr, int size, int capacity, Scanner sc) {

        if (size == capacity) {
            System.out.println("Array is full. Cannot insert.");
            return size;
        }

        System.out.print("Enter index at which you want to insert: ");
        int index = ArrayOperation.getInt(sc);

        // Valid insertion indexes are 0 to size
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return size;
        }

        System.out.print("Enter Element to Insert: ");
        int element = ArrayOperation.getInt(sc);

        // Shift elements to right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[index] = element;

        size++;

        System.out.println("Element inserted successfully.");

        return size;
    }


    // Insert at end
    public int insertAtEnd(int[] arr, int size, int capacity, Scanner sc) {

        if (size == capacity) {
            System.out.println("Array is full. Cannot insert.");
            return size;
        }

        System.out.print("Enter Element to Insert: ");
        int element = ArrayOperation.getInt(sc);

        // Insert at first free position
        arr[size] = element;

        size++;

        System.out.println("Element inserted successfully.");

        return size;
    }
}


// ==================== DELETION ====================

class ArrayDelete extends ArrayMethod {

    public int Delete(int[] arr, int size, Scanner sc) {

        System.out.println("\n1. Delete At Beginning");
        System.out.println("2. Delete In Between");
        System.out.println("3. Delete At Ending");
        System.out.print("Enter option: ");

        int inp = ArrayOperation.getInt(sc);

        switch (inp) {

            case 1:
                size = deleteAtBeg(arr, size);
                break;

            case 2:
                size = deleteInBet(arr, size, sc);
                break;

            case 3:
                size = deleteAtEnd(arr, size);
                break;

            default:
                System.out.println("Invalid Input.");
        }

        return size;
    }


    // Delete first element
    public int deleteAtBeg(int[] arr, int size) {

        if (size == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return size;
        }

        // Shift elements to left
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Remove duplicate last element
        arr[size - 1] = 0;

        size--;

        System.out.println("Element deleted successfully.");

        return size;
    }


    // Delete in between
    public int deleteInBet(int[] arr, int size, Scanner sc) {

        if (size == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return size;
        }

        System.out.print("Enter index at which you want to delete: ");
        int index = ArrayOperation.getInt(sc);

        // Valid deletion indexes are 0 to size - 1
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return size;
        }

        // Shift elements to left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Remove duplicate last element
        arr[size - 1] = 0;

        size--;

        System.out.println("Element deleted successfully.");

        return size;
    }


    // Delete last element
    public int deleteAtEnd(int[] arr, int size) {

        if (size == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return size;
        }

        // Remove last actual element
        arr[size - 1] = 0;

        size--;

        System.out.println("Element deleted successfully.");

        return size;
    }
}


// ==================== SEARCH ====================

class ArraySearch extends ArrayMethod {

    public void Search(int[] arr, int size, Scanner sc) {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter element to Search: ");
        int k = ArrayOperation.getInt(sc);

        boolean found = false;

        // Search only actual elements
        for (int i = 0; i < size; i++) {

            if (arr[i] == k) {

                System.out.printf(
                    "Element Found At Index %d%n",
                    i
                );

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element Not Present in Array.");
        }
    }
}


// ==================== MAIN CLASS ====================

public class ArrayOperation {

    // Common method for taking integer input safely
    public static int getInt(Scanner sc) {

        while (true) {

            try {

                return sc.nextInt();

            } catch (InputMismatchException e) {

                System.out.println(
                    "Invalid input! Please enter an integer."
                );

                // Remove invalid input
                sc.nextLine();
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ==================== ARRAY CREATION ====================

        System.out.println("***Array Creation***");

        int capacity;

        while (true) {

            System.out.print("Enter Size of Array: ");

            capacity = getInt(sc);

            if (capacity > 0) {
                break;
            }

            System.out.println(
                "Array size must be greater than 0."
            );
        }


        // Create array
        int[] arr = new int[capacity];


        // ==================== INITIAL ELEMENTS ====================

        int size;

        while (true) {

            System.out.print(
                "How many elements do you want to insert? "
            );

            size = getInt(sc);

            if (size > 0 && size <= capacity) {
                break;
            }

            System.out.println(
                "Number of elements must be between 0 and "
                + capacity + "."
            );
        }


        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {

            arr[i] = getInt(sc);
        }


        // Display initial array
        System.out.printf(
            "Array created with %d elements: ",
            size
        );

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();


        // ==================== OBJECT CREATION ====================

        ArrayInsert insertObj = new ArrayInsert();
        ArrayDelete deleteObj = new ArrayDelete();
        ArraySearch searchObj = new ArraySearch();
        ArrayTraverse traverseObj = new ArrayTraverse();


        // ==================== MAIN MENU ====================

        while (true) {

            System.out.println();
            System.out.println("***Array Operation***");

            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Traverse Array");
            System.out.println("5. Exit");

            System.out.print(
                "Enter Above Option To Perform Operation: "
            );

            int inp = getInt(sc);


            switch (inp) {

                case 1:

                    size = insertObj.Insert(
                        arr,
                        size,
                        capacity,
                        sc
                    );

                    break;


                case 2:

                    size = deleteObj.Delete(
                        arr,
                        size,
                        sc
                    );

                    break;


                case 3:

                    searchObj.Search(
                        arr,
                        size,
                        sc
                    );

                    break;


                case 4:

                    traverseObj.traverse(
                        arr,
                        size
                    );

                    break;


                case 5:

                    System.out.println(
                        "Program terminated."
                    );

                    sc.close();

                    return;


                default:

                    System.out.println(
                        "Invalid choice. Please choose 1-5."
                    );
            }
        }
    }
}