package PW_BinerySearch;

public class question_1 {
//    pattern 1
    public static boolean binarySearch(int arr[],int target) {
        int min = 0;
        int hei = arr.length - 1;
        boolean flag = false;
        while (min <= hei) {
            int n = min + (hei - min) / 2;
            if (target == arr[n]) {
                flag = true;
                break;
            } else if (arr[n] < target) {
                min = n + 1;
            } else if (arr[n] > target) {
                hei = n - 1;
            }
        }
        return flag;

    }
//    pattern 2
    public static void reverse_Sorted_Array(int arr[],int target){
        int low =0;
        int hei=arr.length-1;
        int count =-1;
        while(low<=hei){
            int mid = low+(hei-low)/2;
            if(arr[mid]==target){
                count =  mid;
                break;
            }
            else if(arr[mid]<target){
//                low=mid+1; // not use in reverse array
                hei = mid-1;
            }
            else if(arr[mid]>target){
//                hei = mid-1;
                low=mid+1;
            }
        }
        if(count<0){
            System.out.println("Not Found ");
        }
        else{
            System.out.println("Found At index : "+ count);
        }
    }

//    find the Occurence in agiven range ;


//    pattern 3
    public static void main(String[] args) {
        int arr[] ={2,2,3,4,4,4,6,8};
        int arr1[] ={20,18,11,5,2};
        int target = 4;
//        System.out.println(binarySearch(arr,target));
//        reverse_Sorted_Array(arr1,target);

    }
}
