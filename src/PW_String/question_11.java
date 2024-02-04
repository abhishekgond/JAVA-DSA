package PW_String;

public class question_11 {
    public static void main(String[] args) {

        String str [] ={"247","0000000900","0000746","64","540"};
        String max = str[0];
        for(int i=0;i<str.length;i++){
            max = max_find(max,str[i]);

        }
        System.out.println(max);


    }
    public static String max_find(String first,String second){
        String a=modify(first);
        String b =modify(second);
        if(a.length()>b.length()) return first;
        if(a.length()<b.length()) return second;
        for(int i=0;i<first.length();i++){
            if (a.length() == b.length()) {
                if (a.charAt(i) > b.charAt(i)) {
                    return first;
                }
                return second;
            }
        }
        if(a.length()>=b.length()){
            return first;
        }
        return second;

    }
    public static String modify(String b){
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)!='0')
                return b.substring(i);
        }
        return b;
    }

}
