package Arrays_problem;

public class secondLargestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
//        int max = arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(max<arr[i]){
//                max = arr[i];
//            }
//        }
//        int second_largest = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=max && second_largest<max){
//                second_largest = arr[i];
//            }
//        }
//        System.out.println(second_largest);


//        This is optimal Solution
        int largest = arr[0];
        int secondLargest= -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
        }
        secondLargest =largest;
        System.out.println(secondLargest);
    }
}
