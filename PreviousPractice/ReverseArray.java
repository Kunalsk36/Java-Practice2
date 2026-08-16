package PreviousPractice;
public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int size = arr.length;
        int n = 0;
        int[] revArr = new int[size];
        for(int i = size - 1; i >= 0; i--){
            revArr[n] = arr[i];
            n++;
        }
        for(int i: revArr){
            System.out.print(i+ " ");
        }
    }
}
