import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class Student implements Comparable<Student>{
    
    String name;
    int rollno;

    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public int compareTo(Student obj){
        return rollno - obj.rollno;
    }

    public String toString(){
        return name + " " + rollno;
    }
}
class CompareByName implements Comparator<Student>{

    public int compare(Student obj1,Student obj2){
        return obj1.name.compareToIgnoreCase(obj2.name);
    }
}
public class Main3 {
    
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Kalyan", 17));
        list.add(new Student("Nithin", 13));
        list.add(new Student("Ranga", 16));

        Collections.sort(list,new CompareByName());
        System.out.println(list);

    }
}