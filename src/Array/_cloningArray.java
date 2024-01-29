package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _cloningArray {
    public void  TakingInput(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
    }
    public void  printingArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public void  changeArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[0]=0;
            arr[1]=0;
            arr[2]=0;
        }
        System.out.println("");
    }
    public static void main(String[] args) {

        int arr[]= new int[5];
        _cloningArray obj = new _cloningArray();
        obj.TakingInput(arr);
        System.out.println("Original Array");
        obj.printingArray(arr);
        // copy Array
//        int arr_2[] = Arrays.copyOf(arr,3);
        int []arr_2 = Arrays.copyOfRange(arr,2,arr.length-1);
        System.out.println("printing array after Copy ");
        obj.printingArray(arr_2);
        // Copy of range

//        obj.changeArray(arr_2);
//        System.out.println("Before Change");
//        obj.printingArray(arr);
//        System.out.println("After Change");
//        obj.printingArray(arr_2);

    }
}
