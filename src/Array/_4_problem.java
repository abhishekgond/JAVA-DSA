package Array;

public class _4_problem {
    public static void main(String[] args) {
//        int n =4;
        int arr[] = {1,2,7,8,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tamp =0;
                tamp = arr[i];
                arr[i] = arr[j];
                arr[j]= tamp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
