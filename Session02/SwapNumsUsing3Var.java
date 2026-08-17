// Swap two numbers using a third variable.

package Session02;

import java.util.Scanner;

public class SwapNumsUsing3Var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Before Swap : num1 = "+num1+" and num2 = "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swap : num1 = "+num1+" and num2 = "+num2);
        sc.close();
    }
}
