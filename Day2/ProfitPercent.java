//enter a total  value and two percentage values
//calculate the profit percent of each person and print it out
//the remaining should be divided by 3 to equally distribution to other 3 persons

package Day2;

import java.util.*;

public class ProfitPercent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt(); 
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 

        Double longben = total *(x/100.0); 
        Double rem = total - longben; 
        double blackbeard = rem *  (y/100.0); 
        double next_rem = rem - blackbeard; 
        double others = next_rem/3.0;

        System.out.println(longben);
        System.out.println(blackbeard);
        System.out.println(others);

        sc.close(); // Close the scanner to prevent resource leaks

    }
}
