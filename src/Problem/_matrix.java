package Problem;

import java.util.Scanner;


public class _matrix {

    public void TakingInput(int arr[][]){
        Scanner sc = new  Scanner(System.in);
//        arr[][] = new int[a][b];
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void printingMatrix(int arr[][]){
        Scanner sc = new  Scanner(System.in);
//        int arr[][] = new int[a][b];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        _matrix obj = new _matrix();
        int a =sc.nextInt();
        int b =sc.nextInt();
        int arr[][] = new int[a][b];
        obj.TakingInput(arr);
        obj.printingMatrix(arr);



    }
}
