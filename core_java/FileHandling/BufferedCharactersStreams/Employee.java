public class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id,String name,String dept,double salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Dept: " + dept + ", Salary: " + salary;
    }
}
