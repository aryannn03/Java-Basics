import java.util.*;
public class sum_of_odd_even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long odd=0;
        long even=0;
        int n=1;
        long N=sc.nextLong();
        while(N!=0){
            long val=N%10;
            if(n%2!=0){
                odd+=val;
                n++;
            }
            else{
                even+=val;
                n++;
            }
            N=N/10;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}