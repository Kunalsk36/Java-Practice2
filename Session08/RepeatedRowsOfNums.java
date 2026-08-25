// Print repeated rows of numbers.

package Session08;

import java.util.Scanner;

public class RepeatedRowsOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for n: ");
        int n = sc.nextInt();
        System.out.println("Repeated Rows of Nums: ");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
