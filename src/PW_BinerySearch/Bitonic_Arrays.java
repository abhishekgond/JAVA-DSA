package PW_BinerySearch;

import java.util.Scanner;
//Bitonic Arrays
public class Bitonic_Arrays {
    static int findTheMinInBitonicArray(int arr[]){
     int first = arr[0];
     int last = arr[arr.length -1];
     if(arr.length ==1){
         return arr[0];
     }
     else if (arr.length == 0){
         return -1;
     }
     int n = Math.min(first,last);
     return n;
    }
    static int peekElementInBitonicArray(int arr[]){
        int low =0;
        int hei = arr.length-1;
        int ans =0;
        while (low<=hei){
            int mid = low+(hei-low)/2;
            int prev = (mid-1 + arr.length)%arr.length; // Two Find The Previous Element in The shorted Array
            int next =(mid+1)%arr.length; // to find the next Element InThe Sorted Array
            if(arr[mid]>arr[prev] && arr[mid] >arr[next]){
                ans = arr[mid];
            }
            if(arr[mid]>arr[prev]){
                low = mid+1;
            }
            else{
                hei = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teh length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findTheMinInBitonicArray(arr));
        System.out.print("Peek Element Is : ");
        System.out.println(peekElementInBitonicArray(arr));
    }
}
