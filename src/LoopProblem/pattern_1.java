package LoopProblem;

public class pattern_1 {
    public static void main(String[] args) {
        int n=4;
//        for(int i=1; i<=n;i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(j + " ");
//            }
//            System.out.print("\n");
//        }
//        ***************************************
//        for(int i=1; i<=n;i++){
//            for(int j=n; j>=1; j--){
//                System.out.print(j + " ");
//            }
//            System.out.print("\n");
//        }
//        ******************************************
//        int k  =1;
//        for(int i=1; i<=n;i++){
//            for(int j=n; j>=1; j--){
//                System.out.print(k++ + " ");
//            }
//            System.out.print("\n");
//        }
//        *********************************
//        for(int i=1;i<=n; i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//        *******************************************
//        for(int i=1;i<=n; i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }
//        **********************************
        int k=1;
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println(" ");
        }
//
    }
}
