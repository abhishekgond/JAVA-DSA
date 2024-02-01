package PW_String;
import java.util.Scanner;
public class question_9 {
    static String reverse(StringBuilder sb,int i,int j){
//        StringBuilder sb = new StringBuilder(str);

//         Reverse whole String
//         int i=0;
//         int j=sb.length()-1;
         while(i<j){
             char temp = sb.charAt(i);
             char temp1 = sb.charAt(j);
             sb.setCharAt(i,temp1);
             sb.setCharAt(j,temp);
             i++;
             j--;
         }
//         sb.reverse();
         String string= sb.toString();
         return string;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb =new StringBuilder(str);
        int i=0,j=0;
        while(j<sb.length()){
            if (sb.charAt(j)!=' '){ j++;}
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1);//reversing the last word of the sentence
        System.out.println(sb);
//        String s = reverse(str,0,str.length()-1);
//        System.out.println(s);
    }
}
