package Array.Problem;

import java.util.Arrays;

public class smallestAndLargestArray {
    static int[] smallestAndLargestElement(int arr[]){
        int s=3,l=2;
        Arrays.sort(arr);
        int a[] ={arr[s],arr[arr.length-l]};
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,2,3,7};
        int ans[] = smallestAndLargestElement(arr);
        System.out.println("Smallest : "+ans[0] + ","+"Largest : " +ans[1]);
    }
}
