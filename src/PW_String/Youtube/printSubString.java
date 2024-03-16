package PW_String.Youtube;

public class printSubString {
    public static void main(String[] args) {
//        String str = "Abhishek";
//        for(int i=0;i<str.length();i++){
//            for(int j=i+1;j<=str.length();j++){
//                System.out.println(str.substring(i,j));
//            }
//        }

        // reverse String
        String str = "abhishek";
        String []arr = new String[str.length()];
        int j=0;
        for(int i=str.length()-1;i>0;i++){
            arr[j]= str.charAt(i)+" ";
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
