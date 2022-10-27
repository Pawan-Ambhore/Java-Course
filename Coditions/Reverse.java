package Coditions;

public class Reverse {

    public static void main(String[] args) {
        
       int num = 56445568;

       int ans = 0;

       while(num>0){

        int rem  = num % 10;
        
        // System.out.print(rem);
        num = num / 10;

        ans = ans * 10 + rem;


    }

    System.out.print(ans);

    }
    
}
