package Problem;
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Grade ");
        int Grade = sc.nextInt();
        if(Grade>=90 && Grade<=100){
            System.out.println("Excellent");
        }
        else if(Grade>=80 && Grade<90){
            System.out.println("Mark above 80 and less Then 90");
        }
        else if(Grade>=70 && Grade<80){
            System.out.println("mark is Grater Then 70 and less then 80 ");
        }
        else if(Grade>=60 && Grade<70){
            System.out.println("mark is Grater Then 60 and less then 70 ");
        }
        else if(Grade<60){
            System.out.println("mark is less then  60 . print below par ");
        }
        else{
            System.out.println("Enter Valid Grade ");
        }
    }
}
