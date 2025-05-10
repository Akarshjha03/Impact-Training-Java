package Day5;

public class squarepattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int columns = 6; // Number of columns
        printSquarePattern(rows, columns);
    }

    public static void printSquarePattern(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Printing '*' for the first and last row, or the first and last column
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
