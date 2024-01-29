import java.util.Scanner;
public class sumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Principle ammount ");
        float principle = sc.nextFloat();
        System.out.println("Enter Your Rate Of Interest ");
        float interest = sc.nextFloat();
        System.out.println("Enter Your Time Line");
        float Time = sc.nextFloat();
        float simpleInterest = (principle * interest * Time )/100;
        System.out.println("Principle "+ principle);
        System.out.println("ininterest "+interest);
        System.out.println("interest" + interest);
        System.out.println("Your Interest is "+simpleInterest);
        

    }
}
