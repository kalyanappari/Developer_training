import java.util.*;
import java.util.stream.*;
public class Program2 {

    public static void main(String[] args){

        List<Employees> list = new ArrayList<>();

        list.add(new Employees("Kalyan",1,"CAPB5"));
        list.add(new Employees("Sriram",1,"CAPB5"));
        list.add(new Employees("Ranga",2,"CAPB6"));
        list.add(new Employees("Nithin",2,"CAPB6"));
        list.add(new Employees("Billa",3,"CAPB7"));

        Map<Integer,List<String>> map = list.stream()
                                        .collect(Collectors.groupingBy(Employees::getDeptNo,Collectors.mapping(Employees::getName,Collectors.toList())));
        
        map.entrySet().stream()
                      .forEach(e -> System.out.println("Deptno: " + e.getKey() + "List: " + e.getValue()));

    }
}
