package PW_String;

public class StringBasics {
    public static void main(String[] args) {
        String s ="Abhishek Kumar ";
        System.out.println(s.charAt(7));
        System.out.println(s.length());
        // index of in the String
        System.out.println(s.indexOf('b'));
        System.out.println(s.lastIndexOf('h'));
        System.out.println(s.contains("a"));
        System.out.println(s.startsWith("a"));
        System.out.println(s.endsWith("k"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.concat("Kumar "));
        System.out.println(s.substring(4));
    }
}
