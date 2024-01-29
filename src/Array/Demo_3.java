package Array;

import java.util.Scanner;

class _3DArray{
    void Demo_3(){
        Scanner sc = new Scanner(System.in);
        int a=2;
        int b=2;
        int c=2;
        int arr [][][] = new int[a][b][c];
        for(int i=0;i<a; i++){
            for(int j=0;j<b;j++){
                for(int k=0;k<c;k++){
                    arr[i][j][k] = sc.nextInt();
                }

            }

        }
        System.out.println("Length of the Array : "+arr.length);
        for(int i=0;i<a; i++){
            for(int j=0;j<b;j++){
                for(int k=0;k<c;k++){
                    System.out.print( arr[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("");
        }
    }
}
public class Demo_3 {
    public static void main(String[] args) {
        _3DArray obj = new _3DArray();
        obj.Demo_3();
    }
}
