package PolymorphismAndAbstraction;

public class LoanEligibilityCheck {
    public static void main(String args[]){
        Customer c1=new Regular(720,555000);
        Regular r1=(Regular) c1;
        r1.isEligibleForLoan();
        System.out.println();

        Customer c2=new Premium(660,380000,200000);
        Premium p1=(Premium) c2;
        p1.isEligibleForLoan();
        System.out.println();

        Customer c3=new Business(690,900000,1500000);
        Business b1=(Business) c3;
        b1.isEligibleForLoan();
    }
}

class Customer{
    int creditScore;
    double annInc;

    Customer(int creditScore,double annInc){
        this.creditScore=creditScore;
        this.annInc=annInc;
    }

    int getCreditScore(){
        return creditScore;
    }

    double getAnnInc(){
        return annInc;
    }

    boolean isEligibleForLoan(){
        return false;
    }
}

class Regular extends Customer{
    Regular(int creditScore,double annInc){
        super(creditScore,annInc);
    }

    @Override
    boolean isEligibleForLoan(){
        if(creditScore>=720 && annInc>=550000){
            System.out.println("Regular customer eligibility checked");
            System.out.println("Regular Customer Loan Status: "+true);

            return true;
        }
        return false;
    }
}

class Premium extends Customer{
    double bonusLimit;

    Premium(int creditScore,double annInc,double bonusLimit){
        super(creditScore,annInc);
        this.bonusLimit=bonusLimit;
    }

    @Override
    boolean isEligibleForLoan(){
        if((creditScore>=660 && annInc>=380000) && bonusLimit>=200000){
            System.out.println("Premium customer eligible with bonus limit: "+bonusLimit);
            System.out.println("Premium Customer Loan Status: "+true);
            return true;
        }
        return false;
    }
}

class Business extends Customer{
    double annT;

    Business(int creditScore,double annInc,double annT){
        super(creditScore,annInc);
        this.annT=annT;
    }

    @Override
    boolean isEligibleForLoan(){
        if((creditScore>=660 && annInc>=380000) && annT>=1500000){
            System.out.println("Business customer eligibility checked");
            System.out.println("Business Customer Loan Status: "+true);
            return true;
        }
        return false;
    }
}
