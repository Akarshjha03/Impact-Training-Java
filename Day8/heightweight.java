package Day8;
import java.util.*;
public class heightweight {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        int[] data = new int[n * 2]; // array to store height and weight

        System.out.println("Enter height and weight:");
        for (int i = 0; i < n * 2; i++) {
            data[i] = sc.nextInt();
        }

        int maxHeight = -1;
        int maxWeight = -1;
        int HeightIndex = -1;
        int WeightIndex = -1;

        for (int i = 0; i < n; i++) {
            int height = data[2 * i];     
            int weight = data[2 * i + 1]; 

            if (height > maxHeight) {
                maxHeight = height;
                HeightIndex = i + 1; 
            }

            if (weight > maxWeight) {
                maxWeight = weight;
                WeightIndex = i + 1; 
            }
        }

        System.out.println(HeightIndex);
        System.out.println(WeightIndex);

        sc.close();
    }  
}

//take a value n which will be the numbers of  person 
//array size will be n*2
// the array will represent height, weight of person 
//[10,100] for 5 persons 
// return the people position for max height and weight
//eg - [10,100,20,50,8,200,60,80,10,40]
//output- height - person 4
//output - wight - person 3
