package Day5;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n]; // Declare the array

        // Take input for each element
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display the array
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
//take user input in array