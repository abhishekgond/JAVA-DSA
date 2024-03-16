package oops_by_kunal.introduction;

import java.util.Scanner;

class   Student{
    static void student_fun(){
        System.out.println("Hello");
    }
    void fun1(){
        // instance variable function
        // none static function
        // object member variable
    }

    int roll;
    String name;
    float marks;
}
public class first {
    public static void main(String[] args) {
        Student.student_fun(); // using static variable using dot . Oprater
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name ");
        s1.name=sc.nextLine();
        s1.roll=sc.nextInt();
        s1.marks=sc.nextFloat();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.marks);



    }
}
