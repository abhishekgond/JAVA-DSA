package PREPCODE;

import java.util.Scanner;

public class _6_till {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter low Number ");
        int low = sc.nextInt();
        System.out.println("Enter High number ");
        int high = sc.nextInt();
        for(int i=low; i<=high;i++){
            int count =0;
            for(int j=2;j*j<=high;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count ==0){
                System.out.println(i);
            }
        }
    }
}
