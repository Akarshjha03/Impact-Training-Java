package Day6;

// Program to take input of 2 arrays and check if they are compatible or not
// Compatible means each element in the first array should be greater than or equal to the corresponding element in the second array

import java.util.Scanner;

public class Compatible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the arrays: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] array1 = new int[n]; 
        int[] array2 = new int[n]; 

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt();
        }

        boolean isCompatible = true;
        for (int i = 0; i < n; i++) {
            if (array1[i] < array2[i]) {
                isCompatible = false;
                break;
            }
        }

        if (isCompatible) {
            System.out.println("Compatible.");
        } else {
            System.out.println("Not Compatible.");
        }

        sc.close();
    }
}
