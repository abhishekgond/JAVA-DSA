package PREPCODE;

import java.util.Scanner;

public class _6_ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int count=0;
            for(int j=2;j*j<=n;j++){
                if(x%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }

    }
}
