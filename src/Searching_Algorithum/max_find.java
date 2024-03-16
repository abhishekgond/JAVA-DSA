package Searching_Algorithum;

public class max_find {
    public static void main(String[] args) {
        int arr[] ={2,7,1,6,9};
        int min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
