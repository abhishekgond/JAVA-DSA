package Shorting;
import Problem.TakingInput;

import java.util.Scanner;

public class sortingAlgo {
    Scanner sc = new Scanner(System.in);
    public void TakingInput(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
    }
    public void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public void BubbleSort(int arr[]){

    }
    public static void main(String[] args) {
        sortingAlgo sc =new sortingAlgo();
        int n =4;
        int arr[] = new int[n];
        sc.TakingInput(arr);
        sc.SelectionSort(arr);
        sc.PrintArray(arr);

    }
}
