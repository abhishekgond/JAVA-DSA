package Method;

import java.util.Scanner;
class Squares {
    void print(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i*i);
        }
    }

}

public class problem_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Squares ar = new Squares();
        int a = sc.nextInt();
        ar.print(a);

    }
}
