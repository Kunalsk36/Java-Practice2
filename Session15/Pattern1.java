/* Print Pattern : 

*         
*         
*         
*         
* * * * * 

*/

package Session15;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j==1||i==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
