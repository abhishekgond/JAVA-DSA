package PW_String;

public class question_10 {
    public static void main(String[] args) {
        String str = "abaaacrmnrra";
        int arr [] = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)str.charAt(i)-79;
            arr[i]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>-1){

            }
        }

    }
}
