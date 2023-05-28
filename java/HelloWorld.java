import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}