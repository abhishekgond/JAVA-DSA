package PW_String;

public class question_14 {
//    Check That The Given String Are anagram Or Not
    public static void main(String[] args) {
        String s1 = "aabtttttttt";
        String s2 = "btttttattat";
        System.out.println(isanagram(s1,s2));

    }
    static boolean isanagram(String s1,String s2){
        int arr [] = new int[256];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;

    }
}
