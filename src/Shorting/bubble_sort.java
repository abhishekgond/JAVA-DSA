package Shorting;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[] ={13,24,46,20,52,9};
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count = 1;
                }
            }
            if(count==0){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
        }
    }
}
