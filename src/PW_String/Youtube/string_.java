package PW_String.Youtube;

public class string_ {
    public static void main(String[] args) {

//        *****************************************************************
//        String str = new String("Abhishek ");
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.charAt(6));
//        System.out.println(str.indexOf('A'));
//        char arr[] = str.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//        *********************************************************/***
//         String str1 = "Gorakhpur";
//        System.out.println(str1.compareTo("Gorakhpur"));
//        System.out.println(str1.compareTo("Gorakh"));
//        System.out.println(str1.compareTo("Gorakhpur Uttar pradesh "));
//        **************************************************
//        String str = "       Abhishek  ";
//        System.out.println(str.trim());
//        System.out.println("Abhishek".startsWith("Abhi"));
//        System.out.println("Abhishek".endsWith("Abhi"));
//        System.out.println("Abhishek".substring(2));
//        System.out.println("Abhishek".substring(2,5));
//        System.out.println("Abhishek".substring(2,2));
//        ********************************************************
//        String str = " Gorakhpur, Deoria, prayagraj, Punjab, ludhiana, nepal";
//        String arr[]= str.split(",");
//        System.out.println(arr[0]);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        ********************************************************
//        String str1 = "abhishekkumargond592@gmail.com";
//        String str2 = "randomavenger@hotmail.com";
//        String arr[] = str1.split("@");
//        String lastPart = arr[arr.length-1];
//        int lastIndex = lastPart.lastIndexOf('.');
//        System.out.println(lastPart.substring(0,lastIndex));
//        String arr1[] = str2.split("@");
//        String lastPart2 = arr1[arr.length-1];
//        int lastIndex2 = lastPart2.lastIndexOf('.');
//        System.out.println(lastPart2.substring(0,lastIndex2));
//        *************************************************************
//        String Builder and String Buffer
        StringBuilder name1 = new StringBuilder("Abhishek");
        StringBuilder name2 = new StringBuilder("Abhishek");
        StringBuilder name3 = new StringBuilder("Abhishek");
        StringBuilder name4 = name1;
        name4.append("kumar");
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name2));
        System.out.println(name1.equals(name4));





    }
}
