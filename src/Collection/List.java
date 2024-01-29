package Collection;
import java.util.ArrayList;
public class List
{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Abhishek");
        name.add("Ram");
        name.add("Shyam");
        System.out.println(name);
        name.add("kishan");
        System.out.println(name);
        name.remove(3);
        System.out.println(name);
        name.set(0,"vishwajeet");
        System.out.println(name);


    }
}
