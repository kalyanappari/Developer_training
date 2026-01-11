public class SchoolAndTeacher{
    public static void main(String args[]){
        Teacher t=new Teacher();
        School s=new School(t);

        s.setName("Meera");
        s.setSubject("Mathematics");
        s.setSchoolName("Green Valley School");

        s.SchoolDetails();
    }
}

class Teacher{
    private String name;
    private String subject;

    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setName(String name){
        this.name=name;
    }
    

    public void displayTeacher(){
        System.out.println("Teacher: "+name+", Subject: "+subject);
    }
}

class School{
    private String schoolName;
    Teacher teacher;

    School(Teacher teacher){
        this.teacher=teacher;
    }


    public void setName(String name){
        this.teacher.setName(name);
    }
    public void setSubject(String subject){
        this.teacher.setSubject(subject);
    }
    
    
    public void setSchoolName(String schoolName){
            this.schoolName=schoolName;
    }
    public void SchoolDetails(){
        System.out.print(schoolName+" - ");
        this.teacher.displayTeacher();
    }



}