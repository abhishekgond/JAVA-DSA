package Array;

public class _10_prefix_sum {
    public static void main(String[] args) {
//        prefix sum
        int arr[] = {2,1,3,4,5};
//        int ans[] = new int[arr.length];
        int j=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
//            ans[j++] = sum; // when we Using Extra Array
            arr[j++] = sum;
        }
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }
//        without using Extra Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
