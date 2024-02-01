package Array;
import java.util.*;
public class _v_21_problem {
    static void InputTaken(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    static void printArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int a,int b){
//        a=5,b=6
        System.out.println("Before "+ a+","+b);
        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println("After : "+a+" ,"+b);
    }
    static int[] RotateArray(int arr[],int k){
//        Rotate Array From The Right

        int ans [] = new int[arr.length];
        k = k % arr.length;
        int j=0;
        for(int i=arr.length-k; i<=arr.length-1;i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<arr.length-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        swap(5,6);
        int arr[] ={1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rotation Time");
        int n =sc.nextInt();
        System.out.println("Before Rotate : ");
        printArray(arr);
        System.out.println("");
        System.out.println("after Rotate ");
        int ans[] =RotateArray(arr,n);
        printArray(ans);



    }
}
