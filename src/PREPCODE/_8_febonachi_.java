package PREPCODE;

import java.util.Scanner;

public class _8_febonachi_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            int temp = a+b;
            a=b;
            b=temp;
        }
    }
}
