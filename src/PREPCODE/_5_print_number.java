package PREPCODE;

import java.util.Scanner;

public class _5_print_number {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n= Sc.nextInt();
        int temp = n;
        int count=0;
        while(temp!=0){
            temp/=10;
            count ++;
        }
       int div = (int)Math.pow(10,count-1);
        while (div !=0){
            int q= n/div;
            System.out.println(q);
            n = n % div;
            div/=10;
        }
    }
}
