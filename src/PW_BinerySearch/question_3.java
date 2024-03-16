package PW_BinerySearch;

public class question_3 {
    public static boolean firstOccurrence(int arr[],int target){
        int low = 0;
        int hai = arr.length-1;
        boolean flag = false;
        while(low<=hai){
            int mid = low+(hai-low)/2;
            if (arr[mid] == target) {
                flag = true;
                break; // break is important because this is not terminated during run
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                hai = mid-1;
            }
        }
        return flag;
    }
//    find the first occurrence of the given array
public static void main(String[] args) {
    int arr[]= {2,2,4,4,8,12,16};
    int target =6;
    boolean first = firstOccurrence(arr,target);
    System.out.println(first);

}

}
