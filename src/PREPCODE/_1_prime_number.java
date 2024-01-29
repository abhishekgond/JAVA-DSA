package PREPCODE;

import java.util.Scanner;

public class _1_prime_number {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int count =0;
        int a = Sc.nextInt();
        for(int i=1;i<=a;i++) {
            int num = Sc.nextInt();
            for (int div = 2; div*div <= num; div++) {
                if (num % div == 0) {
                    count++;
                    break;
                }
            }
                if (count == 0) {
                    System.out.println("Prime Number ");
                } else {
                    System.out.println("Not a Prime Number ");
                }

        }
    }
}
