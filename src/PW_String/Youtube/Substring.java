package PW_String.Youtube;

public class Substring {
    static void reverseString(String str){
//        String new_str = " ";
//        for(int i=0;i<str.length();i++){
//            new_str = str.charAt(i)+new_str;
//        }
//        System.out.println(new_str);
//        **************************************************************
//        2nd method
//        **************************************************88
//        StringBuilder sb = new StringBuilder(str);
//        for(int i=0;i<str.length()/2;i++){
//            char firstChar = sb.charAt(i);
//            char lastChar = sb.charAt(str.length()-1-i);
//            sb.setCharAt(i,lastChar);
//            sb.setCharAt((str.length()-1-i),firstChar);
//        }
//        System.out.println(sb.toString());
//        ***********************************************************************
//        3rd Method
    }




    public static void main(String[] args) {
        String name = "abc";
        for(int i=0;i<name.length();i++){
             for(int j=i+1;j<=name.length();j++){
                 System.out.println(name.substring(i,j));
             }
        }
        reverseString("ABCD");
    }
}
