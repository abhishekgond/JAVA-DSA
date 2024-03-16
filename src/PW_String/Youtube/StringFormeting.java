package PW_String.Youtube;

public class StringFormeting {
    public static void main(String[] args) {
        double num = 4534543.4353;
        System.out.printf("Number is  : %.2f",num);
        String name = "abhishek kumar Gond ";
        System.out.println();
        String str = String.format("Your Name is %2$s and Number is %1$.2f",num,name);
        System.out.println(str);
    }

}
