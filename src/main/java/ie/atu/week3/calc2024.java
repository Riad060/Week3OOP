package ie.atu.week3;

import java.util.Scanner;


public class calc2024 {
    public static void main( String [] args){
// Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

// Prompt the user for the first number
        System.out.print("Please enter the first number: ");
        double firstNum = scan.nextDouble();
        System.out.println("You entered " + firstNum);

// Prompt the user for the second number
        System.out.print("Please enter the second number: ");
        double secondNum = scan.nextDouble();
        System.out.println("You entered " + secondNum);
// Ask the user for the desired operation
        System.out.print("Choose an operation (add, subtract, multiply, divide): ");
        String operation = scan.next();

// Perform the chosen operation using a switch expression
        boolean validOperation = true;

        switch (operation){
            case "add": add(firstNum, secondNum);
            break;
        }

    }
    public static void add(double first, double second){
        double result = first + second;
        System.out.println("The total is " +result);
    }
}