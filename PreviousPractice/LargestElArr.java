package PreviousPractice;
public class LargestElArr {
    public static void main(String[] args){
        int[] arr = {10, 2, 8, 4, 5};
        int largest = Integer.MIN_VALUE;
        for(int i: arr){
            if(i > largest){
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
