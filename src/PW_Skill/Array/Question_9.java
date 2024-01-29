package PW_Skill.Array;

public class Question_9 {
    public static void main(String[] args) {
        int arr[] = {23,45,67,78};
        //
        int j=arr.length-1;
        int i=0;
        while(i<=j){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int el : arr){
            System.out.print(" " +el);
        }
    }
}
