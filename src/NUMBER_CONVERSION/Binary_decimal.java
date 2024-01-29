package NUMBER_CONVERSION;

public class Binary_decimal {
    public static void main(String[] args) {
        int n= 7;
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%2;
            sum += rem * mul;
            mul *=10;
            n/=2;
        }
        System.out.println(sum);
    }
}
