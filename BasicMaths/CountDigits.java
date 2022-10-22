package BasicMaths;



public class CountDigits {

    static int count_digit(int n){
     
        int x = n;
        int count = 0;

        while(x != 0){

            x = x / 10;
            count++;
        }
        return count;
    }

    // static int intToString(int n){

    //     String n1 = Integer.toString(n);
        
    //    return  n1.length();
        
    // }

    public static void main(String[] args) {
        
        int n = 10;

        System.out.println(count_digit(n));

        // System.out.println(intToString(n));
   

    }

   
    
}
