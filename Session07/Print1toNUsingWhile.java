// Print 1 to N using while.

package Session07;

import java.util.Scanner;

public class Print1toNUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number : ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Following are the Number from 1 to "+n+" : ");
        while (i <= n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
} 