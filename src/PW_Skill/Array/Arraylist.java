package PW_Skill.Array;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> sc = new ArrayList<Integer>();
        sc.add(69);
        sc.add(6567);
        sc.add(69);
        for(int i=0;i<sc.size();i++){
            System.out.println(sc.get(i));
        }
    }
}
