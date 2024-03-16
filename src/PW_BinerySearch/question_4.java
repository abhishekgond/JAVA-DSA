package PW_BinerySearch;

public class question_4 {
//    find the First occurrence of the given sorted Array
        public static void firstOccurrence(int arr[],int target,boolean isFirst){
            int low = 0;
            int hai = arr.length-1;
            int flag = 0;
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
            if(flag>0){
                System.out.println("Element at index : "+ flag);
            }
            else{
                System.out.println("Element Not Found ");
            }

        }
        //    find the first occurrence of the given array

    public static void main(String[] args) {
        int arr[]= {2,2,4,4,8,12,16};
        int target =4;
        firstOccurrence(arr,target,true);

    }
}
