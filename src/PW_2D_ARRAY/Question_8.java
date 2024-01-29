package PW_2D_ARRAY;
import java.util.Scanner;
public class Question_8 {
    static  void Print(int arr[][]){
        int n = 3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr_new[] = new int[9];
        int k=0;
        Print(arr);
//        Wave Form of This matrix
//          first
//        for (int i=0;i<3;i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < 3; j++) {
//                    arr_new[k++] = arr[i][j];
//                }
//            } else {
//                for (int j = 2; j >= 0; j--) {
//                    arr_new[k++] = arr[i][j];
//                }
//            }
//        }
//        for(int i=0;i<arr_new.length;i++){
//            System.out.print(arr_new[i] + " ");
//        }

//        second
        for (int i=0;i<3;i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            } else {
                for (int j = 2; j >= 0; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
}
