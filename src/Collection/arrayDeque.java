package Collection;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> name = new ArrayDeque<>();
        name.add("Abhishek");
        name.add("Abhishek Kumar ");
        name.add("Abhishek Gond ");
        name.pop();
        System.out.println(name);
    }
}
