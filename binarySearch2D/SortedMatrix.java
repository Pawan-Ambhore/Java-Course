package binarySearch2D;

public class SortedMatrix {
    public static void main(String[] args) {
        
    }

    static int[] BiSearh(int[][] matrix, int row, int cStart, int cEnd, int target){

        while(cStart <= cEnd){
              
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }

        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){

        int row  = matrix.length;
        int col = matrix[0].length;

        if(row == 1){
            return BiSearh(matrix, 0, 0, col - 1, target);
        }
    }
}
