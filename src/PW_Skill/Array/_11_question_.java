package PW_Skill.Array;

public class _11_question_ {
    // Sort The array of 0`s and 1`s.
    public static void main(String[] args) {
        int arr[] ={1,0,0,1,1,1,0,0,1,0};
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] =temp;

                }
            }
        }


        // second method
        // Using Two pinter or Two Variable approach
        int i=0,j=arr.length-1;
        while(i<j){
            if(i>=j) break;
            if(arr[i]==0){
                i++;
            }
            else if(arr[j] ==1){
                j--;
            }
            else if(arr[i]>arr[j]){
                int temp =arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                i++;
                j--;

            }


        }
        for(int k=0;k<arr.length;k++){
            System.out.print("  "+arr[k]);
        }
    }
}
