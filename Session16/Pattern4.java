/* Print Pattern: 

* * * * * * * * * 
  * * * * * * *   
    * * * * *     
      * * *       
        *         

*/

package Session16;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n*2-1; j++) {
                if(i==j || i+j==n*2 || (j >= i && i+j <= n*2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                // System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
        sc.close();
    }
}
