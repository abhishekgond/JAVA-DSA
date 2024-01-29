package NUMBER_CONVERSION;

public class _7_Problem {
        public static void main(String[] args) {
            int n = 11011;
            int sum =0;
            int mul = 1;
            while(n > 0){
                int r = n%10;
                sum += r*mul;
                n/=10;
                mul *=2;

            }
            System.out.println(sum);
    }
}
