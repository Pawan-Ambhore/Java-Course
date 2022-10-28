package linearSearch;

public class Wealth {

    public static void main(String[] args) {
        int[][] accounts = {
                            {3,5},
                            {7,3},
                            {1,5}
                           };

        
        System.out.println(maximumWealth(accounts));
        
    }


    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
    
     for (int i = 0; i < accounts.length; i++) {

        int sum = 0;
        for (int j = 0; j < accounts[i].length; j++) {
            
            sum += accounts[i][j];

            if(sum > ans){
                ans = sum;
            }


        }
        
     }
     return ans;
    }


    
}
