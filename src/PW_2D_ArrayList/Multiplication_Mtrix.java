package PW_2D_ArrayList;

public class Multiplication_Mtrix {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,1},{2,1,2}};
        int arr2[][] = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        int arr[][] = new int[arr1.length][arr2[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int sum = 0;
                 sum+= arr1[i][j]*arr2[j][i];
                arr[i][j] = sum;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
