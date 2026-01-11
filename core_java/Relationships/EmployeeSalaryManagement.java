public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee(101, "Meena", 50000);
        pe.displayEmployee();
        pe.calculateSalary();

        ContractEmployee ce = new ContractEmployee(102, "Ravi", 800, 20);
        ce.displayEmployee();
        ce.calculateSalary();
    }
}

class Employee {
    protected int empId;
    protected String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

class PermanentEmployee extends Employee {
    private double monthlySalary;

    PermanentEmployee(int empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    public void calculateSalary() {
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class ContractEmployee extends Employee {
    private double dailyWage;
    private int daysWorked;

    ContractEmployee(int empId, String name, double dailyWage, int daysWorked) {
        super(empId, name);
        this.dailyWage = dailyWage;
        this.daysWorked = daysWorked;
    }

    public void calculateSalary() {
        System.out.println("Salary: " + (dailyWage * daysWorked));
    }
}