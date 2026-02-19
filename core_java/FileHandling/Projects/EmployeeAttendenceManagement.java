import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Employee{

    int empId;
    String empName;

    Employee(int empId,String empName){
        this.empId = empId;
        this.empName = empName;
    }
}
class AttendenceRecord extends Employee{

    String date;
    String checkInTime;
    String checkOutTime;

    AttendenceRecord(int empId,String empName,String date,String checkInTime,String checkOutTime){
        super(empId,empName);
        this.date = date;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }
    public String toString(){
        return empId + "," + empName + "," + date + "," + checkInTime + "," + checkOutTime;
    }
}
class AttendanceFileSerive{

    String attendenceFilePath = "attendence.txt";

    public void writeAttendence(AttendenceRecord record){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(attendenceFilePath,true))){
            bw.write(record.toString());
            bw.newLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void readAllAttendence(){

        try(BufferedReader br = new BufferedReader(new FileReader(attendenceFilePath))){

            String line = "";

            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
    public void calculateWorkingHours(int empId){

        try(BufferedReader br = new BufferedReader(new FileReader(attendenceFilePath))){

            String line = "";

            int totalhours = 0;
            int totalmins = 0;

            while((line = br.readLine())!=null){
                
                String arr[] = line.split(",");

                if(arr[0].equals(""+empId)){

                    int hr1 = Integer.parseInt(arr[3].substring(0,2));
                    int min1 = Integer.parseInt(arr[3].substring(3,5));
                    int hr2 = Integer.parseInt(arr[4].substring(0,2));
                    int min2 = Integer.parseInt(arr[4].substring(3,5));

                    totalhours += Math.abs(hr1-hr2);
                    totalmins += Math.abs(min1-min2);
                }
            }
                if(totalmins != 0){
                    totalhours -= 1;
                    totalmins = 60 - totalmins;
                }

                System.out.println("Total Working Hours for Employee " + empId + ": " + totalhours + " hours " + totalmins + " minutes");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void searchAttendenceByDate(String date){

        try(BufferedReader br = new BufferedReader(new FileReader(attendenceFilePath))){

            System.out.println("Attendance on Date: " + date);

            String line = "";

            while((line = br.readLine())!=null){
                String recordSplit[] = line.split(",");
                if(recordSplit[2].equals(date)){
                    System.out.println(line);
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
public class EmployeeAttendenceManagement {

    public static void main(String[] args) {
        
        AttendenceRecord r1 = new AttendenceRecord(101,"John","2024-10-01","09:10","18:05");
        AttendenceRecord r2 = new AttendenceRecord(102,"Alice","2024-10-01","09:00","17:45");
        AttendenceRecord r3 = new AttendenceRecord(101,"John","2024-10-02","09:05","18:00");

        AttendanceFileSerive obj = new AttendanceFileSerive();

        obj.writeAttendence(r1);
        obj.writeAttendence(r2);
        obj.writeAttendence(r3);

        System.out.println("All Attendence Records:");
        obj.readAllAttendence();
        System.out.println();
        obj.calculateWorkingHours(101);
        System.out.println();
        obj.searchAttendenceByDate("2024-10-01");
    }
}
