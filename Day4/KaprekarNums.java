package Day4;

import java.util.*;
public class KaprekarNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Input number
        int count = 0; 
        int square = num * num; 
        int temp = num;

        
        while (num != 0) {
            num/=10;
            count++; 
        }
        int power = (int) Math.pow(10, count); // Calculate 10^count
        int right = square % power; // Get the right part of the square
        int left = square / power; // Get the left part of the square
        if ((left+right) == temp) { // Check if the sum of left and right parts equals the original number
            System.out.println("Kaprekar number.");
        } else {
            System.out.println("not a Kaprekar number");
        }
    }
}
//kaprekar numbers are numbers where the sum of the digits of the square of the number is equal to the number itself. For example, 9 is a Kaprekar number because 9^2 = 81 and 8 + 1 = 9.
// Write a program to check whether a number is a Kaprekar number or not