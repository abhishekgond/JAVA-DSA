package PW_String;

public class question_12 {
    public static void main(String[] args) {
        String str = "aaaabbcddeff";
       int i=0,j=0;
       int count=0;
       String s =" ";
       while(j<str.length()){
           if(str.charAt(i)==str.charAt(j)){
               j++;
               count++;
           }
           else{
               s=s+str.charAt(i)+count;
               i=j;
               count=0;
           }

       }
        s=s+str.charAt(i)+count;
        i=j;
        count=0;
        System.out.println(s);

    }
}
