public class Employees {
    
    private String name;
    private String id;
    private int deptNo;

    Employees(String name,int deptNo,String id){
        this.name = name;
        this.id = id;
        this.deptNo = deptNo;
    }

    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public int getDeptNo(){
        return deptNo;
    }
}
