package Array;
//count the number of occurrences of a particular element x
public class _19_problem {
    static void count_Element(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
    static void lastOccurrences(int arr[],int x){
        int last =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                last = i;
            }
        }
        System.out.println(last);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,4,5,3,2,1,1,1};
        int x=1;
//        count_Element(arr,x);
        lastOccurrences(arr,x);
    }
}
