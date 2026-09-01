// Find the greatest factor other than the number itself.

package Session11;

import java.util.Scanner;

public class FindGretestFactorOtherThanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        if(num == 0) {
            System.out.println("The number 0 has infinite factors.");
            return;
        }
        if(num == 1) {
            System.out.println("The number 1 has no proper factor.");
            return;
        }
        int absNum = Math.abs(num);
        int greatestFactor = 1;
        // Method 1: 
        // for(int i = 2; i <= absNum/2; i++) {
        //     if(num % i == 0) {
        //         greatestFactor = i;
        //     }
        // }

        // Method 2:
        for(int i = absNum/2; i >=2; i--) {
            if(num % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("The greatest factor other than the number itself of number "+num+" is "+greatestFactor);
    }
}
