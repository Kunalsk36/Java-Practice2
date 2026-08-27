// Count occurrence of a given digit.

package Session10;

import java.util.Scanner;

public class CountOccurencesOfDigit {
    public static int countOfOccurencesOfDigit(int num, int digit){
        int occ = 0;
        int temp = Math.abs(num);
        while(temp > 0) {
            int d = temp % 10;
            if(digit == d) {
                occ++;
            }
            temp /= 10;
        }
        
        return occ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the digit : ");
        int digit = sc.nextInt();
        int occ = countOfOccurencesOfDigit(num, digit);
        System.out.println("The occurences of digit "+digit+" in number "+num+" is "+occ);
    }
}
