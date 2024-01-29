package Array;

import java.util.Scanner;

public class _frequency {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr [] ={5,6,5,400,560,1000,400};
        int freq[] =new int[100000];
        int q =sc.nextInt();
        int arr_2[] = new int[q];
        int i=0;
        // Taking input
        while(q>0){
            arr_2[i++] = sc.nextInt();
            q--;
        }
        for(int j=0;j<arr_2.length;j++){
            freq[arr_2[i]]++;
        }
        for(int k=0;k<freq.length;k++){
            if (freq[k]>1) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }




    }
}
