package sumofdigits;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int number) {
        //For the base case; 
        if (number == 0) {
            return 0;
        }
        //For the recursive case
        //No need for an else statement since we only have two needed conditions
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        //Input validation
        if (number < 0) {
            System.out.println("Error. Please input a positive integer.");
        } else {
            System.out.println(sumOfDigits(number));
        }
    }

}
