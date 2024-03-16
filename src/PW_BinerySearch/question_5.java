package PW_BinerySearch;

public class question_5 {
    //    find the First occurrence of the given sorted Array
    public static int firstOccurrence(int arr[],int target,boolean isFirst){
        int low = 0;
        int hai = arr.length-1;
        int flag = -1;
        while(low<=hai){
            int mid = low+(hai-low)/2;
            if (arr[mid] == target) {
                flag = mid;
                if(isFirst){
                    hai = mid-1;
                }else{
                    low= mid +1;
                }
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                hai = mid-1;
            }
        }
//        if(flag>0){
//            return flag;
//        }
//        else{
//            return flag;
//        }
        return flag;

    }
    //    find the first occurrence of the given array

    public static void main(String[] args) {
        int arr[]= {2,2,4,4,4,4,4,4,4,8,12,16};
        int target =4;
        int first_ =firstOccurrence(arr,target,true);
        int last = firstOccurrence(arr,target,false);
        System.out.println(first_ +","+last);
        int k = last-first_+1;
        System.out.println("Total Number of repeated Element is : "+k);

    }
}
