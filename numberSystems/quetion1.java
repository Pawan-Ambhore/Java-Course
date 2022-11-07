package numberSystems;

public class quetion1 {

    public static void main(String[] args) {
        int n  = 4;
        QueOne(n);
    }

    static void QueOne(int n){

        if((n & 1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    
}
