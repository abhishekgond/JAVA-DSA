import java.util.Scanner;
public class BitwishOprater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 9, q = 10;
        System.out.println(p^q);// 3
        System.out.println(p|q);//11
        System.out.println(p&q);//12
        System.out.println(p>>2);//2
        System.out.println(p<<2);//36
        System.out.println(~p);//6

    }
}
