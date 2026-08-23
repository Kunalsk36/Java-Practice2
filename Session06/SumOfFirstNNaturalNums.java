// Find the sum of first N natural numbers.

package Session06;

import java.util.Scanner;

public class SumOfFirstNNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number: ");
        int n = sc.nextInt();
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+res);
        sc.close();
    }
}
