// Find product of first N natural numbers (while or do-while).

package Session07;

import java.util.Scanner;

public class ProductOfFirstNNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Number : ");
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int product = 1;
        if (n <= 0) {
            System.out.println("Entered invalid input.");
            return;
        }
        while (i <= n) {
            product *= i;
            i++;
        }
        System.out.println("The product of first " + n + " Natural numbers is : " + product);
    }
}
