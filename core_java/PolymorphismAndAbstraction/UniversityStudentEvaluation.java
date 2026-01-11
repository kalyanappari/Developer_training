package PolymorphismAndAbstraction;

public class UniversityStudentEvaluation {
    public static void main(String args[]){
        Student s1=new UnderGraduate(39);
        s1.evaluate();
        Student s2=new PostGraduate(74);
        s2.evaluate();
        Student s3=new ResearchScholar(82);
        s3.evaluate();
    }
}

abstract class Student{
    private int marks;

    Student(int marks){
        this.marks=marks;
    }

    public int getMarks(){
        return marks;
    }

    abstract void evaluate();
}

class UnderGraduate extends Student{
    UnderGraduate(int marks){
        super(marks);
    }

    void evaluate(){
        if(getMarks()>=40){
            System.out.println("Undergraduate Result: PASS");
        }else{
            System.out.println("Undergraduate Result: FAIL");
        }
    }
}

class PostGraduate extends UnderGraduate{
    PostGraduate(int marks){
        super(marks);
    }

    void evaluate(){
        if(getMarks()>=70){
            System.out.println("Postgraduate Grade: A");
        }else{
            System.out.println("Postgraduate Grade: B");
        }
    }
}

class  ResearchScholar extends PostGraduate{
    ResearchScholar(int marks){
        super(marks);
    }

    void evaluate(){
        if(getMarks()>=80){
            System.out.println("Research Status: APPROVED");
        }else{
            System.out.println("Research Status: REJECTED");
        }
    }
}