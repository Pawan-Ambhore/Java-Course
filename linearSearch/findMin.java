 package linearSearch;

public class findMin{

 public static void main(String[] args) {

    int[] arr = {45, 52, -2, 9, -1};
    // System.out.println(arr.length);

    System.out.println(MinNum(arr));


    
 }

 static int MinNum(int[] arr){

    int ans = arr[0];

    for(int i = 1; i < arr.length;  i++){
        if(ans > arr[i]){
           ans = arr[i];
        }
    }

    return ans;

 }



}