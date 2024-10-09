import java.util.Scanner;

public class calc2024 {
    public static void main(String[] args) {
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
        System.out.print("Choose an operation (add, subtract, multiply, divide, exponent): ");
        String operation = scan.next();

        // Perform the chosen operation using a switch expression
        switch (operation) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                break;
            case "exponent":
                exponent(firstNum, secondNum);
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public static void add(double first, double second) {
        double result = first + second;
        System.out.println("The total is " + result);
    }

    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println("The total is " + result);
    }

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println("The total is " + result);
    }

    public static void divide(double first, double second) {
        if (second != 0) {
            double result = first / second;
            System.out.println("The total is " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void exponent(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is " + result);
    }
}
