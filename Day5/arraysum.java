package Day5;

public class arraysum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array
        int sum = calculateSum(numbers);
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
