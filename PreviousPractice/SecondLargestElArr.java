package PreviousPractice;
import java.util.Scanner;
public class SecondLargestElArr {
    public static int secondLargestEl(int[] arr){
        int firstEl = Integer.MIN_VALUE;
        int secondEl = Integer.MIN_VALUE;
        for(int i: arr){
            if(i > firstEl){
                secondEl = firstEl;
                firstEl = i;
            }
            else if(i > secondEl && i < firstEl){
                secondEl = i;
            }
        }
        return secondEl;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the "+ i +" num: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Current arr: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println("the second largest el is "+secondLargestEl(arr));
    }
}
