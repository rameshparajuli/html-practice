package pattern;

public class Pattern7 {
    public static void main(String[] args) {
        // this is pattern: practice
        int sum = 0;
        int firstRow = 5;
        for (int i = 1; i <= firstRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }

    }
}

// Result


// 0 
// 1 2 
// 3 4 5 
// 6 7 8 9 
// 10 11 12 13 14 