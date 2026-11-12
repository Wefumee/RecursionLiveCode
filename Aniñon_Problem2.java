package gcd;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);
        input.useDelimiter("[,\\s]+");

        int a = input.nextInt();
        int b = input.nextInt();

        //To validate the inputs
        if (a < 0 || b < 0) {
            System.out.println("Invalid input. Please input a positive number");
        } //GCD of a and b when both are zero.
        //Recall:when a and b are zero, the GCD of a and b is undefined 
        else if (a == 0 && b == 0) {
            System.out.println("Undefined");
            //Result   
        } else {
            int answer = gcd(a, b);
            System.out.println(+answer);
        }

    }

//METHOD SECTION
//RECURSION FOR FINDING GCD:
    public static int gcd(int a, int b) {
        //Base Case: when b is 0, it will retur the value of a
        if (b == 0) {
            return a;
        }

        //Recursive case:
        return gcd(b, a % b);

    }

}
