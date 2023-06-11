package pattern;

public class Pattern3 {
    public static void main(String[] args) {
        // this is pattern: practice

        int firstRow = 5;
        int secondRow = 4;
        for (int i = 1; i <= firstRow; i++) {
            for (int j = 1; j <= secondRow; j++) {
                if (i == 1 || j == 1 || i == firstRow || j == secondRow) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

// Result

// ****
// *  *
// *  *
// *  *
// ****