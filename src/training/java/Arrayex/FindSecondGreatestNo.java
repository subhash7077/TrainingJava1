package training.java.Arrayex;

import java.util.Arrays;

public class FindSecondGreatestNo {
    static int getSecondLargest(int[] arr){
        int length= arr.length;
        Arrays.sort(arr);
        for(int i=length-2;i>=0;i--){
            if(arr[i]!=arr[length-1]){
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={10};
        System.out.println("Second Largest no is: " + getSecondLargest(arr));
    }
}
