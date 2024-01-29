package PREPCODE;

import java.util.Scanner;

public class _6_print_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int r =n%10;
            System.out.println(r);
            n/=10;
        }
    }
}
