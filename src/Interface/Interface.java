package Interface;
import java.util.Scanner;

interface creatingInterface {
    int x =6;
    static void f1(){
        System.out.println(x);
    }
}
interface secondInterface extends creatingInterface {
    int x = 9;
    int y = 2;
    static void f2() {
        System.out.println(x);
    }
    void f3();
}
class creatingClass implements secondInterface{
    static void f2(){
        System.out.println(x);
    }
    public void f1(){
    }
    public void f3(){}
}
public class Interface {
    public static void main(String[] args) {
        Scanner Ca = new Scanner(System.in);
        creatingClass cs = new creatingClass();
        cs.f2();
        creatingInterface.f1();
    }
}
