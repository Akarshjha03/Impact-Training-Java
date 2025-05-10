package Day5;

public class StairCase {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        printStairCase(n);
    }

    public static void printStairCase(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}