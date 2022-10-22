package BasicMaths;

public class ReverseString {

    static void reverse(int n){
       
        int rem;

        while(n>0){

            rem = n % 10;
            System.out.print(rem);
            n=n/10;
            
        }
    }

    public static void main(String[] args) {
        int n = 55612;

        reverse(n);
    }
    
}
