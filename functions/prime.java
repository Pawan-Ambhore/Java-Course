package functions;

import java.util.Scanner;

public class prime {


    static boolean PrimeNumber(int num){

        int c  = 2;

        if(num <= 1){
            // System.out.println(false);
           return false;
        }
    
        while(c < num){
            if(num % c == 0){
                // System.out.println(false);
                return false;
            }
            c++;  
    
        }
        // System.out.println(true);
        return true;

    }

    static boolean PrimeNumber2(int num){
        int c = 2;

        if(num <= 1){
         return false;
        }
        while(c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return c*c > num;
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int num = sc.nextInt();

        Boolean ans = PrimeNumber2(num);
        System.out.println(ans);
    



    
}
}