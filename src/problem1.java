import java.util.Scanner;
public class problem1{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int num = sc.nextInt();
        if((num%2==0) && (num%3==0)){
            System.out.println("This Number  is Even and Divisible by 3");
        }
        else{
            System.out.println("This Number Is Not Divisible By 3 ");
        }
    }
}
