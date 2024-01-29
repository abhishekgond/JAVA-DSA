package PW_String_Builder;

import java.util.Scanner;

public class question_8 {
//    Reverse The String using This Function
    static void reverse(String str,int i,int j){
        StringBuilder sb = new StringBuilder(str);
        i=0;
        j=sb.length()-1;
        char temp = sb.charAt(i);
        char temp2 = sb.charAt(j);
        sb.setCharAt(i,temp2);
        sb.setCharAt(j,temp);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String n = Sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        int i=0,j=0;
        while(i<sb.length()){
//            while (sb.charAt(j)){
//                j++;
//            }
        }

    }
}
