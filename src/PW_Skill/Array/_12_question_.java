package PW_Skill.Array;

public class _12_question_ {
    public static void main(String[] args) {
//        int arr[] ={1,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,0};
        int arr[] ={12,8,41,37,2,49,16,28,21};
        int new_arr[] = new int[arr.length];

        // BootForce Approach
//        new_arr[new_arr.length-1] = -1;
//        for(int i=0;i<arr.length;i++){
//            int n=Integer.MIN_VALUE;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]>n){
//                    n= arr[j];
//                }
//                new_arr[i] = n;
//            }
//
//        }
//        for(int k=0;k<new_arr.length;k++){
//            System.out.print(" " + new_arr[k]);
//        }
//        ***********************************************

        // second method
//        from rivers side of array
        new_arr[new_arr.length-1] =-1;
        int nextG = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            new_arr[i] = nextG;
            nextG = Math.max(arr[i],nextG);
        }

        for(int k=0;k<new_arr.length;k++){
            System.out.print(" " + new_arr[k]);
        }
    }
}
