// Check whether a month number has 30, 31 or 28/29 days

// 1  January    → 31
// 2  February   → 28/29
// 3  March      → 31
// 4  April      → 30
// 5  May        → 31
// 6  June       → 30
// 7  July       → 31
// 8  August     → 31
// 9  September  → 30
// 10 October    → 31
// 11 November   → 30
// 12 December   → 31

package Session05;

import java.util.Scanner;

public class MonthDaysCountChecker {
    public static void main(String[] args) {
        // Method 1 - Switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: (1-12) : ");
        int month = sc.nextInt();
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        int days = 0;
        if(year <= 0) {
            System.out.println("Entered wrong year!");
        }
        else {
            switch (month) {
                case 1:
                    days = 31;
                    break;
                case 2:
                    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days = 29;
                    }
                    else {
                        days = 28;
                    }
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6: 
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
            
                default:
                    System.out.println("Entered wrong month!");
                    return;
            }
            System.out.println("The month has "+days+" days!");
        }


        // Method 2:
        /*
        int[] d_31 = {1, 3, 5, 7, 8, 10, 12};
        int[] d_30 = {4, 6, 9, 11};
        int feb = 2;
        int month = 9;
        int year = 2001;
        if(month <= 0 || month > 12){
            System.out.println("Enter wrong month number.");
        }
        else {
            if(month != feb){
                for (int i : d_31) {
                    if(i == month){
                        System.out.println("The month has 31 days");
                        return;
                    }
                }
                for(int i : d_30){
                    if(i == month){
                        System.out.println("The month has 30 days");
                        return;
                    }
                }
            }
            else {
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("The month has 29 days");
                }
                else {
                    System.out.println("The month has 28 days.");
                }
            }
        }
        */
    }
}
