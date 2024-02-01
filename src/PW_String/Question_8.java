package PW_String;
//Question : For AGiven String Convert each the first of Each word To Uppercase
import java.util.Scanner;
public class Question_8 {
    public static String uppercaseFirstLater(String str){
        StringBuilder sb = new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
//        Question : For AGiven String Convert each the first of Each word To Uppercase
//        i am abhishek kumar
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(uppercaseFirstLater(str));

    }
}
