package Abstract;

import java.util.Scanner;

abstract class demo{
    int a,b;
    abstract void function1();
    demo(){
        System.out.println("Parent Class ");
    }

}
class demo1 extends demo{
    int x=20,y=90;
    void f2(){
        x =45;
        System.out.println(x);
    }
    void function1(){}
    demo1(){
        System.out.println("Child class ");
    }
    }



public class firstProgram {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     demo1 d1 = new demo1();
//     d1.f2();
//        System.out.println(a);
    }
}
