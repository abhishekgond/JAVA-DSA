package PREPCODE;

import java.util.Scanner;

public class _2_all_prime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        int y = Sc.nextInt();
      for(int num = x; num<=y;num++){
          int count = 0;
          for(int n=2; n*n<=num;n++ ){
              if(num%n==0){
                  count ++;
                  break;
              }
          }
          if(count ==0){
              System.out.println(num);
          }
      }

    }
}
