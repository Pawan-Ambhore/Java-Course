package mathsForDSA;
import java.util.ArrayList;

public class factors {

    public static void main(String[] args) {
        int n = 20;
        // fact1(n);
        // fact2(n);
        fact3(n);


     
    }

    public static void fact1(int n) {
        
        for (int i = 1 ; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void fact2(int n) {
        
        for (int i = 1 ; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                System.out.print(i + " " + n/i + " ");
            }
        }
    }

    public static void fact3(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1 ; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                System.out.print(i + " ");
                list.add(n/i);
            }
        }

        for (int i =  list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    
}
