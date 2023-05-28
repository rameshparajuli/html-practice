import java.util.Scanner;;

public class ConditionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select one to run program \n 1. calculator \n 2. Month Finder.");

        int choose = sc.nextInt();

        if (choose == 1) {
            System.out.println("Please Enter value for a and b");

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Now, select what you want to do.");
            System.out.println("1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
            int selectionNumber = sc.nextInt();
            switch (selectionNumber) {
                case 1:
                    System.out.println("Addition is : " + (a + b));
                case 2:
                    System.out.println("Addition is : " + (a - b));
                default:
                    return;
            }

        } else if (choose == 2) {
            System.out.println("Please Enter 1 to 12 to find month.");

            int month = sc.nextInt();

            switch (month) {
                case 1:
                    System.out.println("January");
                case 2:
                    System.out.println("February");
                case 3:
                    System.out.println("March");
                case 4:
                    System.out.println("April");
                case 5:
                    System.out.println("May");
                case 6:
                    System.out.println("June");
                case 7:
                    System.out.println("July");
                case 8:
                    System.out.println("August");
                case 9:
                    System.out.println("September");
                case 10:
                    System.out.println("October");
                case 11:
                    System.out.println("November");
                case 12:
                    System.out.println("December");
                default:
                    return;
            }
        } else {
            System.out.println("Couldn't find: Pleaase try again");
            return;
        }

    }
}
