// Keep accepting numbers until the user enters 0. (while or do-while)

package Session07;

import java.util.Scanner;

public class KeepLoopUntilEntered0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter number: ");
            n = sc.nextInt();
        } while(n != 0);
        System.out.println("Loop Exit.");
        sc.close();
    }    
}
