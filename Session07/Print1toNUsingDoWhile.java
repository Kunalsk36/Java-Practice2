// Print 1 to N using do-while.

package Session07;

import java.util.Scanner;

public class Print1toNUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number : ");
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        if (n <= 0) {
            System.out.println("Enter wrong N number value. Should be greater than or equal to 1: ");
            return;
        }
        System.out.println("The numbers from 1 to "+n+" are : ");
        do {
            System.out.println(i);
            i++;
        }while(i <= n);
        
    }
}
