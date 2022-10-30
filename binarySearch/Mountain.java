package binarySearch;

public class Mountain {

    public static void main(String[] args) {

        int[] arr = {0,2,1,0};

        // System.out.println(search(arr));
        int ans = search(arr);
        System.out.println(ans);
        
    }

    public static int search(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start;
    }
    
}
