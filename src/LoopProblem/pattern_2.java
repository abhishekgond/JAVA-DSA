package LoopProblem;
//Problem
//         A  A  A  A  A  A  A
//         A  B  B  B  B  B  A
//         A  B  C  C  C  B  A
//         A  B  C  C  C  B  A
//         A  B  C  C  C  B  A
//         A  B  B  B  B  B  A
//         A  A  A  A  A  A  A
public class pattern_2 {
    public static void main(String[] args) {
        int n = 7;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==1 || i==n ||j==1 || j==n){
//                    System.out.print(" A ");
//                }
//                else if(i==2 || i==n-1 || j==2 || j==n-1){
//                    System.out.print(" B ");
//                }
//                else{
//                    System.out.print(" C ");
//                }
////
//            }
//            System.out.println("");
//        }

//        ************************************

//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println("");
//        }
//        ***************************************************
        int count = 1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");

            }
            System.out.println("");
        }
    }
}
