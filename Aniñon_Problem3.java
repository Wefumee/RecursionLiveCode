/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aniñon_problem3;

import java.util.Scanner;

public class Aniñon_Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        // To remove the braces from the user input
        line = line.replace("{", "").replace("}", "").replace(" ", "");

        // this will divide the input values based on the commas
        String[] numbers = line.split(",");

        // This will create an integer array to hold the converted values
        int[] values = new int[numbers.length];

        // Needed inorder to convert from string to integer
        for (int i = 0; i < numbers.length; i++) {
            values[i] = Integer.parseInt(numbers[i]);
        }
      
        // Displays the result
        System.out.println();
        System.out.println(arraySum(values, 0) + ", "
                + findMaximum(values, 0) + ", "
                + countEven(values, 0));
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
        int maximum = findMaximum(values, index + 1);

        // Compare current element with the maximum of the rest
        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
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
