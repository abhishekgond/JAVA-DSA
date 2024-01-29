package PW_2D_ARRAY;

import java.util.Scanner;

public class wave_form {
    static void input(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static void print_(int arr_[][]){
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                System.out.print(arr_[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        int arr[][] =new int [5][6];
        input(arr);
//        wave form matrix
        int min_i=0,min_j=0,max_i=arr.length-1,max_j=arr[0].length-1;
        while(min_i<=max_i && min_j<=max_j){
            for(int i=min_j;i<=max_j;i++){
                System.out.print(arr[min_i][i]+ " ");
            }
            min_i++;
            if(min_i>max_i ||min_j>max_j) break;
            for(int i=min_i;i<=max_i;i++){
                System.out.print(arr[i][max_j] + " " );
            }
            max_j--;
            if(min_i>max_i ||min_j>max_j) break;
            for(int i=max_j;i>=min_j;i--){
                System.out.print(arr[max_i][i] + " ");
            }
            max_i--;
            if(min_i>max_i ||min_j>max_j) break;
            for(int i=max_i;i>=min_i;i--){
                System.out.print(arr[i][min_j]+" ");
            }
            min_j++;
        }
//        print_(arr);


    }
}
