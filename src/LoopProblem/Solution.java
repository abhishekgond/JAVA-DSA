package LoopProblem;

class HelloWorld {
    public static void main(String[] args) {
        int n = 1001;
        int sum =0;
        int mul = 1;
        while(n != 0){
            int r = n%10;
            sum += r*mul;
            mul *=2;
            n/=10;
        }
        System.out.println(sum);
    }
}
