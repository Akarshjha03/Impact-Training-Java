// if n is odd , print wierd
// if n is even and in the inclusive range of 2 to 5, print not weird
// if n is even and in the inclusive range of 6 to 20, print weird
// if n is even and greater than 20, print not weird
//package Day2;

import java.util.*;
public class wierd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        sc.close();
    }
}