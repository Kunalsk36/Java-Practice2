// 6. Reverse Number
// Input:
// 12345

// Output:
// 54321

// Aproach 1:

import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = sc.nextInt();
        int result = 0;
        int temp = num;
        while(temp != 0){
            int digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reverse Number : "+result);
        sc.close();
    }
}

// Aproach 2: 
/* 
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        Integer intNum = sc.nextInt();
        String strNum = intNum.toString();
        String resNum = "";
        for(int i = strNum.length()-1; i >= 0; i--){
            resNum += strNum.charAt(i);
        }
        int reverseNumber = Integer.parseInt(resNum);
        System.out.println("Reverse Number: "+reverseNumber);
        sc.close();
    }
}

*/