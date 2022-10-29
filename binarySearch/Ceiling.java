package binarySearch;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr  = {1, 23, 25, 56, 98, 802};

        int target = 810;

        int ans = search(arr, target);

        System.out.println(ans);
    }

    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

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
        return start;
    }
    
}
