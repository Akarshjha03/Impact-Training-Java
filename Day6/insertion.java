package Day6;
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] cards = new int[6];
        int[] original = {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++) {
            cards[i] = original[i];
        }

        System.out.print("Enter the card value to insert: ");
        int newCard = sc.nextInt();
        
        System.out.print("Enter the position to insert (0 to 5): ");
        int position = sc.nextInt();

        if (position < 0 || position > 5) {
            System.out.println("Invalid position! Game over.");
            return;
        }

        for (int i = 5; i > position; i--) {
            cards[i] = cards[i - 1];
        }

        cards[position] = newCard;

        System.out.print("Cards after insertion: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(cards[i] + " ");
        }

        sc.close();
    }
}

// consider i have array elements like 1,2,3,4,
// if i insert insert 5 at index 2 then the rest other elements will shift 1 position to the right
//i should also check if the index is valid or not (between the size of the array)