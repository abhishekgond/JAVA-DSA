package PW_2D_ARRAY;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

//      Question _ 2
        int n=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<3;i++){

            for(int j=0;j<4;j++){
                if(arr[i][j]>n){
                    n = arr[i][j];
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Greatest Element is "+n);
        System.out.println("Sum "+sum);

    }
}
