//package Day2;
//code to check wheater a number is trendy or not 
// Trendy - if it has 3 digits and the middle digit is divisible by 3
import java.util.*;

public class trendy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            int mid = (num / 10) % 10;
            if (mid % 3 == 0)
                System.out.println("Trendy Number");
            else
                System.out.println("Not a Trendy Number");
        } else {
            System.out.println("Not a 3-digit number");
        }

        sc.close();
    }
}