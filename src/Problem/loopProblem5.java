package Problem;

public class loopProblem5 {
    public static void main(String[] args) {
        int j=1;
//        for(int i=1;i<=10;i++){
//            if(i == 3*j ){
//                j++;
//                continue;
//            }
//            else{
//                System.out.println(i);
//            }
//        }
        Myloop : for(int i=1;i<=10;i++){
            if(i%3==0 ){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
