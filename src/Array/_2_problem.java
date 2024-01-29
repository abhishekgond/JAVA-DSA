package Array;

import java.util.Scanner;

public class _2_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum =0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sum){
                sum = arr[i];
            }
        }
        System.out.println(sum);
    }
}
