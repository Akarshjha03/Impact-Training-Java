package Day4;

public class AmstrongNum {
    public static void main(String[] args) {
        int num = 153; 
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count the number of digits

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise it to the power of the number of digits and add to sum
            num /= 10; // Remove the last digit
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
//provide a program to check whether a number is an Armstrong number or not
// An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.