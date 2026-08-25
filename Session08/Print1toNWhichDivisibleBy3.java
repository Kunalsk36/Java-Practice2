// Print all numbers from 1 to N that are divisible by 3.

package Session08;

import java.util.Scanner;

public class Print1toNWhichDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%3 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
