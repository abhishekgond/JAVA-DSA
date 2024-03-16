package Array.Problem;

public class strictlyGreaterThenGivennumber {
    public static void main(String[] args) {
        int arr[] = {5,6,7,4,3,5,5,8};
        int count =0;
        int target = 5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                count++;
            }
        }
        System.out.println(count);
    }
}
