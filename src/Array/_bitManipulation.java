package Array;

import java.util.*;

public class _bitManipulation {
    //Question 1
    static int uniqueNumber(int arr[]){
        //    Find The Unique number in a given array where all the element are being repeated twice with one value being unique
        int check=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                   arr[j]=-1;
                   arr[i]=-1;
                }
            }
            // usu for find unique value in the array
            if(arr[i]>=0){
                check =arr[i];
            }
        }

//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>0){
//                check =arr[i];
//            }
//        }
        return check;
    }
//    Question 2
    static int Second_Largest_GivenArray(int arr[]){
        Arrays.sort(arr);
        int max =arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            System.out.print( + max);
            if(arr[i]!=max){
                return arr[i];
            }
        }
        return -1;
    }
    //Printing Array
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

//    question 3
    static  int FindingFirstRepeatedValue(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];

                }
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] ={1,5,3,4,6,3,4};
        //***********************************
//        System.out.println("Unique Number is "+ uniqueNumber(arr));
//        PrintArray(arr);
        //******************************
        System.out.println(" largest Element is " + Second_Largest_GivenArray(arr));
        System.out.println("First Repeated value  is "+FindingFirstRepeatedValue(arr));
    }
}
