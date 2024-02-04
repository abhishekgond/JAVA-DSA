package Algorithum;

public class Kadane_s_algorithum {
    public static void main(String[] args) {
//        brut force approach
        // This algorithum gives Time Limit Exceeded
        // *********************************
        int new_sum=Integer.MIN_VALUE;
         int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
                  for(int i=0;i<arr.length;i++){
                      int sum = 0;
                      for(int j=i;j<arr.length;j++){
                          sum  = sum + arr[j];
                          if(sum>new_sum){
                              new_sum = sum;
                          }
                      }
                  }
        System.out.println(new_sum);
    }

}
