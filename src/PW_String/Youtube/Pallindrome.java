package PW_String.Youtube;

public class Pallindrome {
    static boolean Pallindrome(String input){
        input = input.toLowerCase();
        int first = 0;
        int last = input.length()-1;
        while(first<last){
            if(input.charAt(first) != input.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Pallindrome("NaMAN"));
    }
}
