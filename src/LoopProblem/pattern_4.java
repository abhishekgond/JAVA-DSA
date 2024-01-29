package LoopProblem;

public class pattern_4 {
    public static void main(String[] args) {
        int n=  6;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                if((j+i) %2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println("");
        }

    }
}
