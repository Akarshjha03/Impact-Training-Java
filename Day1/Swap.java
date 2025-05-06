//swap last and first element of a  variable

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digits: " + sum);

        sc.close();
    }
}
