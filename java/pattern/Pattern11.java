package pattern;

public class Pattern11 {
    public static void main(String[] args) {
        // this is pattern: practice

        int firstRow = 5;
        for (int i = 1; i <= firstRow; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

    }
}

// Result