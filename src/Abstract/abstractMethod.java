package Abstract;
abstract class Programing{
    abstract void Developer();
    abstract  void language();
}
class HTML extends Programing{
    @Override
    void Developer(){
        System.out.println("Tim Berners Lee");
    }
    void language(){
        System.out.println("HTML");
    }
}
class Java extends Programing {
    @Override
    void Developer(){
        System.out.println("Jemes Gosling");
    }
    void  language(){}

}
public class abstractMethod {
    public static void main(String[] args) {
        Java j = new Java();
        HTML h = new HTML();
        j.Developer();
        h.Developer();
    }
}
