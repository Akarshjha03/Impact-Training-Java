package Day5;

public class Reversestaircase {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        revprintStairCase(n);
    }

    public static void revprintStairCase(int n) {
        for (int i = 0; i <= n; i++) {
            
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*  ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
