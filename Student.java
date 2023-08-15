import java.util.*;
public class Student {
Scanner sc = new Scanner(System.in);
String n,e;
int c,r,m1,m2,m3;
    void get(){
        System.out.println("Enter your name : ");
        n=sc.nextLine();
        System.out.println("Enter yout class : ");
        c=sc.nextInt();
        System.out.println("Enter your roll no. : ");
        r = sc.nextInt();
        System.out.println("Enter your email-id : ");
        sc.nextLine();
        e = sc.nextLine();
        System.out.println("Enter your Physics marks : ");
        m1 = sc.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        m2 = sc.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        m3 = sc.nextInt();
    }
    void display(){
        System.out.println("Name : "+n);
        System.out.println("Class : "+c);
        System.out.println("Roll no. : "+r);
        System.out.println("Email-id : "+e);
        float cal=(m1+m2+m3)/300f*100f;
        System.out.println("Your percentage : "+cal);

    }
    public static void main(String args[]){
    Student s=new Student();
    s.get();
    s.display();
   }
}