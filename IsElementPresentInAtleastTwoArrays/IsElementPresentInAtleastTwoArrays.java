import java.util.*;
import java.util.stream.*;

public class IsElementPresentInAtleastTwoArrays{
    public static void main(String [] args){
        int arrOne [] = {1,2,3,9,8,7};
        int arrTwo [] = {4,1,2,10,15};
        int arrThree [] = {5,1,2,4,10};

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < arrOne.length ; i++){
            if(num == arrOne[i]){
                count++;
            }
        }
        for(int i = 0 ; i < arrTwo.length ; i++){
            if(num == arrTwo[i]){
                count++;
            }
        }
        for(int i = 0 ; i < arrThree.length ; i++){
            if(num == arrThree[i]){
                count++;
            }
        }
        if(count>=2){
            System.out.println("It's present in atleast 2 Arrays");
        }else{
            System.out.println("It's not present in atleast 2 Arrays");
        }
    }
}