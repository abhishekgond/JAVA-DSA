package Array.Problem;

public class givenArraySortedOrNot {
    static boolean sortedArray(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,5,7};
        boolean bool = sortedArray(arr);
        System.out.println(bool);
    }
}
