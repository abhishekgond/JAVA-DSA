import java.util.Scanner;
public class ConditionaInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The age ");
        int age = sc.nextInt();
        if(age <=12){
            if(age<=5){
                System.out.println("Toddler");
            }
            else{
                System.out.println("child");
            }
        }
        else if(age>12 && age<=18){
            System.out.println("You are Teenager ");
        }
        else{
            System.out.println("You are adult ");
        }
    }
}
