package linearSearch;

public class FindIndex {

    public static void main(String[] args) {
        
        // int[] arr = {6, 59, 22, 78, 8, 3};

        // int ans = find(arr, 3);

        // System.out.println(ans);

        String str = "Pawan";

        System.out.println(findChar(str, 'w'));

    }

    static int find(int[] arr, int number){

        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index< arr.length; index++){

            if(arr[index] == number){
                return index;
            }
        }
        return -1;

    }

    static boolean findChar(String str, char index){
        for(int i  = 0; i < str.length(); i++){
            if(index == str.charAt(i)){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }


    
}
