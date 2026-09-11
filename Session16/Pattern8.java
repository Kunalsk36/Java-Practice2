/* Print Pattern : 

* * * * * 
  * * * * 
    * * * 
      * * 
        * 
      * * 
    * * * 
  * * * * 
* * * * *

*/

package Session16;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n*2-1; i++){
            for(int j = 1; j <= n; j++) {
                if(j>=i || i+j>=n*2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            //    System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
        sc.close();
    }
}