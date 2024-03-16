package PW_BinerySearch;

public class question_6 {
    //    find the First occurrence of the given sorted Array
    public static int findFloorOfGivenArray(int arr[],int target){
        int low = 0;
        int hai = arr.length-1;
        int ans = -1;
        while(low<=hai){
            int mid = low+(hai-low)/2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            }
            else if(arr[mid]<target){
                low = mid+1;
                ans= arr[mid];
            }
            else{
                hai = mid-1;
            }
        }
        if(ans>0){
            return ans;
        }
        else{
            return ans;
        }

    }
    public static int findFCellingOfGivenArray(int arr[],int target){
        int low = 0;
        int hai = arr.length-1;
        int ans = -1;
        while(low<=hai){
            int mid = low+(hai-low)/2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            }
            else if(arr[mid]<target){
                low = mid+1;
//                ans= arr[mid];//Using in the floor find
            }
            else{
                hai = mid-1;
                ans = arr[mid];
            }
        }
        if(ans>0){
            return ans;
        }
        else{
            return ans;
        }

    }
    //    find the first occurrence of the given array

    public static void main(String[] args) {
        int arr[]= {2,2,4,4,4,4,4,4,4,8,12,16};
        int target =5;
        int ans = findFloorOfGivenArray(arr,target);
        int ans1 = findFCellingOfGivenArray(arr,target);
        System.out.println("Element floor  : "+ ans);
        System.out.println("Element celling  : "+ ans1);

    }
}
