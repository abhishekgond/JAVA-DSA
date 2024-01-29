package Problem;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        System.out.println("HellO " + name + " The Counting is  ");
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
}
