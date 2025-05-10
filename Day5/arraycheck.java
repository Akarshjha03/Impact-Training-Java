package Day5;


//program to take 2 array input and check if they are same or not
import java.util.Scanner;

public class arraycheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the arrays: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n]; 
        int[] array2 = new int[n]; 

        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        boolean areEqual = true;
        for (int i = 0; i < n; i++) {
            if (array1[i] != array2[i]) {
                areEqual = false;
                break;
            }
        }

        if (areEqual) {
            System.out.println("Same.");
        } else {
            System.out.println("Not same.");
        }

        scanner.close();
    }
}