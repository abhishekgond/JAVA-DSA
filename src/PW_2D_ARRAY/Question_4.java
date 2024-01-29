package PW_2D_ARRAY;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =new  int[3][3];
        int arr_2[][] = {{1,9,2},{3,7,4},{8,5,6}};
        int arr_1[][] = {{9,3,7},{8,6,5},{2,4,1}};
        int m = arr.length;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = arr_1[i][j] + arr_2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

//        Transpose Matrix

//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println(" ");
//        }
//        Second Method
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;


            }
            System.out.println(" ");
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<3;i++){
           int a=0,b=m-1;
           int temp = arr[i][a];
           arr[i][a] =arr[i][b];
           arr[i][b] =temp;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" Printing lower Trangle ");
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }



    }
}
