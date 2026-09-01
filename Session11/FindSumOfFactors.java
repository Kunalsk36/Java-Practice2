// Find the sum of factors.

package Session11;

import java.util.Scanner;

public class FindSumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        sc.close();
        if (num == 0) {
            System.out.println("0 has infinite factors.");
            return;
        }
        int sum = 0;
        for(int i = 1; i<=absNum; i++){
            if(absNum % i == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the factors of number "+num+" is "+sum);
    }
}
