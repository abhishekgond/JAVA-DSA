package PW_String_Builder;
import java.util.Scanner;
public class question_7 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder("Abhishek");
        int i=0,j=sb.length()-1;
        while(i<j){
            char temp = sb.charAt(i);
            char temp1 =sb.charAt(j);
            sb.setCharAt(i,temp1);
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
