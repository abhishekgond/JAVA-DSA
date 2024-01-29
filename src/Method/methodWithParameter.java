package Method;
import java.util.Scanner;
class Addition {
    int  add(int a,int b){
        return a+b;
//        System.out.println(a+b);
    }

}
public class methodWithParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition d = new  Addition();
        System.out.println("Enter The Number ");
        int a = sc.nextInt();
        System.out.println("Enter The Number ");
        int b = sc.nextInt();
        int sum = d.add(a,b);
        System.out.println(sum);
    }
}
