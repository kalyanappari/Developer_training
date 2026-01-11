public class GymMemberSolution{
    public static void main(String[] args){
        GymMember gm1=new GymMember(101,"Arjun");
        GymMember gm2=new GymMember(102,"Neha");
        GymMember gm3=new GymMember(103,"Ravi");
        gm1.display();
        gm2.display();
        gm3.display();
        System.out.println("Total Members: "+GymMember.totalMembers);
    }
}

class GymMember{
    int memberId;
    String memberName;
    int joiningFee=500;
    static int totalMembers=0;
    GymMember(int memberId,String memberName){
        this.memberId=memberId;
        this.memberName=memberName;
        totalMembers++;
    }
    public void display(){
        System.out.println(this.memberId+" "+this.memberName+" Fee: "+joiningFee);

    } 
}