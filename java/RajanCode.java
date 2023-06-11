import java.util.Scanner;

/**
 * RajanCode
 */
public class RajanCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("Enter your choice:");
            System.out.println("1. Calculator");
            System.out.println("2. Finding Month");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculator();
                    break;
                case 2:
                    findMonth();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }

        scanner.close();
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter number 2:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator. Please enter +, -, *, or / only.");
                calculator();
                return;
        }

        scanner.close();
    }

    public static void findMonth() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 12 to find the month:");
        int monthNumber = scanner.nextInt();

        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1 to 12.");
                findMonth(); // Re-run the findMonth function if input is invalid
                return; // Return to exit the current instance of findMonth()
        }

        System.out.println("The month is " + monthName);

        scanner.close();
    }

}
