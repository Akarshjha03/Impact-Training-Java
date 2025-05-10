package Day5;

import java.util.Scanner;

public class arrayop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt(); // Taking input from the user
        }

        int sum = calculateSum(numbers);
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The negative sum of the array elements is: " + (-sum));
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}