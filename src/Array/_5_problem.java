package Array;

public class _5_problem {
    public static void main(String[] args) {
        int arr[] = {1,3,2,7,11,8};
        for(int i=0;i<arr.length;i+=2){
            if(i+1<arr.length){
                int temp =0;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
       }
    }
}
