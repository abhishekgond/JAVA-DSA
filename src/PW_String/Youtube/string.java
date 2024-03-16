package PW_String.Youtube;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the line ");
//        String word =sc.next();
//        System.out.println("Enter the word ");
//        System.out.println(" ");// why can not take input ?
//        String name = sc.nextLine();
//        System.out.println("word: "+word);
//        System.out.println("line : "+name);


//        Some String Function
        String Name = "gfgfdgerfGG ";
        System.out.println("ToLowerCase :"+Name.toLowerCase());
        Name = Name.toLowerCase();
        System.out.println(Name);
        System.out.println("ToUpperCase :"+Name.toUpperCase());
        System.out.println(Name.charAt(0));
        System.out.println(Name.indexOf('G'));
        System.out.println(Name.lastIndexOf('G'));
        char arr[] =Name.toCharArray();
        // printing char array
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        // compare To String
//        String first = "Abhishek";
//        String second = "Abhi";
//        System.out.println(" ");
//        System.out.println(first.compareTo(second));
//        System.out.println(second.compareTo(first));
//        System.out.println("Abhishek".compareTo("Abhishek"));
//        System.out.println(first.substring(2,4));
//        System.out.println(first.subSequence(0,7));
//        String address = "Gorakhpur, Jagdishpur, Uttar Pradesh,";
//        //Splitting array in small part
//        String Address[] = address.split(",");
//        for(int i=0;i<Address.length;i++){
//            System.out.print(" "+Address[i]);
//        }
//        System.out.println(" ");
//        String Email = "abhishekkumargond@gmail.com";
//        String arr3[] = Email.split("@");
//        String lastpart = arr3[arr3.length-1];
//        int lastIndex = lastpart.lastIndexOf('.');
//        System.out.println(lastpart.substring(0,lastIndex));
//
//
//        int lastIndex_ = Email.lastIndexOf("@");
//        int lastIndexdot = Email.lastIndexOf(".");
//        String subString = Email.substring(lastIndex_+1,lastIndexdot);
//        System.out.println(subString);

//        Concepts
/*        String are mutable in the Java
        ******* both Re Mutable  *********
        1.String Buffer(synchronized)
        2.String Builder (Non synchronized ) This is not Safe in the multiThread Envoirment  */
//        *************************************
//       Implimentation
//        StringBuilder name1 = new StringBuilder("Abhishek Kumar Gond ");
//        StringBuilder name2 = new StringBuilder("Abhishek Kumar Gond ");
//        StringBuilder name3 = new StringBuilder("Abhishek Kumar Gond ");
//        StringBuilder name4 =name1;
//        System.out.println(name1.equals(name2));
//        System.out.println(name2.equals(name3));
//        System.out.println(name3.equals(name4.equals(name1)));
//        System.out.println(name4.append("Gond"));
//        System.out.println(name1.equals(name4));


//        **************************************
//        System.out.println("Abhi"+34+43.4);
//        System.out.println((34.44+34+"34"));
//
//        *************************************************
//        String Formatting
//        double n = 34.5867797;
//        System.out.println(n);
//        System.out.printf("After Formatting : %.2f", n);
//        String name = String.format("My NAe is Abhishek Kumar Gond My Roll Number Is %d",2013);
//        String Address = "Abhishek ";
//        int num = 45;
//        System.out.printf("Name %2$s  Address %1$%d",num,Address);





    }
}
