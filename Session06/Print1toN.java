// Print numbers from 1 to N.

package Session06;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number : ");
        int n = sc.nextInt();
        System.out.println("\nNumber 1 to "+n+" :");
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
