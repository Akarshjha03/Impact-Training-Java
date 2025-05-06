//collartzsequence - if n is even then n = n/2 else n = 3n + 1 until n = 1

//package Day2;

public class collartzsequence {
    public static void main(String[] args) {
        int n = 7; // Example starting number
        System.out.print(n + " ");
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }
}
