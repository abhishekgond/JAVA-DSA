package Problem;

import java.util.Scanner;

public class ProblemOnLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = sc.nextInt();
        int i=1,sum = 0;
        while(i <= num){
            System.out.println(i);
            sum+=i;
            i++;

        }
        System.out.println("sum :" + sum);
    }
}
