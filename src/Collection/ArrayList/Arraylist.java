package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        for(int i=0;i<=n;i++){
            int x = sc.nextInt();
            al.add(x);
        }
        for(int i=0;i<=n;i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.print(al + " ");
    }
}
