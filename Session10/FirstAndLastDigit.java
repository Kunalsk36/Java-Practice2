// Find the first and last digit.

package Session10;

import java.util.Scanner;

public class FirstAndLastDigit {
    public static int[] firstAndLastDigit(int num){
        int sign = num >= 0 ? 1 : -1;
        int temp = Math.abs(num);
        int firstDigit = 0;
        int lastDigit = 0;
        boolean gotLastDigit = false;
        while (temp > 0) {
            firstDigit = temp % 10;
            if(!gotLastDigit){
                lastDigit = firstDigit;
                gotLastDigit = true;
            }
            temp /= 10;
        }
        return new int[]{firstDigit*sign, lastDigit*sign};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int[] res = firstAndLastDigit(num);
        System.out.println("The first digit of number "+num+" is "+res[0]+" and last digit is "+res[1]);
        sc.close();
    }
}
