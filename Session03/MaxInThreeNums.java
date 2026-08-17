// Find maximum between three numbers.

package Session03;

import java.util.Scanner;

public class MaxInThreeNums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("num 1 "+num1+" is maximum");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("num 2 "+num2+" is maximum");
        }
        else{
            System.out.println("num 3 "+num3+" is maximum");
        }

        // alternate approach:
        // int max = Math.max(num1, Math.max(num2, num3));
        // System.out.println("The maximum num is "+max);

        // alternate approach 2:
        // int max = num1;
        // if(num2 > max){
        //     max = num2;
        // }
        // if(num3 > max){
        //     max = num3;
        // }
        // System.out.println("The maximum number is : " + max);

        sc.close();
    }
}