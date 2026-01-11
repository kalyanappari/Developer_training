public class CorporatePayroll {
    public static void main(String args[]){
        SeniorEmployee se=new SeniorEmployee(25000,20000,8000);
        System.out.println("Final Salary: "+se.calculateSalary());
    }
    
}

class Employee{
    private double salary;
    Employee(double salary){
        System.out.println("Base salary initialized");
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}

class SeniorEmployee extends Employee{
    private double salary;
    private double incentive;

    SeniorEmployee(double baseSalary,double salary,double incentive){
        super(baseSalary);
        System.out.println("Senior employee salary initialized");
        this.salary=salary;
        this.incentive=incentive;
    }
    public double calculateSalary(){
        System.out.println("Calculating total salary");
        salary=super.getSalary()+salary+incentive;
        return salary;
    }
}

