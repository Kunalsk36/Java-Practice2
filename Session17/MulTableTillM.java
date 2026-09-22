/*
Create a method to print multiplication table of given number n till m multiples.
*/

package Session17;

import java.util.Scanner;

public class MulTableTillM {
    public static void printMulTable(int n, int m) {
        System.out.println("The multiplication table of "+n+" : ");
        for(int i = 1; i <= m; i++) {
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the number till you want multiplication table: ");
        int m = sc.nextInt();
        printMulTable(n, m);
        sc.close();
    }
}
