public class OnilineExamSystem {

    public static void main(String[] args){

        Student s1 = new Student("Anita");

        ExamSession obj = new ExamSession(s1,new Result(35));

        obj.evaluate();
    }
}
class Student{

    private String name;

    Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
class Result{

    private int marks;

    Result(int marks){
        this.marks = marks;
    }

    public boolean isPass(){
        return marks >= 40;
    }
}
class ExamSession{

    private Student s1;
    private Result r1;

    ExamSession(Student s1,Result r1){
        this.s1 = s1;
        this.r1 = r1;
    }

    public void evaluate(){

        if(r1.isPass()){
            System.out.println(s1.getName() + " passed the exam");
        }
        else{
            System.out.println(s1.getName() + " failed the exam");
        }
    }
}
