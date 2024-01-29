package PW_Skill.Array;

import java.util.Scanner;

public class Question_{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // input taken 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<35){
                System.out.println(j);
            }
        }

    }
}
