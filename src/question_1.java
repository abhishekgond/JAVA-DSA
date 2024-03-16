
import java.util.Scanner;
public class question_1 {
    static int first(int n,int target){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        while(sum<target){
            sum = sum +arr[j++];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(first(n,target));
    }
}
