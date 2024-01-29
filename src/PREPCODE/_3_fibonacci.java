package PREPCODE;

public class _3_fibonacci {
    public static void main(String[] args) {
        int n =10,i=1,a=0,b=1,c;
        while(i<=n){
            System.out.println(a);
            c = a+b;
            a=b;
            b=c;
            i++;
        }
    }
}
