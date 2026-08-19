// Build a simple calculator using switch.

package Session05;

import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operation you want to run (+ || - || * || / || %) : ");
        char op = sc.next().charAt(0);
        System.out.println("Enter the num 1 : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the num 2 : ");
        double num2 = sc.nextDouble();
        double res = 0;
        boolean isDone = false;
        switch (op) {
            case '+':
                res = num1 + num2;
                isDone = true;
                break;
            case '-':
                res = num1 - num2;
                isDone = true;
                break;
            case '*':
                res = num1 * num2;
                isDone = true;
                break;
            case '/':
                if(num2 != 0){
                    res = num1 / num2;
                    isDone = true;
                }
                else{
                    System.out.println("Can't divide with 0.");
                }
                break;
            case '%':
                if(num2 != 0) {
                    res = num1 % num2;
                    isDone = true;
                }
                else {
                    System.out.println("Num2 can't be zero.");
                }
                break;
            default:
                System.out.println("Entered wrong operation.");
                break;
        }
        if (isDone) {
            System.out.println("The result is " + res);
        }
        sc.close();
    }
}
