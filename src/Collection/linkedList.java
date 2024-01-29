package Collection;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> name = new java.util.LinkedList<String>();
        name.add("Abhishek");
        name.add("ram");
        name.add("Abhi");
        name.add("Kishan");
//        System.out.println(name);
//        name.add("Shyam");
//        name.addFirst("Shyam Kumar");
//        name.addLast("Roshan");
//        System.out.println(name);
//        name.remove();//removing Element From Begning
//        System.out.println(name);
        for(String str: name){
            System.out.println(str);
        }

    }
}
