import java.util.*;
import java.util.stream.*;

public class LCM{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no. to find LCM : ");
        int one = sc.nextInt();
        System.out.println("Enter the second no. to find LCM : ");
        int two = sc.nextInt();
        int count = Math.max(one,two);
        if(one == 0 || two == 0){
            count=0;
            System.out.println("The LCM will be : "+count);
            return;
        }
        while(count%one!=0 || count%two!=0){
            count++;
        }
        System.out.println("The LCM will be : "+count);
    }
}