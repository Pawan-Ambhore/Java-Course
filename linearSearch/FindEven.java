package linearSearch;

public class FindEven {

    public static void main(String[] args) {
        
    int[] nums = {6562, 12, 4567, 8502,8, 156, 7};

    int ans = findNumber(nums);
    System.out.println(ans);

    }

    


        static int findNumber(int[] nums){

            int count = 0;
            for(int num : nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }

        static boolean even(int num){
            int numOfDigit = digit(num);

            if(numOfDigit % 2 == 0){
                return true;
            }
            return false;


        }

        static int digit(int num){

            // int count = 0;
            
            // while(num>0){
            //     count++;
            //     num /= 10;
            // }

            // return count;

            return (int) (Math.log(num)) + 1;
        }






}