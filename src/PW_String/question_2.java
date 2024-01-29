package PW_String;

public class question_2 {
    public static void main(String[] args) {
//        input a string and print all the substrigs of that string
        String s = "Abhishek";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println(" ");
        }

    }
}
