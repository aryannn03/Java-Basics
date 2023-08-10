import java.util.*;
class Largest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int x=sc.nextInt();
        System.out.print("Enter the second number = ");
        int y=sc.nextInt();
        System.out.print("Enter the third number = ");
        int z=sc.nextInt();
        int k= x>y && x>z?x: y>x && y>z?y: z ;
        
            System.out.print(k+" is the largest");
            sc.close();
            
    }
}