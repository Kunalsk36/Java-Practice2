// Check whether a number has exactly two factors.

package Session11;

import java.util.Scanner;

public class IsNumHasExactly2Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        if (num == 0) {
            System.out.println("The number 0 has infinite factors.");
            return;
        }
        if (num == 1) {
            System.out.println("The number 1 has only 1 factor.");
            return;
        }
        boolean divisorExist = false;
        int absNum = Math.abs(num);
        for(int i = 2; i <= absNum/2; i++) {
            if(absNum % i == 0){
                divisorExist = true;
                if(divisorExist) {
                    System.out.println("The number "+num+" don't have exactly 2 factors.");
                    return;
                }
            }
        }
        System.out.println("The number "+num+" has exactly 2 factors.");
    }
}
