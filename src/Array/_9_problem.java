package Array;

public class _9_problem {

//    finding second largest element
    public static void main(String[] args) {
        int arr[] ={2,6,4,3,8,5,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
