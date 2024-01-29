package PW_Skill.Array;

import java.util.Arrays;

public class question_2 {
    public static void main(String[] args) {
        int arr[] = {23,45,3,45,67,87,6};
//        int max=-1;
//        for(int i=0;i<arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];
//            }
//        }
//        array shorting
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if (arr[j]<arr[i]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i]=temp;
//                }
//            }
//        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
