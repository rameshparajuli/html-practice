public class Loop {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        var sum = 1;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(sum);
                if (sum == 1) {
                    sum = 0;
                } else {
                    sum = 1;
                }
            }

            System.out.println();

        }
    }
}

// this is normal print
// System.out.print('*');

// if(i==1|| j == 1 || i == n || j == m){
// System.out.print("*");
// } else{
// System.out.print(" ");
// }

//
// for (int j = 0; j <= i; j++) {
// System.out.print("*");
// }

// for (int j = n; j >= i; j--) {
// System.out.print("*");
// }

// for (int i = 0; i <= n; i++) {
//
// for (int j = 0; j <= n - i; j++) {
// System.out.print(" ");
// }
//
// for (int j = 0; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
//
// }

// for (int i = 1; i <= m; i++) {

// for (int j = 1; j <= i; j++) {
// System.out.print(j);
// }

// System.out.println();

// }

// for (int i = 0; i <= m; i++) {
// for (int j = 1; j <= m - i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }


// floyd's triangle

// for (int i = 0; i <= m; i++) {
//         for (int j = 1; j <= i; j++) {
//         System.out.print(sum + " ");
//         sum = sum + 1;
//         }
//         System.out.println();
//         }