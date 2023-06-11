package pattern;

public class Pattern9 {
    public static void main(String[] args) {
        // this is pattern: practice

        for (int j = 5; j >= 1; j--) {

            for (int k = j - 1; k >= 1; k--) {
                System.out.print("%");
            }
            for (int l = 1; l <= 5; l++) {
                System.out.print("*");
            }
            for (int m = j; m < 5; m++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

    }
}

// Result
// can make % and # as space ("  ")

// %%%%*****
// %%%*****#
// %%*****##
// %*****###
// *****####