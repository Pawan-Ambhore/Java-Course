package numberSystems;

public class findUnique {
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,5,3,4};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {
          
        int unique = 0;

        for(int n: arr){
            unique ^= n;
        }
            

        return unique;
        
    }
}
