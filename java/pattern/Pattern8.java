package pattern;

public class Pattern8 {
    public static void main(String[] args) {
        // this is pattern: practice

        int firstRow = 5;
        for (int i = 1; i <= firstRow; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }
}

// Result

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 