package Array;

import java.util.Scanner;

public class _3_problem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number Do You want To search ");
       int num =  sc.nextInt();
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                ans = i;
            }

        }
        System.out.println("index at "+ans);

    }
}
