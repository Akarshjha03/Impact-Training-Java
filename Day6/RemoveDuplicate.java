package Day3;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element already exists in the temp array
            for (int j = 0; j < index; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the temp array
            if (!isDuplicate) {
                temp[index++] = array[i];
            }
        }

        // Create a new array with the exact size of unique elements
        int[] uniqueArray = new int[index];
        for (int i = 0; i < index; i++) {
            uniqueArray[i] = temp[i];
        }

        return uniqueArray;
    }
}
