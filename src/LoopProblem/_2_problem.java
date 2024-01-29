package LoopProblem;

public class _2_problem {
    public static void main(String[] args) {

//        for(int i=1;i<=100;){
//            System.out.println(i);
//             i = i+3;
//        }
        int n=5,pow = 4,mul=1;
        for(int i=1;i<=pow;i++){
            mul *= n;
        }
        System.out.println(mul);
    }
}
