package Array;

public class _7_problem {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > count){
                count = arr[i];
            }
        }
        System.out.println(count );

    }
}
