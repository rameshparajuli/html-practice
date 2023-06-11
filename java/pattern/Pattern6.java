package pattern;

public class Pattern6 {
    public static void main(String[] args) {
        // this is pattern: practice

        int firstRow = 5;
        for (int i = firstRow; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

// Result

// 12345
// 1234
// 123
// 12
// 1