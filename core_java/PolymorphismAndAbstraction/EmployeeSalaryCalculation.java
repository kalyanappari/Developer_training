package PolymorphismAndAbstraction;

public class EmployeeSalaryCalculation {
    public static void main(String args[]){
        Employee e1=new FullTimeEmployee(60000);
        System.out.println("Full Time Salary: "+e1.calculateSalary());
        Employee e2=new PartTimeEmployee(500,20);
        System.out.println("Part Time Salary: "+e2.calculateSalary());

    }
}

abstract class Employee{
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    double salary;
    FullTimeEmployee(double salary){
        this.salary=salary;
    }
    public double calculateSalary(){
        return salary;
    }
}

class PartTimeEmployee extends Employee{
    double salary;
    double wage;
    int days;

    PartTimeEmployee(double wage,int days){
        this.wage=wage;
        this.days=days;
    }
    double calculateSalary(){
        return wage*days;
    }
}