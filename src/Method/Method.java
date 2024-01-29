package Method;

import java.util.Scanner;
//Method Without parameter and with  return type
class Add{
    void  add(){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
        }

public class Method {
    public static void main(String[] args) {
        Add a= new Add();
        a.add();
    }
}
