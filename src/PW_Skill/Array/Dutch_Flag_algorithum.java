package PW_Skill.Array;

public class Dutch_Flag_algorithum {
    public static void main(String[] args) {


//        first Method
//        int arr[] ={0,1,2,0,1,2,1,2,0,0};
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] =arr[j];
//                    arr[j] =temp;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(" " + arr[i]);
//        }
//        ************************
//         Second Method
//        int arr[] ={0,1,2,0,1,2,1,2,0,0};
//        int arr_new[] = new int[arr.length];
//         int no_zero=0,no_ones=0,no_tow=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] ==0){
//                no_zero ++;
//            }
//            if(arr[i] ==1){
//                no_ones++;
//            }
//            if(arr[i]==2){
//                no_tow++;
//            }
//        }
////        0-2
//        for(int i=0;i<no_zero;i++){
//            arr_new[i] = 0;
//        }
////        3-5
//        for(int i=no_zero;i<no_ones+no_zero;i++){
//            arr_new[i] = 1;
//        }
//        for(int i=no_ones+no_zero;i<no_ones+no_zero+no_tow;i++){
//            arr_new[i] = 2;
//        }
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(" " + arr_new[i]);
//        }
//        *******************************
//        Third method
        int arr[] ={0,1,2,0,1,2,1,2,0,0};
        int lo=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] =temp;
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
