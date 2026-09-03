// Count Prime Numbers in Range:

package Session12;

import java.util.Scanner;

public class CountPrimeNumbersInRange {
    public static int countPrimeNumbersInRange(int start, int end) {
        int count = 0;
        if(end < start) {
            return -1;
        }
        if(start <= 2 && end >= 2) {
            start = 3;
            count++;
        }
        if(start % 2 == 0) {
            start++;
        }
        for(int i = start; i <= end; i=i+2) {
            boolean isPrime = true;
            for(int j=3; j <= i/2; j=j+2) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number for range: ");
        int start = sc.nextInt();
        System.out.println("Enter the end number for range: ");
        int end = sc.nextInt();
        System.out.println("The count of prime numbers in "+start+" to "+end+" range is "+countPrimeNumbersInRange(start, end));
    }
}