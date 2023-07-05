import java.util.*;
import java.util.stream.*;

public class HCF{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no. to find HCF : ");
        int one = sc.nextInt();
        System.out.println("Enter the secod no. to find LCM : ");
        int two = sc.nextInt();
        int min = Math.min(one,two);
        int ans = 1;
        for(int i = 2 ; i <= min ; i++ ){
            if(one%i==0 && two%i==0){
                if(ans<i){
                    ans=i;
                }
            }
        }
        if(one == 0 || two == 0){
                ans = Math.max(one,two);
        }
        System.out.println("The HCF will be : "+ans);
        
    }
}