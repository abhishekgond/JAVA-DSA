package Problem;

public class loopProblem7 {
    public static void main(String[] args) {
        int num = 12334578,r,mul = 10,reverse = 0;
        while(num>0){
            r = num%10;
            reverse = reverse*mul+r;
            num/=10;
        }
        System.out.println(reverse);
    }
}
