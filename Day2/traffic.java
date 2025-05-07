//jon snow and man in the north decided to open castle black for the northerns and the castle was turned into a hotel , it was flourishing and there was high demand for the rooms . so jon decided to modify the tarriff accordingly .  write a java programm to calculate the hotel tarrif . the room rent is 20% high during peeak seasons (april-june and nov -dec)

//input:

//1st int denotes the count of month 
//2nd int  denotes the room rest per day
//3rd int denotes thee numbe rof days stayed in hotel

//package Day2;

import java.util.Scanner;
public class traffic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int roomRentPerDay = sc.nextInt();
        int numberOfDays = sc.nextInt();

        // Check if it's peak season
        boolean isPeakSeason = (month >= 4 && month <= 6) || (month == 11 || month == 12);

        // Apply 20% hike during peak season
        double totalRent = roomRentPerDay * numberOfDays;
        if (isPeakSeason) {
            totalRent *= 1.2;
        }

        System.out.println((int) totalRent); // Output as integer
    }
}

