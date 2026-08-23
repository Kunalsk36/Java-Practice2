// Print numbers between a starting and ending number inclusive.

package Session06;

import java.util.Scanner;

public class PrintInclusiveNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number : ");
        int startN = sc.nextInt();
        System.out.println("Enter the end number : ");
        int endN = sc.nextInt();
        if(startN>endN){
            System.out.println("Invalid Input : Entered ending number greater than starting number.");
        }
        else{
            System.out.println("The Inclusive numbers from "+startN+" to "+endN+" :");
            for(int i = startN; i<=endN;i++){
                System.out.println(i); 
            }
        }
        sc.close();
    }
}
