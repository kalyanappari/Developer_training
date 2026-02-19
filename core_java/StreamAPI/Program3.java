import java.util.*;
import java.util.stream.*;
public class Program3 {

    public static void main(String[] args){

        List<Employee> employees = List.of(
        new Employee(1, "Arun", 28, 60000),
        new Employee(2, "Bala", 35, 45000),
        new Employee(3, "Charan", 24, 52000),
        new Employee(4, "Deepak", 42, 70000),
        new Employee(5, "Eshwar", 30, 40000));

        Map<Boolean,List<Employee>> map = employees.stream()
                                                   .collect(Collectors.partitioningBy(obj -> obj.getSalary() > 50000));

        System.out.println(map);

        Map<Boolean,Long> res1 = employees.stream()
                                          .collect(Collectors.partitioningBy(obj -> obj.getAge() >= 30,Collectors.counting()));
        
        System.out.println(res1);

        Map<Boolean,List<String>> res2 = employees.stream()
                                                  .collect(Collectors.partitioningBy(obj -> obj.getSalary() > 50000,Collectors.mapping(Employee::getName,Collectors.toList())));

        System.out.println(res2);

    }
}
