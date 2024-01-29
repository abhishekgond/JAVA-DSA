package PW_Skill.Array;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {30,56,34,23,12,90};
        int k=5;
        int j=0;
        int arr_new [] = new int[arr.length];
        for(int i= arr.length-k;i<arr.length;i++){
            arr_new[j++] = arr[i];
        }
        for(int i=0;i<=arr.length-k-1;i++){
          arr_new[j++] = arr[i];
        }
        for(int i=0;i<arr_new.length;i++){
            System.out.print(" " + arr_new[i]);
        }
    }
}
