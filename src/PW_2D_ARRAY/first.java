package PW_2D_ARRAY;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        int arr1[][] ={{23,45,65},{34,90,78}};
        Scanner sc =new Scanner(System.in);
        int m = arr.length; // Use for  find no of rows in this matrix
        int n = arr[0].length; // ues for find the number of column
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j] =sc.nextInt();
//            }
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j]+" ");
//            }
            for(int[] ele : arr1){
                for(int x : ele){
                    System.out.print(x +" ");
                }
                System.out.println( );
            }
            System.out.println("");
        }


    }

