package PW_String;

public class Question_7 {
    public static void ShortestDestination(String str){
        int i=0,x=0,y=0;
        while(i<str.length()){
            switch(str.charAt(i)){
                case 'N':
                    y=y+1;
                    break;
                case 'S':
                    y=y-1;
                    break;
                case 'E':
                    x=x+1;
                    break;
                case 'W':
                    x=x-1;
                    break;
                default:
                    System.out.println("Enter Valid Character ");
                    break;
            }
            i++;
        }
        int ans = x*x + y*y;
        System.out.println((int)Math.sqrt(ans));
    }
    public static void main(String[] args) {
        String str = "WE";
        ShortestDestination(str);


    }
}
