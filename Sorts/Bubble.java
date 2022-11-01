package Sorts;
import java.util.*;

public class Bubble {
    
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        bubblewa(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubblewa(int[] arr){

        boolean swap;

        for(int i = 0; i < arr.length; i++){

            for(int j = 1; j < arr.length - i; j++){

                swap = false;

                if(arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swap = true;

                }

                if(!swap){
                    break;
                }
                
            }


        }
    }
}
