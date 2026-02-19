public class HospitalManagement {

    public static void main(String[] args){

        Doctor d1 = new Doctor("Dr. Karthik",42,301,"Cardiology","Heart Surgery");

        Nurse n1 = new Nurse("Suma",29,302,"Cardiology","Night");

        d1.displayPerson();
        d1.displayStaff();
        d1.treatPatient();
        System.out.println();
        n1.displayPerson();
        n1.displayStaff();
        n1.assistDoctor();
    }
}
class Person{

    private String name;
    private int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void displayPerson(){

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Staff extends Person{

    private int staffId;
    private String dept;

    Staff(String name,int age,int staffId,String dept){
        super(name,age);
        this.staffId = staffId;
        this.dept = dept;
    }

    public void displayStaff(){
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + dept);
    }
}
class Doctor extends Staff{

    private String specialization;

    Doctor(String name,int age,int staffId,String dept,String specialization){
        super(name,age,staffId,dept);
        this.specialization = specialization;
    }

    public void treatPatient(){

        System.out.println("Specialization: " + specialization);
        System.out.println("Doctor is treating a patient");
    }
}
class Nurse extends Staff{

    private String shift;

    Nurse(String name,int age,int staffId,String dept,String shift){
        super(name,age,staffId,dept);
        this.shift = shift;
    }

    public void assistDoctor(){
        System.out.println("Shift: " + shift);
        System.out.println("Nurse is assisting the doctor");
    }
}
