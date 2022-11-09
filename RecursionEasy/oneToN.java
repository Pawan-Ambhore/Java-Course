package RecursionEasy;

public class oneToN {
    
    public static void main(String[] args) {
        printIt(5);
    }

    static void printIt(int n){

        if(n == 0){
            return;
        }

        printIt(n - 1);
        System.out.println(n);

    }

}
