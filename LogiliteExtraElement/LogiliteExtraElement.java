import java.util.*;
import java.util.stream.*;

public class LogiliteExtraElement{
    public static void main(String [] args){
        List<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
        listTwo.add(4);
        System.out.println(getExtraElement(listOne,listTwo));

        List<Integer> listThree = new ArrayList<>();
        listThree.add(1);
        listThree.add(3);
        listThree.add(2);
        List<Integer> listFour = new ArrayList<>();
        listFour.add(1);
        listFour.add(3);
        listFour.add(2);
        listFour.add(2);
        System.out.println(getExtraElement(listThree,listFour));
    }

    public static List<Integer> getExtraElement(List<Integer> listOne,List<Integer> listTwo){
        int sizeOne = listOne.size();
        int sizeTwo = listTwo.size();

        if(sizeOne>sizeTwo){
            for(Integer i : listTwo){
                if(listOne.contains(i)){
                    listOne.remove(i);
                }
            }
            return listOne;
        }else{
            for(Integer j : listOne){
                if(listTwo.contains(j)){
                    listTwo.remove(j);
                }
            }
            return listTwo;
        }
    }
}