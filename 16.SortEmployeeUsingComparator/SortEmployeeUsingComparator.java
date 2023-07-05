import java.util.*;
import java.util.stream.*;

class Employee{
    private String name;
    private int age;

    public Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

class EmployeeNameComparator implements Comparator<Employee>{
    public int compare(Employee empOne,Employee empTwo){
        return empOne.getName().compareTo(empTwo.getName());
    }
}


public class SortEmployeeUsingComparator{
    public static void main(String [] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Rachit",24));
        list.add(new Employee("Naisargi",19));
        list.add(new Employee("Madhav",23));
        list.add(new Employee("Sagar",35));
        Collections.sort(list,new EmployeeNameComparator());

        for(Employee employee : list){
            System.out.println(employee.getName()+" "+employee.getAge());
        }

    }
}