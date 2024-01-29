package Method;
import java.util.Scanner;
class Area{
    float circle(float r){
        float pi = 3.14f;
        float area = (pi * r*r);
        return area;
    }

}
public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();
        int a =sc.nextInt();
        float circleArea = area.circle(a);
        System.out.println(circleArea);

    }
}
