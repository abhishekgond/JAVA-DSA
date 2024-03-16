package Abstract;

import java.util.Scanner;
//********************** Notes  **********************
/*
what is  Abstract Class ?
 Abstraction :- A Class Which Contain The Abstract
  keyWord In its Declaration is called Abstract Class
  abstract class A {
  // This is Abstract Class
  }
*/
abstract class demo{
    // We can not create object of abstract Class in java
    int a,b;
    public abstract void function1();
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
    public void function1(){
        System.out.println("hello");
    }
    demo1(){
        System.out.println("Child class ");
    }
    }



public class firstProgram {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     demo1 d1 = new demo1();
//     d1.f2();
        d1.function1();
//        System.out.println(a);
    }
}
