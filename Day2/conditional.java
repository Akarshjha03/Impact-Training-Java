//package Day2;

import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2 digit number: ");

        int Num = sc.nextInt(); // 2 digit number

        if(Num < 20){
            System.out.println("Number is less than 20");
        }else if(Num > 20 && Num%2 == 0){
            System.out.println("Number is even and greater than 20");
        }else if(Num > 20 && Num%2 != 0){
            System.out.println("Number is odd and greater than 20");
        }else{
            System.out.println("Invalid input");
        }
        
    }

}
