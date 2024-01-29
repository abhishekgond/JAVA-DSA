package Array;

import java.util.Scanner;

public class _Target_sum_problem {
    static int first(int arr[],int target){
        int count=0;
//        Find The Total number of pair in The array whose Sum is equal To The Given Number
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    count++;

                }
            }
        }
        return count;
    }
    static int second(int arr[],int target){
        int count=0;
//        Find The Total number of Triplet in The array whose Sum is equal To The Given Number
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j]+arr[k] == target){
                        System.out.println(i+" "+j+" "+k);
                        count++;

                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={4,6,3,5,8,2};
        int target = sc.nextInt();
        System.out.println("Total Number Off Pair is "+ first(arr,target));
        System.out.println("Total Number Off Triplet is "+ second(arr,target));

    }
}
