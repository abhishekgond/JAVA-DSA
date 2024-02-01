package PW_String;

import java.util.Scanner;

public class question_6 {
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+"");
        }
        System.out.println("");
    }
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String str = sc.nextLine();
        printString(str);
        boolean s = palindrome(str);
        System.out.println(s);
//        int j=0,i=str.length()-1;
//        int count=0;
//        while(i<str.length()/2){
//            if(str.charAt(i)==str.charAt(j-i)){
//                i++;
//                j--;
//            }
//            else{
//                count++;
//                break;
//            }
//        }
//        if(count>0){
//            System.out.println("This is Not Palindrome ");
//        }
//        else{
//            System.out.println("This is Palindrome");
//        }


    }
}
