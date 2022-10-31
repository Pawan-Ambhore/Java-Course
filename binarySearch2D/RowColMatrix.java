package binarySearch2D;
// import java.util.*;

public class RowColMatrix {
    
    public static void main(String[] args) {

        int[][] matrix = {
                          {1,3,5,7},
                          {10,11,16,20},
                          {23,30,34,60}
                         };

        // int ans[] = search(matrix, 60);
        boolean ans = search(matrix, 1);

        // System.out.println(Arrays.toString(ans));
        System.out.println(ans);
        
    }

    static boolean search(int[][] matrix, int target){

        int row = 0;
        int col = matrix.length;

        while(row < matrix.length){
                
            if(matrix[row][col] == target){
                // return new int[]{row, col};
                return true;
            }

            if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }


        }

        // return new int[]{-1,-1};
        return false;
    }

}
