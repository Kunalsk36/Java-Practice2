// Count how many positive and negative numbers are entered until 0.

package Session07;

import java.util.Scanner;

public class CountPosNNegNumUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int positiveNums = 0;
        int negativeNums = 0;
        do {
            System.out.println("Enter the number : ");
            n = sc.nextInt();
            if(n<0){
                negativeNums++;
            }
            else if(n>0){
                positiveNums++;
            }
        } while (n != 0);
        System.out.println("The count of positive numbers entered before 0 is "+positiveNums);
        System.out.println("The count of negative numbers entered before 0 is "+negativeNums);
        sc.close();
    }
}
