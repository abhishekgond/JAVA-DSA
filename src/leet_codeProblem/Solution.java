package leet_codeProblem;

import java.util.Scanner;

public class Solution {
    public int numberOfMatches(int n) {
        int m=0,t=0;
        while(n>1){
            if(n%2==0){
                m+=n/2;
                n=n/2;
            }
            else{

                m+=(n-1)/2;
                n=((n-1)/2)+1;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution obj = new Solution();
        int n= 7;
        int x = obj.numberOfMatches(n);
        System.out.println(x);
    }
}
