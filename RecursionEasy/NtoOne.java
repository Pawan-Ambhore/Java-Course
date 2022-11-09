package RecursionEasy;

public class NtoOne {

    public static void main(String[] args) {
        printIt(5);
    }

    static void printIt(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        printIt(n - 1);
    }
    
}
