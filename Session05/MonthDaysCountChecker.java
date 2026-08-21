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

public class MonthDaysCountChecker {
    public static void main(String[] args) {
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
    }
}
