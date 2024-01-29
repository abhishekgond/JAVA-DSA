package Array;

import java.util.Scanner;

 class Array_Example {
    void demo(){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int age [] = new int[n];
        for(int i=0;i<n;i++){
            age [i] = sc.nextInt();
        }
//        for(int i=0;i<n;i++){
//            System.out.println(age[i]);
//        }
        for(int x : age){
            System.out.println(x);
        }


    }

}

public class Demo_1 {
    public static void main(String[] args) {
        Array_Example obj = new Array_Example();
        obj.demo();
    }
}
