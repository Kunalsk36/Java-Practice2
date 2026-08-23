// Print the first N natural numbers.

package Session06;

import java.util.Scanner;

public class Print1toNNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N : ");
        int n = sc.nextInt();
        System.out.println("The Natural numbers from 1 to "+n+" : ");
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
