package PW_BinerySearch;

public class question_2 {
    public static int binarySearchRangeOfOccurrence(int arr[],int target,boolean isfirst){
        int low=0;
        int count=-1;
        int hi=arr.length-1;
        while(low<=hi){
            int mid = low+(hi-low)/2;
            if(arr[mid]==target) {
                count = mid;
                if (isfirst) {
                    hi = mid - 1;
                } else {
                    low = mid + 1;
                }
            }else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                hi =mid-1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] ={2,2,3,4,4,4,6,8};
        int arr1[] ={20,18,11,5,2};
        int target = 4;
//        System.out.println(binarySearch(arr,target));
//        reverse_Sorted_Array(arr1,target);
        int first = binarySearchRangeOfOccurrence(arr,target,true);
        int second = binarySearchRangeOfOccurrence(arr,target,false);
        System.out.println(second-first + 1);
    }
}
