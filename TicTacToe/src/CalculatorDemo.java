import java.util.Scanner;

class Calculator {
    public String owner;
    public double recentResult;

    public Calculator() {
        owner = "No Specified Owner";
        recentResult = 0;
    }

    public Calculator(String newOwner) {
        owner = newOwner;
        recentResult = 0;
    }

    public double add(double x, double y) {
        recentResult = x + y;
        return recentResult;
    }

    public double subtract(double x, double y) {
        recentResult = x - y;
        return recentResult;
    }

    public double multiply(double x, double y) {
        recentResult = x * y;
        return recentResult;
    }

    public double divide(double x, double y) {
        recentResult = x / y;
        return recentResult;
    }

    public void printDetails() {
        System.out.println("Owner: " + owner + " Recent Calculation Result: " + recentResult);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator("Chris");

        String operation = "";

        double x = 0;
        double y = 0;

        while(true) {
            System.out.println("State the operation:");
            operation = scanner.nextLine();

            System.out.println("State x value:");

            try {
                x = Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid Input");
                break;
            }

            System.out.println("State y value:");

            try {
                y = Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid Input");
                break;
            }

            switch (operation) {
                case "+":
                    calculator.add(x, y);
                    break;
                case "-":
                    calculator.subtract(x, y);
                    break;

                case "/":
                    calculator.divide(x, y);
                    break;

                case "*":
                    calculator.multiply(x, y);
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            System.out.println("Result: " + calculator.recentResult);
            System.out.println();
            System.out.println();
        }


    }
}
