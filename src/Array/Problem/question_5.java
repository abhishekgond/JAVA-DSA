package Array.Problem;

public class question_5 {
    public static void main(String[] args) {
        int arr[] = {23,45,6,22,1,5,6,75,45,34,3};
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 6) {
                System.out.println("Index at " + i);
                break;
            }
        }
    }
}
