package PW_BinerySearch;

public class lowerBoundAndUpperBound {
    public static void main(String[] args) {
        int arr[]= {10,20,26,30,30,40,50,60,70};
        int low = 0;
        int hei = arr.length-1;
        int lb =arr.length+1;
        int target = 30;
        while (low <= hei) {
            int mid = low+(hei-low)/2;
//            if(arr[mid]>=target){
            if(arr[mid]>target){
                lb = Math.min(lb,mid);
                hei = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(lb);
    }

}
