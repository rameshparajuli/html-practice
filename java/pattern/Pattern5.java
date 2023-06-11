package pattern;

public class Pattern5 {
    public static void main(String[] args) {
        // this is pattern: practice

        int firstRow = 5;
        for (int i = 1; i <= firstRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Result

// 1
// 12
// 123
// 1234
// 12345