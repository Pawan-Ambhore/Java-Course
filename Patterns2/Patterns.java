package Patterns2;

public class Patterns {

    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3_1(n);
        // pattern3_2(n);
        // pattern4(n);
        pattern5(n);



        

       
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
    
}
