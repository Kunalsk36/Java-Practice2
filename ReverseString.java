import java.util.*;
class ReverseString{
    public static String reverseString(String str){
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to reverse: ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));

    }
}



// using string builder

/*
class ReverseString{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to reverse: ");
        String s = sc.nextLine();
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
*/