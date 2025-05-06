// if in a 4x3 matrix, the first and last column are CSE with 1st row and the rest are ECE
// and the input is a number between 1 and 12, print CSE or ECE based on the column
import java.util.Scanner;

public class Seat {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        int rows = 4;
        int cols = 3;

        System.out.println("Enter a number between 1 and 12:");
        int number = sc.nextInt();

        if (number < 1 || number > rows * cols) {
            System.out.println("Invalid input. Number must be between 1 and 12.");
        } else if (number % cols == 1 || number % cols == 0) {
            System.out.println("CSE"); // first or last column
        } else {
            System.out.println("ECE");
        }

        sc.close();
    }
}
