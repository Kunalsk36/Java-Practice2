// Find the smallest and second smallest digit.

package Session11;

import java.util.Scanner;

public class SmallestAndSecondSmallestDigit {
    public static int[] smallestAndSecondSmallestDigit(int num){
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;
        if(num == 0) {
            return new int[] {0, -1};
        }
        int temp = Math.abs(num);
        while(temp > 0) {
            int digit = temp % 10;
            if(digit < smallestNum) {
                secondSmallestNum = smallestNum;
                smallestNum = digit;
            }
            else if (digit > smallestNum && digit < secondSmallestNum ) {
                secondSmallestNum = digit;
            }
            temp /= 10;
        }
        return new int[] {smallestNum, secondSmallestNum==Integer.MAX_VALUE ? -1 : secondSmallestNum};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int[] res = smallestAndSecondSmallestDigit(num);
        System.out.println("From the number "+num+" the smallest digit is "+res[0]+" and the second smallest digit is "+res[1]);
        sc.close();
    }
}
