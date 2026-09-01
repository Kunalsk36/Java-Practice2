package Session11;

import java.util.Scanner;

public class FindAvgOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        if(num == 0) {
            System.out.println("The number 0 has infinite factors.");
            return;
        }
        int absNum = Math.abs(num);
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= absNum; i++) {
            if(absNum % i == 0) {
                sum += i;
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("The average of Factors of number "+num+" is "+avg);
    }
}
