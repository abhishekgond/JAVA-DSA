package Array.Problem;

import java.util.Arrays;
import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
//        Find The Maximum value out of all the elements in the arrays
        int x = 5;
        int ans = -1;
        int arr[] = new int[x];
        for(int i=0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        System.out.println(ans);
    }
}
