package PW_String;
import java.util.Scanner;
public class question_1 {
    public static void main(String[] args) {
//        How many number of  vowel are present in the Given string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Some Thing ");
        String s = sc.next();
        int count =0;
        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='a'||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o'
//                    ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I'
//                    ||s.charAt(i)=='O' ||s.charAt(i)=='U'){
//                count ++;
//
//            }
//            Or
            char k = s.charAt(i);
            if(isChar(k)==true) count++;
        }
        System.out.println(count);

    }
    public static boolean isChar(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }

}
