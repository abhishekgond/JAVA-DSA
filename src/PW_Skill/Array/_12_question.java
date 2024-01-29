package PW_Skill.Array;

public class _12_question {
    // important
    public static void main(String[] args) {
        int arr_1[] = {11,33,42,71,89,90,156,265,354,487};
        int arr_2[] = {26,54,69,81,90,567};
        int n  =arr_1.length+arr_2.length;
        int arr[] = new int[n];
        // Approach
        int k=0;
        int i=0,j=0;
        for(;k<arr.length;k++){
            // for overloading control
            if(i==arr_1.length){
                while(j<arr_2.length){
                    arr[k++]=arr_2[j++];
                }
            }
            else if(j==arr_2.length){
                while(i<arr_1.length){
                    arr[k++] =arr_1[i++];
                }
            }
            else if(arr_1[i] <= arr_2[j]){
                arr[k] = arr_1[i++];
            }
            else{
                arr[k] =arr_2[j++];
            }
        }


        for(int s=0;s<arr.length;s++){
            System.out.print(arr[s]+" ");
        }


    }
}
