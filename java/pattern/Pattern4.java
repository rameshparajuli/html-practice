package pattern;

public class Pattern4 {
    public static void main(String[] args) {
        // this is pattern: practice

        int firstRow = 5;
        for (int i = 0; i <= firstRow; i++) {

            for (int j = 0; j <= firstRow - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}

// Result

//     *
//    **
//   ***
//  ****
// *****