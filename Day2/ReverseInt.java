// This program reverses a 3-digit integer.
// It extracts the last, middle, and first digits of the number
package Day2;

public class ReverseInt {
    
    public static void main(String[] args) {
        int n = 371;  
        int last = n % 10;               
        int middle = (n / 10) % 10;   
        int first = n / 100;             

        int reversed = last * 100 + middle * 10 + first;

        System.out.println("Reversed number: " + reversed);
    }

}
