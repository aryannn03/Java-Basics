import java.util.*;
class Leap {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    if (y%400==0 || y%4==0 && y%100!=0)
{
    System.out.println("year is leap year");

}
else {
    System.out.println("year is not leap year");

}
sc.close();
    }
    
}
