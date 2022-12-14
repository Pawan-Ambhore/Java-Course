package binarySearch;

public class InfiniteArray {

    public static void main(String[] args) {

        int arr[] = {3,5,8,65,89,106,999} ;

        int target = 8;

        // int finalans = ans(arr, target);

        System.out.println(ans(arr, target));
        
    }

    static int ans(int[] arr, int target){

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;

            end =  end + (end-start + 1) * 2;
            
            start = temp;

        }

        return search(arr, target, start, end);
    }
    
    static int search(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid] ){
                start = mid + 1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
