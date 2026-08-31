// Count the factors of a number.

package Session11;

import java.util.Scanner;

public class CountFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        if(num == 0) {
            System.out.println("The 0 has infinite factors.");
            return;
        }
        int absNum = Math.abs(num);
        int count = 0;
        for(int i = 1; i<=absNum; i++) {
            if(absNum % i == 0) {
                count++;
            }
        }
        System.out.println("The count of factors of number "+num+" is "+count);
    }
}
