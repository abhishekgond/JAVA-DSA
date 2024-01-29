package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _lastOccurrence {
    static  void strictlyGreater(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                count++;
            }
        }
        System.out.println(count);
    }
    static  void lastOccurrence(int arr[],int target){
        int count=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count = i;
            }
        }
        System.out.println(count);
    }
    static  boolean isSorted(int arr[]){
        boolean check=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    check =false;
                    break;
                }
            }
        }
        return check;
    }
    static int [] smallestAndLargestElement(int arr[]){
        Arrays.sort(arr);
        int ans[] ={ arr[0],arr.length-1};
        return  ans;
    }
    static int [] nth_term_smallestAndLargestElement(int arr[],int k){
        Arrays.sort(arr);
        int ans[] ={ arr[k-1],arr.length-k+1};
        return  ans;
    }

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which you want to find ");
//        int target = sc.nextInt();
        int arr[] ={1,2,3,4,5,6,7,8,9};
//        System.out.println("Last Occurrence");
//        lastOccurrence(arr,target);
//        System.out.println("Strictly greater  ");
//        strictlyGreater(arr,target);
//        System.out.println("IS Shorted Array or not");
        System.out.println("is shorted "+isSorted(arr));
        int k=3;
        int ans[] = smallestAndLargestElement(arr);
        int kth[] = nth_term_smallestAndLargestElement(arr,k);
        System.out.println("Smallest "+ans[0] + "  greatest  "+ ans[ans.length-1]);
        System.out.println("Smallest "+kth[0] + "  greatest  "+ kth[ans.length-1]);

    }
}
