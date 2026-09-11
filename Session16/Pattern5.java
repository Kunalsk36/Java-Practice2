/* Print Pattern : 

*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * *

*/

package Session16;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n*2-1; j++) {
                if(i+j >= n*2 || i >= j) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}