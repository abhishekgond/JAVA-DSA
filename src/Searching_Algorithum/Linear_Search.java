package Searching_Algorithum;

public class Linear_Search {

    public static void linear_Search_on_2d_matrix(int arr[][],int target,boolean findLast){
        int outerIndex=-1;
        int innerIndex=-1;
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    outerIndex=i;
                    innerIndex=j;
                    if(findLast==false){
                        found = true;
                        break;
                    }
                }
            }
            if(found==true){
                break;
            }
        }
        if(outerIndex==-1){
            System.out.println("not Present");
        }
        else{
            System.out.println("Present : "+outerIndex+","+innerIndex);
        }
    }
    public static void findTheMaxSumOfSubArray(int arr[][]){
        int sum = 0,check=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
                check = sum;
                if(check<sum){
                    check=sum;

                }
            }
        }
        System.out.println(check);
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,4,15},
                {16,17,18,19,20}
        };
        int target=4;
        linear_Search_on_2d_matrix(arr,target,false);
        linear_Search_on_2d_matrix(arr,target,true);
        findTheMaxSumOfSubArray(arr);
    }
}
