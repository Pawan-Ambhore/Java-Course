package Arrays;

import java.util.*;

public class Swap {
    
    public static void main(String[] args) {

        int[] arr = {1,3,5,89,56};

        System.out.println(Arrays.toString(arr));
 
        // int idx1 = 1;
        // int idx2 = 3;

        // swapNumber(arr, 1, 3);
        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
        
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swapNumber(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapNumber(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
