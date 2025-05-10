package Day5;

import java.util.Scanner;

public class arraydistinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int distinctCount = countDistinct(array);
        System.out.println("The number of distinct elements in the array is: " + distinctCount);
    }

    public static int countDistinct(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDistinct = true;

            // Check if the current element has appeared before
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                count++;
            }
        }

        return count;
    }
}
