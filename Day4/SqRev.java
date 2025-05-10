package Day4;

public class SqRev {
    public static void main(String[] args) {
        int num = 12;
        int rev = 0;
        int square = num * num;
        
        while (square > 0) {
            rev = rev * 10 + square % 10;
            square /= 10;
        }
        
        System.out.println("The reverse of the square of " + num + " is: " + rev);
    }
}
// write a program to reverse the square of a number