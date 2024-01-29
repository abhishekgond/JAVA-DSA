package Array;

public class _8_problem {
    public static void main(String[] args) {
        int arr[] ={6,11,7,4,8};

        int temp[] = new int[arr.length];
        int i=arr.length-1,j=0;
        while(i>=0){
            temp[j] = arr[i];
            j++;
            i--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(temp[k] + " ");
        }
    }
}
