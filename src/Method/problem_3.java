package Method;

import java.util.Scanner;
class Number{
    void Odd(int a,int b){
        for(int i=a;i<=b;i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }

}

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n1 = new Number();
        System.out.println("Min Number");
        int a =sc.nextInt();
        System.out.println("Max Number");
        int b = sc.nextInt();
        n1.Odd(a, b);

    }
}
