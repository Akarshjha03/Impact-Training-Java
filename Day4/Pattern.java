package Day4;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) { // Outer loop for rows
            for (int j = 1; j <= 4; j++) { // Inner loop for columns
                System.out.print(j); // Print numbers in a row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
