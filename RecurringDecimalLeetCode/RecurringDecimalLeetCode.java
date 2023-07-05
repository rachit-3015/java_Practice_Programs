import java.util.*;
import java.util.stream.*;

public class RecurringDecimalLeetCode{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator : ");
        int num = sc.nextInt();
        System.out.println("Enter denominator : ");
        int denom = sc.nextInt();
        System.out.println(solution(num,denom));

    }

    private static String solution(int num,int denom){
        StringBuilder sb = new StringBuilder();
        int q = num/denom;
        int r = num%denom;
        sb.append(q);

        if(r==0){
            return sb.toString();
        }else{
            sb.append(".");
            Map<Integer,Integer> map = new HashMap<>();
            while(r!=0){
                if(map.containsKey(r)){
                    int len = map.get(r);       
                    sb.insert(len,"(");
                    sb.append(")");
                    break;
                }else{
                     map.put(r,sb.length());
                     r = r * 10;
                     q = r / denom;
                     r = r % denom;
                     sb.append(q);
                }
            }
        }
        return sb.toString();
    }
}