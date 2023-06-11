import java.util.*;;

public class ConditionalCheck2 {
    public static void main(String[] args) {
        System.out.println("Enter number to multiplication");
        Scanner sc = new Scanner(System.in);

        int mul = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(mul + " * " + i + " = " + (i * mul));
        }
    }
}
