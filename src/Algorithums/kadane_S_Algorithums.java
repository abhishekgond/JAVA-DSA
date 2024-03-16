package Algorithums;

public class kadane_S_Algorithums {
    public static void main(String[] args) {
        int sum =0;
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                for(int k=0;k<=j; k++){
                    int res  = arr[i]+arr[j]+arr[k];
                    if(sum<res){
                        sum = res;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
