package PW_Skill.Array;

public class Rotate_array_without_using_extera_array {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,60,70};
        int k=2;
        int p=arr.length-1;
        int j=arr.length-k;
         while(j<p){
             int temp = arr[j];
             arr[j] = arr[p];
             arr[p] = temp;
             j++;
             p--;
         }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print( " " +arr[i]);
        }
    }
}
