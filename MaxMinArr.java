public class MaxMinArr {
    public static void main(String[] args){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr = {1,2,3,4,5};
        for(int i: arr){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.println("Max: "+max+" Min: "+min);
    }
}
