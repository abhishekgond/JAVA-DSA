package Collection;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();
        name.add("Shyam");
        name.add("Ram");
        name.add("Rohan"); // this is also valid in the stack
        name.push("Abhishek");
        name.push("Abhi");
        name.push("kishan");
        System.out.println(name);
        name.pop();
        System.out.println(name);

    }
}
