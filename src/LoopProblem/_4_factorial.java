package LoopProblem;

public class _4_factorial {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int result = 1;
        while(i<=n){
            result *=i;
            i++;
        }
        System.out.println(result);
    }
}
