package LoopProblem;

public class Pattern_7 {
    public static void main(String[] args) {
        int n=4;
//        int k=1;
//        for(int i=1;i<=n; i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(k++);
//            }
//            System.out.println("");
//        }
        int row =1,col =1;
        while(row<=n){
            while(col<=row){
                System.out.print(col);
                col++;
            }
            System.out.print("\n");
            row++;
        }
    }
}