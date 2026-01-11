public class StudentMarksManagement{

    public static void main(String[] args){

        Student s1 = new Student("Ravi");

        s1.setMarks(85);

        s1.display();
    }
}
class Student{

    private String studentName;
    private int marks;

    Student(String studentName){
        this.studentName = studentName;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public void display(){
        System.out.println(studentName + " scored " + marks);
    }
}