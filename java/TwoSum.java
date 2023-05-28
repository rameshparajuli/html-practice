import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number");
            Integer firstNumber = sc.nextInt();

            System.out.println("Enter second Number");
            Integer secondNumber = sc.nextInt();

            int answer = (firstNumber + secondNumber);

            System.out.println("Answer is " + answer);
        }

    }
}
