package Patterns2;

public class Patterns {

    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3_1(n);
        // pattern3_2(n);
        // pattern4(n);
        // pattern5(n);
        // pattern28(n);
        // pattern30(n);
        // pattern17(n);
        pattern31(n);


       
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            
            for(int col = 1; col<= n; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            
            for(int col = 1; col<= row; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    static void pattern3_1(int n) {
        for (int row = n; row > 0; row--) {
            
            for(int col = 1; col<= row; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    static void pattern3_2(int n) {
        for (int row = 1; row <= n; row++) {
            
            for(int col = 1; col<= n + 1 - row; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            
            for(int col = 1; col<= row; col++){
                System.out.print(col);
            }
            System.out.println(); 
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int numsOfColums = row > n ? 2 * n - row : row;
            
            for(int col = 0; col< numsOfColums; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int numsOfColums = row > n ? 2 * n - row : row;
            int noOfSpaces = n - numsOfColums;

            for (int i = 0; i <= noOfSpaces; i++) {
                System.out.print(" ");
            }
            
            for(int col = 0; col< numsOfColums; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            int noOfSpaces = n - row;

            for (int i = 0; i <= noOfSpaces; i++) {
                System.out.print("  ");
            }
            
            for(int col = row; col>= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col<= row; col++){
                System.out.print(col + " ");
            }

            System.out.println(); 
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            int noOfSpaces = n - c;

            for (int i = 0; i <= noOfSpaces; i++) {
                System.out.print("  ");
            }
            
            for(int col = c; col>= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col<= c; col++){
                System.out.print(col + " ");
            }

            System.out.println(); 
        }
    }

    static void pattern31(int n){
        int OriginalN = n;
        n = 2 * n;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n; j++) {

                int atEveryIndex = OriginalN - Math.min(Math.min(i, j), Math.min(n- i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    
}
