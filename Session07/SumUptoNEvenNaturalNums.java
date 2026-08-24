// Find sum of all even numbers up to N using do-while.

package Session07;

import java.util.Scanner;

public class SumUptoNEvenNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        if(n <= 0) {
            System.err.println("Entered  Wrong N number. The input should be greater than or equal to 1.");
            return;
        }
        if(n==1){
            System.out.println("The sum upto "+n+" Even Natural Numbers : "+sum);
            return;
        }

        // Method 1: 
        // int i = 1;
        // do{
        //     if(i % 2 == 0){
        //         sum += i;
        //     }
        //     i++;
        // }while(i<=n);

        // Method 2:
        int i = 2;
        do {
            sum+=i;
            i+=2;
        }while(i<=n);
        
        System.out.println("The sum upto "+n+" Even Natural Numbers : "+sum);
    }
}