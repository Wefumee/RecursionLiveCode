package recursivearrayanalysis;

import java.util.Scanner;

public class RecursiveArrayAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int size = input.nextInt();

        // To validate the size of array
        if (size <= 0) {
            System.out.println("Invalid array size! Enter at least one element.");
        } else {

            int[] values = new int[size];

            // Using for loop to read the array elements
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                values[i] = input.nextInt();
            }

            // Declare variable wherein those variables will contain the result using specific methods per variable
            int summation = arraySum(values, 0);
            int max = findMaximum(values, 0);
            int CountEven = countEven(values, 0);

            // Display using the assigned variables above
            System.out.println("\nArray Analysis Results:");
            System.out.println("Array Sum: " + summation );
            System.out.println("Largest Element: " + max);
            System.out.println("Number of Even Elements: " + CountEven);
        }

        input.close();
    }
    
    
    // METHOD SECTION:
    
    //Method for finding the sum of array elements
    public static int arraySum(int[] values, int index) {

        // Base case: stop when index reaches array length
        if (index == values.length) {
            return 0;
        }

        // Recursive case: this willadd current element to remaining sum
        return values[index] + arraySum(values, index + 1);
    }

    //Method for finding the largest number in the array of elements
    public static int findMaximum(int[] values, int index) {

        // Base case: to find the last valid index
        if (index == values.length - 1) {
            return values[index];
        }

        // Recursive case: this will find the largest number remaining elements
        int maxOfRest = findMaximum(values, index + 1);

        // Compare current element with the maximum of the rest
        if (values[index] > maxOfRest) {
            return values[index];
        } else {
            return maxOfRest;
        }
    }

    // Method for counting the even elements
    public static int countEven(int[] values, int index) {

        // Base cas
        if (index == values.length) {
            return 0;
        }

        // Check if the current element is even or not
        int currentCount = 0;

        if (values[index] % 2 == 0) {
            currentCount = 1;
        }

        // Recursive case
        return currentCount + countEven(values, index + 1);
    }
    
}
