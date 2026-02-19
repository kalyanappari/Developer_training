public class UniversityManagement{
    public static void main(String[] args){

        System.out.println("=== UNIVERSITY STUDENT MANAGEMENT SYSTEM ===\n");
        University.displayUniversityInfo();

        System.out.println();

        Student s1 = new Student("Alice Johnson","Computer Science");
        Student s2 = new Student("Bob Smith","Mathematics",3.2);
        Student s3 = new Student("Carol Davis","Physics",3.8);

        s1.updateGPA(3.7,3);
        s2.updateGPA(3.9,4);
        s3.updateGPA(3.6,3);

        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
        System.out.println();
        s3.displayStudentInfo();
        System.out.println();

        University.updateAcademicYear("2025-2026");
        System.out.println();
        System.out.println("Is GPA 1.5 passing? "+ University.isPassingGrade(1.5));
        System.out.println("Is GPA 2.5 passing? "+ University.isPassingGrade(2.5));
        System.out.println();
        System.out.println("University Total Students : " + University.getTotalStudents());
        System.out.println("Student 1 Courses : " + s1.getCourseEnrolled());
        System.out.println("Student 2 Courses : " + s2.getCourseEnrolled());

        System.out.println();
        University.displayUniversityInfo();
    }
}
class University{

    static int totalStudents=0;
    static final String UNIVERSITY_CODE = "UNI-2024";
    static String currentAcademicYear = "2024-2025";
    static double minPassingGrade = 2.0;

    public static void displayUniversityInfo(){
        System.out.println("=== UNIVERSITY INFORMATION ===");
        System.out.println("University Code: " + UNIVERSITY_CODE);
        System.out.println("Academic Year: " + currentAcademicYear);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Minimum Passing Grade: " + minPassingGrade); 
    }
    public static void updateAcademicYear(String newAcademinYear){
        currentAcademicYear = newAcademinYear;
        System.out.println("Academic year updated to: " + newAcademinYear);
    }
    public static boolean isPassingGrade(double gpa){
        return gpa >= minPassingGrade;
    }
    public static int getTotalStudents(){
        return totalStudents;
    }

    static {
        System.out.println("University class loaded and initialized Setting up university system...\n");
    }


}
class Student{

    static int nextStudentNumber = 1000;
    String studentId = "STU-";
    String name;
    String major;
    double gpa;
    int coursesEnrolled;

    static{
        System.out.println("Student class loaded and initialized");
    }

    {
        University.totalStudents++;
        System.out.println("\nCreating a new student object...");
        studentId += nextStudentNumber++;
        System.out.println("Student created: " + studentId);
        coursesEnrolled = 0;
        gpa = 0.0;
    }

    Student(String name,String major){
        this.name = name;
        this.major = major;
    }
    Student(String name,String major,double initialGpa){
        this.name = name;
        this.major = major;
        gpa = initialGpa;
    }
    public void displayStudentInfo(){

        System.out.println("=== STUDENT INFORMATION ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Courses Enrolled: " + getCourseEnrolled());
        if(University.isPassingGrade(gpa)){
            System.out.println("Passing Status: PASSING");
        }
        else{
            System.out.println("Passing Status: FAILING");
        }
        if(isOnDeanList()){
            System.out.println("Dean's List: YES");
        }
        else{
            System.out.println("Dean's List: NO");
        }
    }
    public void updateGPA(double newGrade,int creditHours){
        enrollCourse(creditHours);
        gpa = newGrade;
        System.out.println(name + "'s GPA updated to: " + newGrade + "\n");
    }
    public void enrollCourse(int creditHours){
        coursesEnrolled = creditHours;
        System.out.println(name + " enrolled in a " + creditHours + " credit hour course\n");
    }
    public boolean isOnDeanList(){
        return this.gpa >= 3.5;
    }
    public int getCourseEnrolled(){
        return coursesEnrolled;
    }
}
