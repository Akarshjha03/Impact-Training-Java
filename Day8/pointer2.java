package Day8;
import java.util.*;
public class pointer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Declare array of size 6
        int[] arr = new int[6];
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Sort the array
        Arrays.sort(arr);

        // Step 3: Two-pointer approach
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Pairs of lowest and highest values:");
        while (left <= right) {
            if (left == right) {
                // For middle element in case of odd-length arrays
                System.out.println(arr[left]);
            } else {
                System.out.println(arr[left] + " " + arr[right]);
            }
            left++;
            right--;
        }

        sc.close();
    }


}


    