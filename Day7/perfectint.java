package Day7;
import java.util.*;

public class perfectint {
    public static int isCubicSumExist(int[] A, int N) {
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            int z = A[i];
            int x = 0;
            int y = (int) Math.cbrt(z); 
            
            while (x <= y) {
                int sum = (int) (Math.pow(x, 3) + Math.pow(y, 3));
                
                if (sum == z) {
                    count++; 
                    break;
                } else if (sum < z) {
                    x++; 
                } else {
                    y--; 
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = isCubicSumExist(arr, n);

        System.out.println("Count of good integers: " + result);
    }
}