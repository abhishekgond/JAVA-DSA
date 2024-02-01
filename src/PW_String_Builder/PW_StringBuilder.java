package PW_String_Builder;

import java.util.Scanner;
public class PW_StringBuilder {
    public static void main(String[] args) {
//        StringBuilder Theory
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder("Abhishek ");
        //        String Builder have all the features as String
        System.out.println(sb.length());
        System.out.println(sb.delete(2,5));
        System.out.println(sb.reverse());
        System.out.println(sb.insert(3,'y'));
        System.out.println(sb.isEmpty());
        System.out.println(sb.deleteCharAt(1));
        sb.setCharAt(3,'v');
        System.out.println(sb);
        System.out.println(sb.compareTo(tb));
        System.out.println(tb.deleteCharAt(2));
        System.out.println(tb.delete(2,3));
        System.out.println(tb.insert(2,'k'));
        System.out.println(tb.insert(2,90));
        System.out.println(tb.insert(2,"Abhishek kumar "));
        System.out.println(tb.reverse());


    }
}
