// Print a 1–N multiplication table grid.

// For Input n = 3

// Output:

// 1 2 3 4 5 6 7 8 9 10
// 2 4 6 8 10 12 14 16 18 20
// 3 6 9 12 15 18 21 24 27 30

package Session08;

import java.util.Scanner;

public class MulTableGrid1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Number: ");
        int n = sc.nextInt();
        System.out.println("Table Grid from 1 to "+n+" : ");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}