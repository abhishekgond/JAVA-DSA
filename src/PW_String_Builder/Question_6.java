package PW_String_Builder;

import java.util.Locale;
import java.util.Scanner;

public class Question_6 {
//    Taking input and Toggle Every Character And change LowerCase To upper And Upper To lower
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.append("fds");
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
//            Upper ase To Lower Case Convert
            if(ascii>=65 && ascii<=90){
                ascii+=32;
            }
//            Lower To Upper Case Convert
           else if(ascii>=97 && ascii<=122){
                ascii-=32;
            }
            ch = (char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
