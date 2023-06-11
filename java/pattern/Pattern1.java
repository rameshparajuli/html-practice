package pattern;

public class Pattern1 {
    public static void main(String[] args) {
        // this is pattern: practice

        int firstRow = 4;
        int secondRow = 5;
        for (int i = 1; i <= firstRow; i++) {
            for (int j = 1; j <= secondRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// Result

// *****
// *****
// *****
// *****
