/* Print Pattern: Solid 

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

*/

package Session14;

import java.util.Scanner;

public class PrintPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
