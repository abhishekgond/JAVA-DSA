package Array.Problem;

public class lastOccurenseOfElements {
    public static void main(String[] args) {
        int arr[] = {5,6,5,3,5,4};
        int count=0;
        int target = 5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count=i;
            }
        }
        System.out.println(count);
    }
}
