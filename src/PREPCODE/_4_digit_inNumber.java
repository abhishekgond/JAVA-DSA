package PREPCODE;

public class _4_digit_inNumber {
    public static void main(String[] args) {
        int n=12398;
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
