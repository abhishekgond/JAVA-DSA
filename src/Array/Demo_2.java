package Array;
import java.util.Scanner;
class _2DArray{
    void Demo(){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int arr[][] = new int [a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
public class Demo_2 {
    public static void main(String args[]){
        _2DArray obj = new _2DArray();
        obj.Demo();
    }
}
