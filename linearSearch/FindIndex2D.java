package linearSearch;

import java.util.*;


public class FindIndex2D {
    public static void main(String[] args) {
        int[][] arr  = {
                       {1, 2, 3},
                       {4, 5, 6},
                       {7, 8 , 9}
                       };

        // print2D(arr);
        // int target = 9;
        // int[] ans = indexOfArray(arr, target);
        // System.out.println(Arrays.toString(ans));

        System.out.println(maxValue(arr));
        

    }

    public static void print2D(int arr[][])
    {
        // Loop through all rows
        for (int[] row : arr)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    static int[] indexOfArray(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }

        }
        return new int[] {-1,-1};
    }

    static int maxValue(int[][] arr){
        int max  = Integer.MIN_VALUE;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length ;  col++){
                if(arr[row][col] > max){
                    max  = arr[row][col];
                }
            }
        }
        return max;
    }


}
