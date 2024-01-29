package PW_String;

public class question_5 {
    public static void main(String[] args) {
//        Input a string and update all the even position in the strung to character 'a'. consider 0 based index
        String s= "physics wallah skills";
        String k = " ";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                k+='a';
            }
            else{
                k+=s.charAt(i);
            }
        }
        System.out.println(k);
    }
}
