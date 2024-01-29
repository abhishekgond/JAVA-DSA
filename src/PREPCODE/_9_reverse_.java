package PREPCODE;

public class _9_reverse_ {
    public static void main(String[] args) {
       int n=21453;
        int count =0;
        int sum=0;
        while(n>0){
            int r = n%10;
            count ++;
            n/=10;
            sum += count * (int)Math.pow(10,r-1);
        }
        System.out.println(sum);

    }
}
