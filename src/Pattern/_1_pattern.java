package Pattern;

public class _1_pattern {
    public static void main(String[] args) {
        int n=5;
        char x='A';
        for(int i=0;i<n;i++){
            for(int j=0; j<i;j++){
                System.out.print(x+i);
            }
            System.out.println("");
        }
    }
}
