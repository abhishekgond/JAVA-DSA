package Problem;

public class loopProblem6 {
    public static void main(String[] args) {
        int n =12345;
        int i=0;
        int r ,sum = 0;
        while(n>0){
            r = n%10;
            sum += r;
            n/=10;
            i++;
        }
        System.out.println("Number of digit " +i);
        System.out.println("Sum :"+ sum);
    }

}
