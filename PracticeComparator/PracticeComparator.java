import java.util.*;
import java.util.stream.*;

class Pojo{
    private String name;
    private int age;

    public Pojo(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
class PojoCompare implements Comparator<Pojo>{
    public int compare(Pojo one,Pojo two){
        return (one.getName()).compareTo(two.getName());
    }
}


public class PracticeComparator{
    public static void main(String [] args){
        List<Pojo> list = new ArrayList<>();
        list.add(new Pojo("Rachit",24));
        list.add(new Pojo("Naisargi",19));
        list.add(new Pojo("Priyam",20));
        list.add(new Pojo("Dhyey",12));
        Collections.sort(list,new PojoCompare());
        
        for(Pojo pojo : list){
            System.out.println(pojo.getName()+" "+pojo.getAge());
        }
    }

}