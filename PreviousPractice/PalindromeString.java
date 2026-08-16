package PreviousPractice;
import java.util.Scanner;
public class PalindromeString {
    public static boolean isPalindromeString(String str){
        String rev = "";
        boolean isPalindrome;
        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(isPalindromeString(str));
    }
}
